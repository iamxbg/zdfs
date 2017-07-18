package zdfs.web;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import zdfs.model.PatientT;
import zdfs.service.IPatientService;
import zdfs.tf02.model.MembersInfo;
import zdfs.tf02.service.IMembersInfoService;
import zdfs.util.AgeUtil;

@Controller
@RequestMapping(path="/patient")
public class PatientController {

	@Autowired
	private IPatientService pService;
	@Autowired
	private IMembersInfoService miService;
	
	private static Logger log=LogManager.getLogger();
	
	public PatientController() {
		// TODO Auto-generated constructor stub
	}

	
	@ResponseBody
	@RequestMapping(path="/findByDoctorId/{doctorId}",method=RequestMethod.GET)
	public List<PatientT> findByDoctorId(@PathVariable("doctorId") int doctorId) {

		return pService.findByDoctorId(doctorId);
	
	}
	
	@ResponseBody
	@RequestMapping(path="/create")
	public Map<String, Object> create(@RequestBody PatientT patient){
		pService.add(patient);
		Map<String,Object> resultMap=new HashMap<>();
		resultMap.put("is_success", 1);
		resultMap.put("patient", patient);
		
		return resultMap;
	}
	
	
	@ResponseBody
	@RequestMapping(path="/getProfileByMemberId/{memberId}",method=RequestMethod.GET)
	public Map<String, Object> findPatientProfileByMemberId(@PathVariable("memberId") int memberId){
		MembersInfo mi=miService.findByMemberId(memberId);
		Map<String, Object> resultMap=new HashMap<>();
			
		if(mi!=null){
			
			int age=AgeUtil.computeAgeByBirthday(mi.getBirthday());
			PatientT patient=new PatientT(mi.getMembersname(), mi.getSex(), age, mi.getId(), 0);
			resultMap.put("is_success", 1);
			resultMap.put("patient", patient);
		}else{
			resultMap.put("is_success", 0);
			resultMap.put("reason", "Not Found!");
		}
		return resultMap;
	}

	

	@Deprecated
	@ResponseBody
	@RequestMapping("/searchByName/doctorId={doctorId}&type={type}&message={message}")
	public List<PatientT> searchByMessage(@PathVariable("doctorId") int doctorId,@PathVariable("type") String type,@PathVariable("message") Object message){
			if("ZH_shebaohao".equals(type)){
				return null;
			}else if("name".equals(type)){
				return pService.findByDoctorIdAndNameLike(doctorId, String.valueOf(message));
			}
			return null;
		
	}
	

}
