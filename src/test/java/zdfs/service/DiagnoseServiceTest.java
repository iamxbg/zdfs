package zdfs.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.service.impl.DiagnoseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class DiagnoseServiceTest  implements ICRUDServiceTest{

	@Autowired
	private DiagnoseService serivce;
	
	public DiagnoseServiceTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void testAdd() {
		// TODO Auto-generated method stub
		
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
