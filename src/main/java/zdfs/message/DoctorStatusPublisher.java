package zdfs.message;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class DoctorStatusPublisher implements IDoctorStatusPublisher {

	@Autowired
	private RedisTemplate template;
	
	private static Logger log=LogManager.getLogger();
	
	@Override
	public void login(int did) {
		// TODO Auto-generated method stub
		String channel="doctor_login";
		template.convertAndSend(channel, did);
	}

	@Override
	public void logout(int did) {
		// TODO Auto-generated method stub
		String channel="doctor_logout";
		template.convertAndSend(channel, did);
	}

	@Override
	public void heartBeat(int did) {
		// TODO Auto-generated method stub
		
		log.info("pub heartbeat :"+did);
		
		String channel="doctor_hearbeat";
		template.convertAndSend(channel, did);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
