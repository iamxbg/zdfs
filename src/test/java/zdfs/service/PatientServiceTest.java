package zdfs.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.model.PatientT;
import zdfs.service.impl.PatientService;

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PatientServiceTest  implements ICRUDServiceTest{

	@Autowired
	private PatientService service;
	
	public PatientServiceTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	@Override
	public void testAdd() {
		// TODO Auto-generated method stub
		String p_name="白居易"; 
		Boolean p_sex=true;
		Integer p_age=42; 
		Integer member_id=4233; 
		Integer d_id=7;
		PatientT t=new PatientT(p_name, p_sex, p_age, member_id, d_id);
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

	@Override
	public void testSelectByExample() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testUpdate() {
		// TODO Auto-generated method stub
		
	}

	

}
