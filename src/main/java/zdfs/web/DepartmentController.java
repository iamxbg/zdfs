package zdfs.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import zdfs.model.DepartmentT;
import zdfs.service.IDepartmentService;

@RestController
@RequestMapping(path="/department")
public class DepartmentController {

	
	@Autowired
	private IDepartmentService dService;
	
	
	@RequestMapping(path="/add",method=RequestMethod.POST)
	public Map<String, Object> add(@RequestBody DepartmentT department){
		dService.add(department);
		Map<String, Object> resultMap=new HashMap<>();
			resultMap.put("is_success", 1);
			resultMap.put("department",department);
		return resultMap;
	}
	
	@RequestMapping(path="/update",method=RequestMethod.POST)
	public Map<String, Object> update(@RequestBody DepartmentT department){
		dService.update(department);
		Map<String, Object> resultMap=new HashMap<>();
		resultMap.put("is_success", 1);
		resultMap.put("department",department);
		return resultMap;
	}
	
	@RequestMapping(path="/delete/{departmentId}",method=RequestMethod.POST)
	public Map<String, Object> delete(@PathVariable("departmentId") int departmentId){
		dService.deleteById(departmentId);
		Map<String, Object> resultMap=new HashMap<>();
		resultMap.put("is_success", 1);
		return resultMap;
	}
	
	@RequestMapping(path="/list?hostpitalId={hospitalId}",method=RequestMethod.GET)
	public List<DepartmentT> findByHospistal(@PathVariable("hospitalId") int hospitalId){
		return dService.findByHospitalId(hospitalId);
	}
	
	
	@RequestMapping(path="/findById/{departmentId}",method=RequestMethod.GET)
	public DepartmentT findById(@PathVariable("departmentId") int departmentId){
		return dService.findById(departmentId);
	}
	
	@RequestMapping(path="/findByDepartmentType/typeId={departmentTypeId}&hospitalId={hospitalId}",method=RequestMethod.GET)
	public List<DepartmentT> findByDepartmentType(@PathVariable("departmentTypeId") int departmentTypeId,
								@PathVariable("hospitalId") int hospitalId){
		return dService.findByDepartmentType(hospitalId, departmentTypeId);
	}
	
	
}
