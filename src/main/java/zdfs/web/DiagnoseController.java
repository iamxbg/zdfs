package zdfs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zdfs.model.DiagnoseT;
import zdfs.service.IDiagnoseService;
import zdfs.web.param.ResponseParam;

@RestController
@RequestMapping(path="/diagnose")
public class DiagnoseController {

	@Autowired
	private IDiagnoseService service;
	
	public DiagnoseController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(path="/upload")
	public ResponseParam<DiagnoseT> upload(@RequestBody DiagnoseT diagnose){
		
		service.add(diagnose);
		return new ResponseParam<>();
	}

	@RequestMapping(path="/find/doctorId={doctorId}&patientId={patientId}")
	public ResponseParam<DiagnoseT> findByDoctorIdAndPatientId(@PathVariable("doctorId") int doctorId,@PathVariable("patientId") int patientId){
		List<DiagnoseT> dataList=service.findByPatientIdAndDoctorId(patientId, doctorId);
		return new ResponseParam<>(dataList);
	}
	
	
	@RequestMapping(path="/find/patientId={patientId}")
	public ResponseParam<DiagnoseT> findByPatientId(@PathVariable("patientId") int patientId){
		List<DiagnoseT> dataList=service.findByPatientId(patientId);
			return new ResponseParam<>(dataList);
	}
}
