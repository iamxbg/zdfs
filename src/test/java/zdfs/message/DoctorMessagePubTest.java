package zdfs.message;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DoctorMessagePubTest {

	public DoctorMessagePubTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private DoctorStatusPublisher pub;
	@Autowired
	private DoctorStatusSubscriber sub;
	
	@Test
	public void testPub(){
		
		Assert.assertNotNull(sub);
		Assert.assertNotNull(pub);
		pub.heartBeat(5677);
	}

}
