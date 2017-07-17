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


	@Override
	public List<PatientT> findByDoctorId(int doctorId) {
		// TODO Auto-generated method stub
		PatientTExample example=new PatientTExample();
			example.createCriteria().andD_idEqualTo(doctorId)
									.andDelflagEqualTo(false);
			example.setOrderByClause("p_id");
		return mapper.selectByExample(example);
	}

	@Override
	public List<PatientT> findByDoctorIdAndNameLike(int doctorId, String nameLike) {
		// TODO Auto-generated method stub
		PatientTExample example=new PatientTExample();
			example.createCriteria().andD_idEqualTo(doctorId)
									.andP_nameLike("%"+nameLike+"%")
									.andDelflagEqualTo(false);
			example.setOrderByClause("p_id");
		return mapper.selectByExample(example);
	}

	@Override
	public List<PatientT> findByZH_shebaohao(int doctorId, String ZH_shebaohao) {
		// TODO Auto-generated method stub
		PatientTExample example=new PatientTExample();
			example.createCriteria().andD_idEqualTo(doctorId)
					.andDelflagEqualTo(false);
			
			example.setOrderByClause("p_id");
		return mapper.selectByExample(example);
	}





}
