package zdfs.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BpData;
import zdfs.tf02.model.EcgData;
import zdfs.tf02.model.GluData;
import zdfs.tf02.model.Rspo2Data;
import zdfs.tf02.service.IHealthDataService;
import zdfs.tf02.service.impl.HealthDataService;

@Controller
@RequestMapping(path="/healthData")
public class HealthDataController {

	@Autowired
	private IHealthDataService hdService;
	
	public HealthDataController() {
		// TODO Auto-generated constructor stub
	}
	
	@ResponseBody
	@RequestMapping(path="/findEcgDataByDateRange",method=RequestMethod.POST)
	public List<EcgData> findEcgData(int memberId,String startDateStr,String endDateStr) throws ParseException{
		
		Date startDate=parseDateStrToDate(startDateStr);
		Date endDate=parseDateStrToDate(endDateStr);
		
		return hdService.findEcgDataByDateRange(memberId, startDate, endDate);
	}

	@RequestMapping(path="/findBpDataByDateRange",method=RequestMethod.POST)
	public List<BpData> findBpData(int memberId,String startDateStr,String endDateStr) throws ParseException{
		Date startDate=parseDateStrToDate(startDateStr);
		Date endDate=parseDateStrToDate(endDateStr);
		
		return hdService.findBpDataByDateRange(memberId, startDate, endDate);
	}
	
	@RequestMapping(path="/findBfDataByDateRange",method=RequestMethod.POST)
	public List<BfData> findBfData(int memberId,String startDateStr,String endDateStr) throws ParseException{
		Date startDate=parseDateStrToDate(startDateStr);
		Date endDate=parseDateStrToDate(endDateStr);
		
		return hdService.findBfDataByDateRange(memberId, startDate, endDate);
	}
	
	@RequestMapping(path="/findRspo2DataByDateRange",method=RequestMethod.POST)
	public List<Rspo2Data> findRspo2Data(int memberId,String startDateStr,String endDateStr) throws ParseException{
		Date startDate=parseDateStrToDate(startDateStr);
		Date endDate=parseDateStrToDate(endDateStr);
		
		return hdService.findRspo2DataByDateRange(memberId, startDate, endDate);
	}
	
	@RequestMapping(path="/findGluDataByDateRange",method=RequestMethod.POST)
	public List<GluData> findGluData(int memberId,String startDateStr,String endDateStr) throws ParseException{
		Date startDate=parseDateStrToDate(startDateStr);
		Date endDate=parseDateStrToDate(endDateStr);
		
		return hdService.findGluDataByDateRange(memberId, startDate, endDate);
	}
	
	 Date parseDateStrToDate(String dateStr) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(dateStr);
	}
}
