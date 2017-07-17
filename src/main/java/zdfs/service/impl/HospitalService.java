package zdfs.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zdfs.dao.HospitalTMapper;
import zdfs.model.HospitalT;
import zdfs.model.HospitalTExample;
import zdfs.service.IHospitalService;

@Service
@Transactional
public class HospitalService implements IHospitalService {
	
	@Autowired
	private HospitalTMapper mapper;

	
	
	public HospitalService() {
		super();
	}

	@Override
	public Serializable add(HospitalT t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	@Override
	public int deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey((int)id);
	}

	@Override
	public int update(HospitalT t) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(t);
	}

	@Override
	public HospitalT findById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey((int)id);
	}

	@Override
	public List<HospitalT> findByName(String name) {
		// TODO Auto-generated method stub
		HospitalTExample exmpale=new HospitalTExample();
			exmpale.createCriteria().andNameLike("%"+name+"%");
			exmpale.setOrderByClause("id");
		return mapper.selectByExample(exmpale);
	}

	
	





}
