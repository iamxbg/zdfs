package zdfs.tf02.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.tf02.dao.GluDataMapper;
import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BpData;
import zdfs.tf02.model.EcgData;
import zdfs.tf02.model.GluData;
import zdfs.tf02.model.Rspo2Data;

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class HealthDataServiceTest {


	private static Logger log=LogManager.getLogger();
	
	@Autowired
	private  IHealthDataService service;
	
	public HealthDataServiceTest() {
		// TODO Auto-generated constructor stub
	}

	@Ignore
	@Test
	public void testNotNull(){
		Assert.assertNotNull(service);
	}
	
	@Ignore
	@Test
	public void testfindEcgData() throws ParseException{
		int memberId=44;
		Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse("2016-09-01");
		Date endDate=new SimpleDateFormat("yyyy-MM-dd").parse("2016-10-10");
		List<EcgData> dList=service.findEcgDataByDateRange(memberId, startDate, endDate);
		
		log.info("dList-size:"+dList.size());
		
		for(EcgData d:dList){
			log.info("ecgData:"+d.getEegdata()+" creattime:"+d.getCreatetime());
		}
	}
	
	@Ignore
	@Test
	public void testFindBpData() throws ParseException{
		int memberId=939;
		Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse("2017-06-01");
		Date endDate=new SimpleDateFormat("yyyy-MM-dd").parse("2017-07-01");
		List<BpData> dList=service.findBpDataByDateRange(memberId, startDate, endDate);
		
		for(BpData d:dList){
			log.info("bpData: dp:"+d.getBp_dp()+" hr:"+d.getBp_hr()+" sp:"+d.getBp_sp());
		}
	}
	
	@Ignore
	@Test
	public void testFindBfData() throws ParseException{
		int memberId=8;
		Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse("2016-09-01");
		Date endDate=new SimpleDateFormat("yyyy-MM-dd").parse("2016-10-01");
		List<BfData> dList=service.findBfDataByDateRange(memberId, startDate, endDate);
		for(BfData d:dList){
			log.info("bfData:"+d.getHealthrecord()+" bf_fat_rate:"+d.getBf_fat_rate()+" bf_muscle_rate:"+d.getBf_muscle_rate()+" bf_water_rate:"+d.getBf_water_rate()+" bf_weight:"+d.getBf_weight());
		}
	}
	
	@Ignore
	@Test
	public void testFindGluData() throws ParseException{
		int memberId=72;
		Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse("2016-08-01");
		Date endDate=new SimpleDateFormat("yyyy-MM-dd").parse("2016-11-30");
		List<GluData> dList=service.findGluDataByDateRange(memberId, startDate, endDate);
		for(GluData d:dList){
			log.info(" gluData:"+d.getGludata()+" physicalState:"+d.getPhysicalstate());
		}
	}
	
	@Ignore
	@Test
	public void testFindRspo2Data() throws ParseException{
		int memberId=965;
		Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse("2017-04-01");
		Date endDate=new SimpleDateFormat("yyyy-MM-dd").parse("2017-10-11");
		List<Rspo2Data> dList=service.findRspo2DataByDateRange(memberId, startDate, endDate);
		for(Rspo2Data d:dList){
			log.info("rspo2Data:"+d.getRsp02data()+" record:"+d.getHealthrecord());
		}
	}
	
}
