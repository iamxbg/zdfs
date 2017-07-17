package zdfs.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zdfs.model.MetaDepartmentTypeT;

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MetaDepartmentTypeServiceTest implements ICRUDServiceTest{

	public MetaDepartmentTypeServiceTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private IMetaDepartmentTypeService service;

	@Ignore
	@Test
	@Override
	public void testAdd() {
		// TODO Auto-generated method stub
		String[] nameList=new String[]{"骨科","婦產科","兒童科","內科","臨床科","泌尿科","放射科"};
		for(String name:nameList){
			MetaDepartmentTypeT t=new MetaDepartmentTypeT(name);
			service.add(t);
		}
		
	}

	@Ignore("pass")
	@Override
	public void testDeleteById() {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Override
	public void testSelectById() {
		// TODO Auto-generated method stub
		int id=1;
		MetaDepartmentTypeT t= service.findById(id);
		Assert.assertArrayEquals("骨科".toCharArray(), t.getName().toCharArray());
	}

	@Ignore("pass")
	@Override
	public void testSelectByExample() {
		// TODO Auto-generated method stub
		
	}

	@Ignore("pass")
	@Override
	public void testUpdate() {
		// TODO Auto-generated method stub
		
	}
	
	

}
