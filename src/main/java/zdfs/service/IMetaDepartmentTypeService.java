package zdfs.service;

import java.util.List;

import zdfs.model.MetaDepartmentTypeT;

public interface IMetaDepartmentTypeService extends CRUDService<MetaDepartmentTypeT> {
	
	
	public List<MetaDepartmentTypeT> listAll();
}
