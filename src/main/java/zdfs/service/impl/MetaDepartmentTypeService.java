package zdfs.service.impl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zdfs.dao.MetaDepartmentTypeTMapper;
import zdfs.model.MetaDepartmentTypeT;
import zdfs.model.MetaDepartmentTypeTExample;
import zdfs.service.IMetaDepartmentTypeService;

@Service
@Transactional
public class MetaDepartmentTypeService implements IMetaDepartmentTypeService {

	@Autowired
	private MetaDepartmentTypeTMapper mapper;
	
	public MetaDepartmentTypeService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Serializable add(MetaDepartmentTypeT t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	@Override
	public int deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey((int)id);
	}

	@Override
	@Deprecated
	public int update(MetaDepartmentTypeT t) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(t);
	}

	@Deprecated
	@Override
	public MetaDepartmentTypeT findById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey((int)id);
	}

	@Override
	public List<MetaDepartmentTypeT> listAll() {
		// TODO Auto-generated method stub
		MetaDepartmentTypeTExample example=new MetaDepartmentTypeTExample();
			example.createCriteria().andDelflagEqualTo(false);	
			example.setOrderByClause("id");
			
		return mapper.selectByExample(example);
	}

}
