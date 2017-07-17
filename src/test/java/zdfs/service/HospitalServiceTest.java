package zdfs.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.model.HospitalT;

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class HospitalServiceTest {

	@Autowired
	private HospitalService hService;

	
	@Test
	public void testAddHospital() {
		
		String code="sdfsdfsdfsdfsdfsdf";
		String name="浙江大学附属医院";
		String address="浙江什么什么路多少多少号";
		String tel="086+234234234";
		String decription="没有什么好说的！";
		HospitalT hos=new HospitalT(code, name, address, tel, decription);
		
		hService.add(hos);
		
		
		
	}
}
