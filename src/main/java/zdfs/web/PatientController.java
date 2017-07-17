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
	@RequestMapping(path="/findByDoctorId/doctorId={doctorId}",method=RequestMethod.GET)
	public List<PatientT> findByDoctorId(@PathVariable("doctorId") int doctorId) {
		
		log.info("doctorId:"+doctorId);

		return pService.findByDoctorId(doctorId);
		

	}

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
	
	@ResponseBody
	@RequestMapping(path="/importPatientInfo/memberId={memberId}&doctorId={doctorId}",method=RequestMethod.GET)
	public Map<String, Object> importPatientInfoByMemberId(@PathVariable("memberId") int memberId,@PathVariable("doctorId") int doctorId){
		MembersInfo mi=miService.findByMemberId(memberId);
		
		
		Map<String, Object> result=new HashMap<>();
		
		if(mi!=null){
			int age=AgeUtil.computeAgeByBirthday(mi.getBirthday());
			PatientT p=new PatientT(mi.getMembersname(), mi.getSex(), age, memberId, doctorId);
			pService.add(p);
			result.put("is_success", 1);
			result.put("patient", p);
		}else{
			result.put("is_success", 0);
			result.put("reason", "membersInfo not exists!");
		}
		
		return result;
	}
}
