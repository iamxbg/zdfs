//package zdfs.message;
//
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.SetOperations;
//import org.springframework.web.portlet.bind.annotation.ResourceMapping;
//
//import zdfs.dao.DoctorTMapper;
//import zdfs.dao.PatientTMapper;
//import zdfs.model.DoctorT;
//import zdfs.model.PatientT;
//
//import static zdfs.message.MessageUtil.*;
//
//public class PatientStatusSubscriber implements IPatientStatusSubscriber{
//
//	@Autowired
//	private RedisTemplate<String,Set<Integer>> template;
//
//	private SetOperations<String, Integer> setOprs; 
//	@Autowired
//	private DoctorTMapper dMapper;
//	
//
//	@Override
//	public void handleLogin(int pid) {
//		// TODO Auto-generated method stub
//		
//		
//		List<DoctorT> dList=dMapper.selectByPatientId(pid);
//		for(DoctorT d:dList) {
//			String dKey=DOCTOR_NAMESPACE+d.getId();
//			String pKey=PATIENT_NAMESPACE+pid;
//			
//			if(template.hasKey(dKey)) {
//				//construct patient status
//				setOprs.add(pKey, d.getId());
//				setOprs.add(pKey, 0);
//				//change doctor's space 
//				setOprs.add(dKey, pid);
//				setOprs.add(dKey, 0);
//			}
//		}
//	}
//
//	@Override
//	public void handleLogout(int pid) {
//		// TODO Auto-generated method stub
//		List<DoctorT> dList=dMapper.selectByPatientId(pid);
//		for(DoctorT d:dList) {
//			String dKey=DOCTOR_NAMESPACE+d.getId();
//			String pKey=PATIENT_NAMESPACE+pid;
//			
//			//change doctor space 
//			if(template.hasKey(dKey)) {
//				
//				setOprs.remove(dKey, pid);
//				setOprs.add(dKey, 0);
//			}
//			//expire doctor
//			template.expire(pKey, 0, TimeUnit.MILLISECONDS);
//		}
//	}
//
//	@Override
//	public void handleHeartbeat(int pid) {
//		// TODO Auto-generated method stub
//		template.expire(PATIENT_NAMESPACE+pid, PATIENT_NAMESPACE_EXPIRES_COUNT, TimeUnit.MICROSECONDS);
//	}
//	
//	@Override
//	public void handleExpireEvent(int pid) {
//		List<DoctorT> dList=dMapper.selectByPatientId(pid);
//		for(DoctorT d:dList) {
//			String pKey=PATIENT_NAMESPACE+pid;
//			String dKey=DOCTOR_NAMESPACE+d.getId();
//			if(template.hasKey(dKey)) {
//				setOprs.remove(dKey,pid);
//				setOprs.add(dKey, 0);
//			}
//		}
//	} 
//	
//
//
//}
