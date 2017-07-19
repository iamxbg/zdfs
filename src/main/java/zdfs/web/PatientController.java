package zdfs.web;

import java.util.ArrayList;
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
import zdfs.web.param.ResponseParam;

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
	public ResponseParam<PatientT> findByDoctorId(@PathVariable("doctorId") int doctorId) {


		List<PatientT> dList= pService.findByDoctorId(doctorId);
		
		return new ResponseParam<>(dList);
	
	}
	
	@ResponseBody
	@RequestMapping(path="/create")
	public ResponseParam<PatientT> create(@RequestBody PatientT patient){
		
		ResponseParam<PatientT> resp=new ResponseParam<>();
			pService.add(patient);
			List<PatientT> dList=new ArrayList<>();
				dList.add(patient);
			resp.setData(dList);
		return resp;
	}
	
	
	@ResponseBody
	@RequestMapping(path="/getProfileByMemberId/memberId={memberId}",method=RequestMethod.GET)
	public ResponseParam<PatientT> findPatientProfileByMemberId(@PathVariable("memberId") int memberId){
		MembersInfo mi=miService.findByMemberId(memberId);
		//Map<String, Object> resultMap=new HashMap<>();

		ResponseParam<PatientT> resp=new ResponseParam<>();
		
		if(mi!=null){
			
			int age=AgeUtil.computeAgeByBirthday(mi.getBirthday());
			PatientT patient=new PatientT(mi.getMembersname(), mi.getSex(), age, mi.getId(), 0);
			List<PatientT> pList=new ArrayList<PatientT>();
				pList.add(patient);
			resp.setData(pList);
			
		}else{
			resp.setCode(1);
			resp.setInfo("Not Found!");
		}
		return resp;
	}


	

}
