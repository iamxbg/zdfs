package zdfs.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.model.AppointmentT;
import zdfs.model.HospitalT;
import zdfs.service.impl.AppointmentService;

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppointmentServiceTest implements ICRUDServiceTest{

	@Autowired
	private AppointmentService service;
	
	private  static Logger log=LogManager.getLogger();
	
	public AppointmentServiceTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	@Override
	public void testAdd() {
		// TODO Auto-generated method stub
		Integer p_id=1;
		Integer d_id=1;
		String tel="+86-12357432634"; 
		String info="頭腦正常";
		Date appoint_date=null;
		Date appoint_time_start=null;
		Date appoint_time_end=null;
		try {
			appoint_date = new SimpleDateFormat("yyyy-MM-dd").parse("2017-03-23");
			appoint_time_start=new SimpleDateFormat("HH:mm:ss").parse("10:23:00");
			appoint_time_end=new SimpleDateFormat("HH:mm:ss").parse("17:23:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer state=1;
		Integer refuse_reason=2;
		Boolean embark_direction=true;
		AppointmentT t=new AppointmentT(p_id, d_id, tel, info, appoint_date, appoint_time_start, appoint_time_end, state, refuse_reason, embark_direction);
		
		try{
				service.add(t);
		}catch(DataIntegrityViolationException e){
			log.error("違反逐漸約束！");
		}
	}

	@Override
	public void testDeleteById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testSelectById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testSelectByExample() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testUpdate() {
		// TODO Auto-generated method stub
		
	}

}
