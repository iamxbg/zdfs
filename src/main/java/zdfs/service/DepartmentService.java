package zdfs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zdfs.dao.DepartmentTMapper;
import zdfs.model.DepartmentT;
import zdfs.model.DepartmentTExample;

@Service
@Transactional
public class DepartmentService implements IDepartmentService {

	@Autowired
	private DepartmentTMapper dMapper;
	
	@Override
	public int add(DepartmentT t) {
		// TODO Auto-generated method stub
		return dMapper.insert(t);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return dMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int update(DepartmentT t) {
		// TODO Auto-generated method stub
		return dMapper.updateByPrimaryKey(t);
	}

	@Override
	public DepartmentT findById(int id) {
		// TODO Auto-generated method stub
		return dMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<DepartmentT> findByExample(DepartmentTExample example) {
		// TODO Auto-generated method stub
		return dMapper.selectByExample(example);
	}

}
