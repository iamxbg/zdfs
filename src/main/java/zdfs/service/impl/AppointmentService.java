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




}
