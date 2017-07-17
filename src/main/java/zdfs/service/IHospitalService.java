package zdfs.service;

import java.util.List;

import zdfs.model.HospitalT;
import zdfs.model.HospitalTExample;

public interface IHospitalService extends CRUDService<HospitalT>{
	
	
	List<HospitalT> findByExample(HospitalTExample example);
}
