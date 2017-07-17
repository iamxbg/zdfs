package zdfs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zdfs.model.HospitalT;
import zdfs.service.impl.HospitalService;

@Controller
@RequestMapping("/test/hospital")
public class HospitalController {

	@Autowired
	private HospitalService hService;
	
	@RequestMapping(path="/add",method=RequestMethod.POST)
	public ResponseEntity<HospitalT> add(@RequestBody HospitalT hospital){
		//hospital.setId(hService.add(hospital));
		//return new ResponseEntity<HospitalT>(hospital, HttpStatus.OK);
		return null;
	}
	
	
	@RequestMapping(path="/update",method=RequestMethod.POST)
	public ResponseEntity<HospitalT> update(@RequestBody HospitalT hospital){
		hService.update(hospital);
		return new ResponseEntity<HospitalT>(hService.findById(hospital.getId()), HttpStatus.OK);
	}
	
	@RequestMapping(path="/delete/{hospitalId}",method=RequestMethod.POST)
	public ResponseEntity deleteById(@PathVariable("hospitalId") int hospitalId){
			hService.deleteById(hospitalId);
			return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(path="/findById/hospitalId={hospitalId}")
	public ResponseEntity<HospitalT> findById(@PathVariable("hospitalId") int hospitalId){
		return new ResponseEntity(hService.findById(hospitalId),HttpStatus.OK);
	}
	
	
	
	
		
}
