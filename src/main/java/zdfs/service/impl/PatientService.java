package zdfs.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zdfs.dao.PatientTMapper;
import zdfs.model.PatientT;
import zdfs.model.PatientTExample;
import zdfs.service.IPatientService;

@Service
@Transactional
public class PatientService implements IPatientService {

	@Autowired
	private PatientTMapper mapper;
	
	public PatientService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Serializable add(PatientT t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	@Override
	public int deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey((int)id);
	}

	@Override
	public int update(PatientT t) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(t);
	}

	@Override
	public PatientT findById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey((int)id);
	}





}
