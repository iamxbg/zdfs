package zdfs.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.model.DoctorT;
import zdfs.service.impl.DoctorService;

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DoctorServiceTest  implements ICRUDServiceTest{

	@Autowired
	private DoctorService service;

	//@Ignore
	@Test
	@Override
	public void testAdd() {
		// TODO Auto-generated method stub
		String name="李大白"; 
		String pwd="567"; 
		String mail="helloworld@126.com"; 
		String tel="086-4537626";
		String photo="http://fakeLocation.xmllsd"; 
		Date birthday=null;
		try {
			birthday = new SimpleDateFormat("yyyy-MM-dd").parse("1989-03-12");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer hospital_id=73;
		Integer department_id=45;
		Integer doctor_type_id=41; 
		String good_at="拔痰定喘";
		Boolean online_state=false;
		Boolean has_video=false;
		DoctorT t=new DoctorT(name, pwd, mail, tel, photo, birthday, hospital_id, department_id, doctor_type_id, good_at, online_state, has_video);
		
		service.add(t);
	}

	@Override
	public void testDeleteById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testSelectById() {
		// TODO Auto-generated method stub
		
	}

	@Ignore
	@Test
	@Override
	public void testSelectByExample() {
		// TODO Auto-generated method stub
		
		String name="李";
		Assert.assertTrue(service.findByNameLike(name).size()==2);
	}

	@Ignore
	@Test
	@Override
	public void testUpdate() {
		// TODO Auto-generated method stub
		DoctorT t=service.findByNameLike("李白").get(0);
			t.setGood_at("仗劍天涯");
		service.update(t);
	}
	
	

	
}
