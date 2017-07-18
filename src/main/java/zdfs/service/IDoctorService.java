package zdfs.service;

import java.util.List;

import zdfs.model.DoctorT;
import zdfs.model.DoctorTExample;

public interface IDoctorService extends CRUDService<DoctorT>{

	public List<DoctorT> findByNameLike(String name);
	
	public List<DoctorT> findByTelAndPwd(String tel,String pwd);
	
	public List<DoctorT> findByHospitalId(int hospitalId);
	
	public List<DoctorT> findByHospitalIdAndDepartmentId(int hospitalId,int departmentId);
	
}
