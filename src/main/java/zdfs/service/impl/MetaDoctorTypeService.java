package zdfs.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zdfs.dao.MetaDoctorTypeTMapper;
import zdfs.model.DoctorT;
import zdfs.model.DoctorTExample;
import zdfs.model.MetaDoctorTypeT;
import zdfs.model.MetaDoctorTypeTExample;
import zdfs.service.IMetaDoctorTypeService;

@Service
@Transactional
public class MetaDoctorTypeService implements IMetaDoctorTypeService {

	@Autowired
	private MetaDoctorTypeTMapper mapper;
	
	public MetaDoctorTypeService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Serializable add(MetaDoctorTypeT t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	
	@Override
	public int deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey((int)id);
	}

	@Deprecated
	@Override
	public int update(MetaDoctorTypeT t) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(t);
	}

	@Deprecated
	@Override
	public MetaDoctorTypeT findById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey((int)id);
	}

	@Override
	public List<MetaDoctorTypeT> listAll() {
		// TODO Auto-generated method stub
		MetaDoctorTypeTExample example=new MetaDoctorTypeTExample();
			example.createCriteria().andDelflagEqualTo(false);
			example.setOrderByClause("id");
		return mapper.selectByExample(example);
	}


}
