package zdfs.service;

import java.util.List;

import zdfs.model.DoctorT;
import zdfs.model.MetaDoctorTypeT;

public interface IMetaDoctorTypeService extends CRUDService<MetaDoctorTypeT> {

	
	public List<MetaDoctorTypeT> listAll();
}
