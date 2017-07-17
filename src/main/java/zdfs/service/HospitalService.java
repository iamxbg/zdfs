package zdfs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zdfs.dao.HospitalTMapper;
import zdfs.model.HospitalT;
import zdfs.model.HospitalTExample;

@Service
@Transactional
public class HospitalService implements IHospitalService {
	
	@Autowired
	private HospitalTMapper hMapper;

	@Override
	public int add(HospitalT t) {
		// TODO Auto-generated method stub
		return hMapper.insert(t);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		 return hMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int update(HospitalT t) {
		// TODO Auto-generated method stub
		return hMapper.updateByPrimaryKey(t);
	}

	public List<HospitalT> findByExample(HospitalTExample t) {
		// TODO Auto-generated method stub
		return hMapper.selectByExample(t);
	}

	@Override
	public HospitalT findById(int id) {
		// TODO Auto-generated method stub
		return hMapper.selectByPrimaryKey(id);
	}

}
