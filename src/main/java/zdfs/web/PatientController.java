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
import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BpData;
import zdfs.tf02.model.EcgData;
import zdfs.tf02.model.GluData;
import zdfs.tf02.model.MembersInfo;
import zdfs.tf02.model.Rspo2Data;
import zdfs.tf02.service.IHealthDataService;
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
	
	@Autowired
	private IHealthDataService hService;
	
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
	@RequestMapping(path="/findByExample",method=RequestMethod.POST)
	public ResponseParam<PatientT> findByExample(@RequestBody PatientT patient){
		pService.findMyPatients(doctorId, patientName, socialCard, date)
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

	@ResponseBody
	@RequestMapping(path="/findPatientDetails/patientId={patientId}")
	public Map<String, Object> findPatientDetails(@PathVariable("patientId") int patientId){
		PatientT p=pService.findById(patientId);
		Map<String, Object> resultMap=new HashMap<>();
		if(p!=null){ 
			int memberId=p.getMember_id();
			
			resultMap.put("patient", p);
			
			//Dignoase Info
			
			
			//the time of lastest video 
			
			//health data
			BfData bfData=hService.findLastestBfData(memberId);
			BpData bpData=hService.findLastestBpData(memberId);
			GluData gluData=hService.findLastestGluData(memberId);
			EcgData ecgData=hService.findLastestEcgData(memberId);
			Rspo2Data rspo2Data=hService.findLastestRspo2Data(memberId);
			
			resultMap.put("bf", bfData);
			resultMap.put("gluData", gluData);
			resultMap.put("ecg", ecgData);
			resultMap.put("rspo2", rspo2Data);
			resultMap.put("bp", bpData);
			
			return resultMap;
			
		}else{
			resultMap.put("code", 1);
			resultMap.put("info", "User not exists!");
			
			return resultMap;
		}
		
		
		

	}

	

}
