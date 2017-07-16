package zdfs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class RedisConnectionTest {

	private static Logger log=LogManager.getLogger();
	
	@Autowired
	private RedisOperations<String,String> oprs;
	@Autowired
	private RedisConnectionFactory connFactory;
	@Autowired
	private RedisTemplate template;
	
	
	@Test
	public void testOperationsNotNull() {
		
		log.info("test OperationNotNull");
		
		Assert.assertNotNull("RedisOperation is null",oprs);
		Assert.assertNotNull("ConnectionFactory is null",connFactory);
	}
	
	@Test
	public void testConnNotNull() {
		Assert.assertNotNull("Can't get Redis Connection!",connFactory.getConnection());
		
	}
	
	@Test
	public void testAddMessage(){
		template.opsForValue().append("myTest1", "testValue");
	}
	
	
}
