package zdfs.message;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import static zdfs.message.MessageUtil.*;

public class PatientStatusPublisher implements IPatientStatusPublisher{

	@Autowired
	private RedisTemplate template;
	
	@Override
	public void login(int id) {
		// TODO Auto-generated method stub
		template.convertAndSend(CHANNEL_PATIENT_LOGIN, id);
	}

	@Override
	public void logout(int id) {
		// TODO Auto-generated method stub
		template.convertAndSend(CHANNEL_PATIENT_LOGOUT, id);
	}

	@Override
	public void heartBeat(int id) {
		// TODO Auto-generated method stub
		template.convertAndSend(CHANNEL_DOCTOR_HEARTBEAT, id);
	}

}
