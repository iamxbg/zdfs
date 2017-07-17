package zdfs.service;

import java.util.List;

import zdfs.model.PatientT;
import zdfs.model.PatientTExample;

public interface IPatientService extends CRUDService<PatientT>{


	public List<PatientT> findByDoctorIdAndNameLike(int doctorId,String nameLike);
	
	public List<PatientT> findByDoctorId(int doctorId);
	
	public List<PatientT> findByZH_shebaohao(int doctorId,String ZH_shebaohao);
	
}
