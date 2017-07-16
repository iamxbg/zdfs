package zdfs.message;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;


import zdfs.dao.PatientTMapper;
import zdfs.model.PatientT;
import static zdfs.message.MessageUtil.*;

public class DoctorStatusSubscriber implements IDoctorStatusSubscriber{

	@Autowired
	private RedisTemplate<String,Set<Integer>> template;

	private SetOperations<String, Integer> setOprs; 
	@Autowired
	private PatientTMapper pMapper;
	

	@Override
	public void handleLogin(int did) {
		// TODO Auto-generated method stub
		
		
		List<PatientT> pList=pMapper.selectByDoctorId(did);
		for(PatientT p:pList) {
			String dKey=DOCTOR_NAMESPACE+did;
			String pKey=PATIENT_NAMESPACE+p.getId();
			
			if(template.hasKey(pKey)) {
				//construct doctor status
				setOprs.add(dKey, p.getId());
				setOprs.add(dKey, 0);
				//change patient's space 
				setOprs.add(pKey, did);
				setOprs.add(pKey, 0);
			}
		}
	}

	@Override
	public void handleLogout(int did) {
		// TODO Auto-generated method stub
		List<PatientT> pList=pMapper.selectByDoctorId(did);
		for(PatientT p:pList) {
			String dKey=DOCTOR_NAMESPACE+did;
			String pKey=PATIENT_NAMESPACE+p.getId();
			
			//change patient's space 
			if(template.hasKey(pKey)) {
				
				setOprs.remove(pKey, did);
				setOprs.add(pKey, 0);
			}
			//expire doctor
			template.expire(dKey, 0, TimeUnit.MILLISECONDS);
		}
	}

	@Override
	public void handleHeartbeat(int did) {
		// TODO Auto-generated method stub
		template.expire(DOCTOR_NAMESPACE+did, DOCTOR_NAMESPACE_EXPIRES_COUNT, TimeUnit.MICROSECONDS);
	}
	
	@Override
	public void handleExpireEvent(int did) {
		List<PatientT> pList=pMapper.selectByDoctorId(did);
		for(PatientT p:pList) {
			String pKey=PATIENT_NAMESPACE+p.getId();
			String dKey=DOCTOR_NAMESPACE+did;
			if(template.hasKey(pKey)) {
				setOprs.remove(pKey,did);
				setOprs.add(pKey, 0);
			}
		}
	}

}
