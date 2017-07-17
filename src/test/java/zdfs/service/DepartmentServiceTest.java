package zdfs.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.model.DepartmentT;

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DepartmentServiceTest {

	@Autowired
	private DepartmentService dService;
	
	@Test
	public void testAdd() {
		String code="";
		String name="";
		String description="";
		Integer department_type_id=1;
		String tel="";
		String address="";
		String dep_photo="sdfwerwerwer";
		Integer hos_id=1;
		DepartmentT d=new DepartmentT(code, name, description, address, dep_photo, department_type_id, tel, hos_id);
		
		dService.add(d);
		
		
	}
	
}
