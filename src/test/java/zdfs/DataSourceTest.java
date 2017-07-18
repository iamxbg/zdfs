package zdfs;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class DataSourceTest {

	@Resource(name="dataSource")
	private DataSource dataSource;
	@Resource(name="tf02_dataSource")
	private DataSource tf02_dataSource;
	
	private static Logger log=LogManager.getLogger();
	
	public DataSourceTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testDataSourceNotNull() throws SQLException{
		
		Assert.assertNotNull(dataSource);
		Assert.assertNotNull(tf02_dataSource);
		
		Assert.assertNotNull(dataSource.getConnection());
		Assert.assertNotNull(tf02_dataSource.getConnection());
		
		
	}

	
	@Test
	public void testTF02DataSourceNotNull(){
		
	}
}
