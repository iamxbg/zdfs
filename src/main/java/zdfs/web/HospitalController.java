package zdfs.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zdfs.model.HospitalT;
import zdfs.service.impl.HospitalService;
import zdfs.web.param.ResponseParam;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private HospitalService hService;
	
	@RequestMapping(path="/add",method=RequestMethod.POST)
	public ResponseParam<HospitalT> add(@RequestBody HospitalT hospital){

		hService.add(hospital);

		ResponseParam<HospitalT> resp=new ResponseParam<>();
		List<HospitalT> dList=new ArrayList<>();
			dList.add(hospital);
			resp.setData(dList);
		return resp;
	}
	
	
	@RequestMapping(path="/update",method=RequestMethod.POST)
	public ResponseParam<HospitalT> update(@RequestBody HospitalT hospital){
		hService.update(hospital);
		ResponseParam<HospitalT> resp=new ResponseParam<>();
			
		List<HospitalT> dList=new ArrayList<>();
			dList.add(hospital);
			
			resp.setData(dList);

		return resp;
	}
	
	@RequestMapping(path="/delete/hospitalId={hospitalId}",method=RequestMethod.POST)
	public ResponseParam<HospitalT> deleteById(@PathVariable("hospitalId") int hospitalId){

		hService.deleteById(hospitalId);
		
		return new ResponseParam<>();
		
	}
	
	@RequestMapping(path="/findById/hospitalId={hospitalId}",method=RequestMethod.GET)
	public ResponseParam<HospitalT> findById(@PathVariable("hospitalId") int hospitalId){
		HospitalT h= hService.findById(hospitalId);
		List<HospitalT> dList=new ArrayList<>();
			dList.add(h);
			
		return new ResponseParam<>(dList);
	}
	
	@RequestMapping(path="/listAll",method=RequestMethod.GET)
	public ResponseParam<HospitalT> listAll(){
		List<HospitalT> dList= hService.findAll();
		return new ResponseParam(dList);
	}
	
	
		
}
