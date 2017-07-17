package zdfs.service;

import java.util.List;

import zdfs.model.DepartmentT;
import zdfs.model.DepartmentTExample;

public interface IDepartmentService extends CRUDService<DepartmentT>{


	public List<DepartmentT> findByNameLike(String name);
	
	public List<DepartmentT> findByCode(String code);
	
	public List<DepartmentT> findByHospitalId(int hospitalId);
}
