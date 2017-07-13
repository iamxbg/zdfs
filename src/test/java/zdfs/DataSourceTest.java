package zdfs;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class DataSourceTest {

	@Autowired
	private DataSource dataSource;
	
	public DataSourceTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testDataSourceNotNull() throws SQLException{
		
		assertNotNull("DataSource is NULL", dataSource);
		assertNotNull("jdbc Connection is NULL",dataSource.getConnection());
	}

}
