package zdfs.service;

import java.util.List;

import zdfs.model.HospitalT;
import zdfs.model.HospitalTExample;

public interface IHospitalService extends CRUDService<HospitalT>{
	

	public List<HospitalT> findByName(String name);
}
