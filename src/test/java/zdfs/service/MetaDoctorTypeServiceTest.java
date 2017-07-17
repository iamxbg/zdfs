package zdfs.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.model.MetaDoctorTypeT;
import zdfs.model.MetaDoctorTypeTExample;

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MetaDoctorTypeServiceTest implements ICRUDServiceTest {
	
	@Autowired
	private IMetaDoctorTypeService service;

	public MetaDoctorTypeServiceTest() {
		// TODO Auto-generated constructor stub
	}

	@Ignore
	@Test
	@Override
	public void testAdd() {
		// TODO Auto-generated method stub
		String [] dList=new String[]{"主治醫師","副醫師","科室醫師","實習醫師"};
		for(String d:dList){
			service.add(new MetaDoctorTypeT(d));
		}
		
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
		MetaDoctorTypeTExample example=new MetaDoctorTypeTExample();
			System.out.println("size:"+service.listAll().size());
			Assert.assertTrue(service.listAll().size()==2);
			
			
	}

	@Ignore("pass")
	@Override
	public void testUpdate() {
		// TODO Auto-generated method stub

	}

}
