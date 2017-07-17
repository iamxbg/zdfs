package zdfs.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zdfs.dao.DepartmentTMapper;
import zdfs.model.DepartmentT;
import zdfs.model.DepartmentTExample;
import zdfs.service.IDepartmentService;

@Service
@Transactional
public class DepartmentService implements IDepartmentService {

	@Autowired
	private DepartmentTMapper mapper;

	@Override
	public Serializable add(DepartmentT t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	@Override
	public int deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey((int)id);
	}

	@Override
	public int update(DepartmentT t) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(t);
	}

	@Override
	public DepartmentT findById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey((int)id);
	}

	@Override
	public List<DepartmentT> findByNameLike(String name) {
		// TODO Auto-generated method stub
		DepartmentTExample example=new DepartmentTExample();
			example.createCriteria().andNameLike("%"+name+"%");
			example.setOrderByClause("id");
		return mapper.selectByExample(example);
	}

	@Override
	public List<DepartmentT> findByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DepartmentT> findByHospitalId(int hospitalId) {
		// TODO Auto-generated method stub
		DepartmentTExample example=new DepartmentTExample();
			example.createCriteria().andHos_idEqualTo(hospitalId)
									.andDelflagEqualTo(false);
			example.setOrderByClause("id");
		return mapper.selectByExample(example);
	}



	


}
