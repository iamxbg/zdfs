package zdfs.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	
	@Override
	public List<DiagnoseT> findByPatientIdAndDoctorId(int patientId, int doctorId) {
		// TODO Auto-generated method stub
		DiagnoseTExample example=new DiagnoseTExample();
			example.createCriteria().andDelflagEqualTo(false)
									.andP_idEqualTo(patientId)
									.andD_idEqualTo(doctorId);
									
									
		return mapper.selectByExample(example);
	}

	@Override
	public List<DiagnoseT> findByDoctorIdAndDate(int doctorId, Date date) {
		// TODO Auto-generated method stub
		DiagnoseTExample example=new DiagnoseTExample();
			example.createCriteria().andDelflagEqualTo(false)
									.andD_idEqualTo(doctorId)
									.andCreate_timeEqualTo(date);
			example.setOrderByClause("create_time");
			
		return mapper.selectByExample(example);
	}

	@Override
	public List<DiagnoseT> findByPatientId(int patientId) {
		// TODO Auto-generated method stub
		
		DiagnoseTExample example=new DiagnoseTExample();
				example.createCriteria().andDelflagEqualTo(false)
										.andP_idEqualTo(patientId);			
				example.setOrderByClause("create_time desc");						
		return mapper.selectByExample(example);
	}
	



	


}
