package zdfs.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zdfs.model.HospitalT;
import zdfs.service.impl.HospitalService;

@Ignore
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class HospitalServiceTest  implements ICRUDServiceTest{

	@Autowired
	private HospitalService service;

	@Ignore
	@Test
	@Override
	public void testAdd() {
		// TODO Auto-generated method stub
		String code="ZZSDSDSDSDS";
		String name="浙江婦女兒童醫院";
		String address="浙江那個當";
		String tel="+76-443343242";
		String decription="很nice的醫院";
		HospitalT t=new HospitalT(code,name,address, tel, decription);
		
		service.add(t);
	}

	@Ignore
	@Test
	@Override
	public void testDeleteById() {
		// TODO Auto-generated method stub
		int id=2;
		service.deleteById(id);
	}

	@Ignore
	@Test
	@Override
	public void testSelectById() {
		// TODO Auto-generated method stub
		int id=3;
		HospitalT hospital =service.findById(id);
		Assert.assertNotNull(hospital);
	}

	@Ignore
	@Test
	@Override
	public void testSelectByExample() {
		// TODO Auto-generated method stub
		String name_1="浙江";
		Assert.assertTrue(service.findByName(name_1).size()==2);
		String name_2="廣東";
		Assert.assertTrue(service.findByName(name_2).size()==0);
	}

	@Ignore
	@Test
	@Override
	public void testUpdate() {
		// TODO Auto-generated method stub
		int id=3;
		HospitalT hospital=service.findById(id);
		hospital.setDecription("修改描述！");
		service.update(hospital);
	}

	

}
