package zdfs.service;

import java.util.Date;
import java.util.List;

import zdfs.model.DiagnoseT;
import zdfs.model.DiagnoseTExample;

public interface IDiagnoseService extends CRUDService<DiagnoseT>{
	
	public List<DiagnoseT> findByPatientIdAndDoctorId(int patientId,int doctorId);
	
	public List<DiagnoseT> findByDoctorIdAndDate(int doctorId,Date date);
	
	public List<DiagnoseT> findByPatientId(int patientId);
	
	public List<DiagnoseT> findByPatientIdAndDate(int patientId,Date date);
	
	
}
