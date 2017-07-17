package zdfs.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.model.DoctorT;
import zdfs.service.impl.DoctorService;

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DoctorServiceTest {

	@Autowired
	private DoctorService dService;
	
	
	@Test
	public void testRegister() {
		String name="诸葛孔明";
		String pwd="hellode";
		String mail="zgkm@163.com";
		String tel="1870283792";
		String photo="http://sdferw.cdsfs.sdfsdf&8x";
		Date birthday=new Date();
		int hospital_id=389;
		int department_id=123;
		int doctor_type_id=1;
		String job="杂役";
		String good_at="打杂";
		boolean online_state=true;
		boolean has_video=false;
		
		DoctorT doctor=new DoctorT(name, pwd, mail, tel, photo, birthday, hospital_id, department_id, doctor_type_id, good_at, online_state, has_video);
		dService.register(doctor);
		
				
	}
	
}
