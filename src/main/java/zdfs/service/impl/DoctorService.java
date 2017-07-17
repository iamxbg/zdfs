package zdfs.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zdfs.dao.DoctorTMapper;
import zdfs.model.DoctorT;
import zdfs.model.DoctorTExample;
import zdfs.service.IDoctorService;

@Service
@Transactional
public class DoctorService implements IDoctorService {

	@Autowired
	private DoctorTMapper mapper;

	@Override
	public Serializable add(DoctorT t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	@Override
	public int deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey((int)id);
	}

	@Override
	public int update(DoctorT t) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(t);
	}

	@Override
	public DoctorT findById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey((int)id);
	}



	


}
