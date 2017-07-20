package zdfs.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import zdfs.model.PatientT;
import zdfs.service.IPatientService;
import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BpData;
import zdfs.tf02.model.EcgData;
import zdfs.tf02.model.GluData;
import zdfs.tf02.model.Rspo2Data;
import zdfs.tf02.model.TodayRemind;
import zdfs.tf02.service.IHealthDataService;
import zdfs.tf02.service.impl.HealthDataService;
import zdfs.web.param.HealthDataParam;
import zdfs.web.param.ResponseParam;

@RestController
@RequestMapping(path="/healthData")
public class HealthDataController {

	@Autowired
	private IHealthDataService hdService;
	@Autowired
	private IPatientService pService;
	
	public HealthDataController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping(path="/findEcgDataByDateRange",method=RequestMethod.POST)
	public ResponseParam<EcgData> findEcgData(@RequestBody HealthDataParam data) throws ParseException{
		
		Date startDate=parseDateStrToDate(data.getStartDateStr());
		Date endDate=parseDateStrToDate(data.getEndDateStr());
		
		List<EcgData> dList= hdService.findEcgDataByDateRange(data.getMemberId(), startDate, endDate);
		return new ResponseParam<>(dList);
	}

	@RequestMapping(path="/findBpDataByDateRange",method=RequestMethod.POST)
	public ResponseParam<BpData> findBpData(@RequestBody HealthDataParam data) throws ParseException{
		Date startDate=parseDateStrToDate(data.getStartDateStr());
		Date endDate=parseDateStrToDate(data.getEndDateStr());
		
		List<BpData> dList=hdService.findBpDataByDateRange(data.getMemberId(), startDate, endDate);
		return new ResponseParam<>(dList);
	}
	
	@RequestMapping(path="/findBfDataByDateRange",method=RequestMethod.POST)
	public ResponseParam<BfData> findBfData(@RequestBody HealthDataParam data) throws ParseException{
		Date startDate=parseDateStrToDate(data.getStartDateStr());
		Date endDate=parseDateStrToDate(data.getEndDateStr());
		
		List<BfData> dList=hdService.findBfDataByDateRange(data.getMemberId(), startDate, endDate);
		return new ResponseParam<>(dList);
	}
	
	@RequestMapping(path="/findRspo2DataByDateRange",method=RequestMethod.POST)
	public ResponseParam<Rspo2Data> findRspo2Data(@RequestBody HealthDataParam data) throws ParseException{
		Date startDate=parseDateStrToDate(data.getStartDateStr());
		Date endDate=parseDateStrToDate(data.getEndDateStr());
		
		List<Rspo2Data> dList= hdService.findRspo2DataByDateRange(data.getMemberId(), startDate, endDate);
		return new ResponseParam<>(dList);
	}
	
	@RequestMapping(path="/findGluDataByDateRange",method=RequestMethod.POST)
	public ResponseParam<GluData> findGluData(@RequestBody HealthDataParam data) throws ParseException{
		Date startDate=parseDateStrToDate(data.getStartDateStr());
		Date endDate=parseDateStrToDate(data.getEndDateStr());
		
		List<GluData> dList= hdService.findGluDataByDateRange(data.getMemberId(), startDate, endDate);
		return new ResponseParam<>(dList);
	}
	
	
	@RequestMapping(path="/findTodayRemind/memberId={memberId}",method=RequestMethod.POST)
	public ResponseParam<TodayRemind> findTodayRemind(@PathVariable("memberId") int memberId){
		List<TodayRemind> dataList=hdService.findTodayRemindByMemberId(memberId);
		return new ResponseParam<>(dataList);
	}
	
	 @RequestMapping(path="/findTodayRemind/doctorId={doctorId}")
	 public ResponseParam<TodayRemind> findTodayRemindByDoctorId(@PathVariable("doctorId") int doctorId){
		 List<PatientT> pList=pService.findByDoctorId(doctorId);
		 
		 List<TodayRemind> dataList=new ArrayList<>();
		 for(PatientT p:pList){
			 List<TodayRemind> trList=hdService.findTodayRemindByMemberId(p.getMember_id());
			 if(trList!=null && trList.size()>0){
				 dataList.addAll(trList);
			 }
		 }
		 
		 return new ResponseParam<>(dataList);
	 }
	 
	 
	 Date parseDateStrToDate(String dateStr) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(dateStr);
	}
	 

}
