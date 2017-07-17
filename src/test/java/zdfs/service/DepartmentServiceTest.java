package zdfs.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zdfs.model.DepartmentT;
import zdfs.service.impl.DepartmentService;

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DepartmentServiceTest  implements ICRUDServiceTest{

	@Autowired
	private DepartmentService service;

	@Ignore
	@Test
	@Override
	public void testAdd() {
		// TODO Auto-generated method stub
		String code="XXSWEerFFSSDSD";
		String name="放射第二科室";
		String description="描述不能為空！";
		String address="健康樓四樓5號室";
		String dep_photo="http://sdfsersdcdfsdserwer";
		Integer department_type_id=7;
		String tel="+86-343234234"; 
		Integer hos_id=6;
		
		DepartmentT t=new  DepartmentT(code, name, description, address, dep_photo, department_type_id, tel, hos_id);
		service.add(t);
		
	}

	@Ignore("pass")
	@Override
	public void testDeleteById() {
		// TODO Auto-generated method stub
		
	}

	@Ignore("pass")
	@Override
	public void testSelectById() {
		// TODO Auto-generated method stub
		
	}

	@Ignore
	@Test
	@Override
	public void testSelectByExample() {
		// TODO Auto-generated method stub
		String name_1="放射";
		String name_2="兒科";
		Assert.assertTrue(service.findByNameLike(name_1).size()==2);
		Assert.assertTrue(service.findByNameLike(name_2).size()==1);
		
	}

	@Ignore("pass")
	@Override
	public void testUpdate() {
		// TODO Auto-generated method stub
		
	}
	

	
}
