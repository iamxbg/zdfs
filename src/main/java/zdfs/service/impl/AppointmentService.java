package zdfs.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zdfs.dao.AppointmentTMapper;
import zdfs.model.AppointmentT;
import zdfs.model.AppointmentTExample;
import zdfs.service.IAppointmentService;

@Service
@Transactional
public class AppointmentService implements IAppointmentService {

	@Autowired
	private AppointmentTMapper mapper;
	
	public AppointmentService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Serializable add(AppointmentT t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	@Override
	public int deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey((long)id);
	}

	@Override
	public int update(AppointmentT t) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(t);
	}

	@Override
	public AppointmentT findById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey((long)id);
	}

	@Override
	public List<AppointmentT> findByDoctorId(int doctorId) {
		// TODO Auto-generated method stub
		AppointmentTExample example=new AppointmentTExample();
			example.createCriteria().andDelflagEqualTo(false)
									.andD_idEqualTo(doctorId);
			example.setOrderByClause("appoint_date");
		return mapper.selectByExample(example);
	}

	@Override
	public List<AppointmentT> findByMemberIdAndDoctorId(int doctorId, int patientId) {
		// TODO Auto-generated method stub
		AppointmentTExample example=new AppointmentTExample();
			example.createCriteria().andDelflagEqualTo(false)
									.andP_idEqualTo(patientId);
			
			example.setOrderByClause("appoint_date");
			
		return mapper.selectByExample(example);
	}


	

}
