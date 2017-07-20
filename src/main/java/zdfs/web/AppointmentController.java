package zdfs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zdfs.model.AppointmentT;
import zdfs.model.AppointmentTExample;
import zdfs.service.IAppointmentService;
import zdfs.service.impl.AppointmentService;
import zdfs.web.param.ResponseParam;

@RestController
@RequestMapping(path="/appointment")
public class AppointmentController {

	@Autowired
	private IAppointmentService service;
	
	public AppointmentController() {
		// TODO Auto-generated constructor stub
	}

	
	@RequestMapping(path="/embark")
	public ResponseParam<AppointmentT> embark(@RequestBody AppointmentT appointment){
		service.add(appointment);
		return new ResponseParam<>();
	}
	

	@RequestMapping(path="/findByDoctorId/doctorId={doctorId}")
	public ResponseParam<AppointmentT> findByDoctorTel(@PathVariable("doctorId") int doctorId){
		List<AppointmentT> aList=service.findByDoctorId(doctorId);
		return new ResponseParam<>(aList);
	}
	

}
