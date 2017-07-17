package zdfs.service;

import java.util.List;

import zdfs.model.DepartmentT;
import zdfs.model.DepartmentTExample;

public interface IDepartmentService extends CRUDService<DepartmentT>{

	
	List<DepartmentT> findByExample(DepartmentTExample example);
}
