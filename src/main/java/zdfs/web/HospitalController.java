package zdfs.web;

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

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private HospitalService hService;
	
	@RequestMapping(path="/add",method=RequestMethod.POST)
	public Map<String, Object> add(@RequestBody HospitalT hospital){
		Map<String, Object> resultMap=new HashMap<>();
		hService.add(hospital);
		resultMap.put("is_success", 1);
		resultMap.put("hospital", hospital);
		return resultMap;
	}
	
	
	@RequestMapping(path="/update",method=RequestMethod.POST)
	public Map<String, Object> update(@RequestBody HospitalT hospital){
		hService.update(hospital);
		Map<String, Object> resultMap=new HashMap<>();
			resultMap.put("is_success", 1);
			resultMap.put("hospital", hospital);
		return resultMap;
	}
	
	@RequestMapping(path="/delete/{hospitalId}",method=RequestMethod.POST)
	public Map<String, Object> deleteById(@PathVariable("hospitalId") int hospitalId){
		Map<String, Object> resultMap=new HashMap<>();
			
		hService.deleteById(hospitalId);
		resultMap.put("is_success", 1);
		
		return resultMap;
	}
	
	@RequestMapping(path="/findById/{hospitalId}",method=RequestMethod.GET)
	public HospitalT findById(@PathVariable("hospitalId") int hospitalId){
		return hService.findById(hospitalId);
	}
	
	@RequestMapping(path="/listAll",method=RequestMethod.GET)
	public List<HospitalT> listAll(){
		return hService.findAll();
	}
	
	
		
}
