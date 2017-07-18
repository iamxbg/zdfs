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

	@Override
	public List<DoctorT> findByNameLike(String name) {
		// TODO Auto-generated method stub
		DoctorTExample example=new DoctorTExample();
			example.createCriteria().andNameLike("%"+name+"%");
			example.setOrderByClause("id");
		return mapper.selectByExample(example);
	}

	@Override
	public List<DoctorT> findByTelAndPwd(String tel, String pwd) {
		// TODO Auto-generated method stub
		DoctorTExample example=new DoctorTExample();
			example.createCriteria().andTelEqualTo(tel)
								.andDelflagEqualTo(false)
								.andPwdEqualTo(pwd);
			
		return mapper.selectByExample(example);
	}

	@Override
	public List<DoctorT> findByHospitalId(int hospitalId) {
		// TODO Auto-generated method stub
		DoctorTExample example=new DoctorTExample();
			example.createCriteria().andHospital_idEqualTo(hospitalId)
									.andDelflagEqualTo(false);
			example.setOrderByClause("id");
		return mapper.selectByExample(example);
	}

	@Override
	public List<DoctorT> findByHospitalIdAndDepartmentId(int hospitalId, int departmentId) {
		// TODO Auto-generated method stub
		DoctorTExample example=new DoctorTExample();
			example.createCriteria().andDelflagEqualTo(false)
									.andHospital_idEqualTo(hospitalId)
									.andDepartment_idEqualTo(departmentId);
			example.setOrderByClause("id");
		return mapper.selectByExample(example);
	}



	


}
