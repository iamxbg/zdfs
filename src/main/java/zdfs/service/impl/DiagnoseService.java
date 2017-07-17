package zdfs.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zdfs.dao.DiagnoseTMapper;
import zdfs.model.DiagnoseT;
import zdfs.model.DiagnoseTExample;
import zdfs.service.IDiagnoseService;

@Service
@Transactional
public class DiagnoseService implements IDiagnoseService {
	
	@Autowired
	private DiagnoseTMapper mapper;

	@Override
	public Serializable add(DiagnoseT t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	@Override
	public int deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey((long)id);
	}

	@Override
	public int update(DiagnoseT t) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(t);
	}

	@Override
	public DiagnoseT findById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey((long)id);
	}



	


}
