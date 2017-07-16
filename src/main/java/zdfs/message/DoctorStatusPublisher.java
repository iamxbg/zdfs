package zdfs.message;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;

public class DoctorStatusPublisher implements IDoctorStatusPublisher {

	@Autowired
	private RedisOperations oprs;
	
	@Override
	public void login(int did) {
		// TODO Auto-generated method stub
		String channel="doctor_login";
		oprs.convertAndSend(channel, did);
	}

	@Override
	public void logout(int did) {
		// TODO Auto-generated method stub
		String channel="doctor_logout";
		oprs.convertAndSend(channel, did);
	}

	@Override
	public void heartBeat(int did) {
		// TODO Auto-generated method stub
		String channel="doctor_hearbeat";
		oprs.convertAndSend(channel, did);
	}

}
