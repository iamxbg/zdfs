package zdfs.web;


import java.util.ArrayList;
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
import zdfs.web.param.ResponseParam;

@RestController
@RequestMapping(path="/department")
public class DepartmentController {

	
	@Autowired
	private IDepartmentService dService;
	
	
	@RequestMapping(path="/add",method=RequestMethod.POST)
	public ResponseParam<DepartmentT> add(@RequestBody DepartmentT department){
		dService.add(department);
		
		List<DepartmentT> dList=new ArrayList<DepartmentT>();
			dList.add(department);
		
		ResponseParam<DepartmentT> resp=new ResponseParam<>(dList);
		return resp;
	}
	
	@RequestMapping(path="/update",method=RequestMethod.POST)
	public ResponseParam<DepartmentT> update(@RequestBody DepartmentT department){
		dService.update(department);
		
		List<DepartmentT> dList=new ArrayList<>();
			dList.add(department);
		
		ResponseParam<DepartmentT> resp=new ResponseParam<>();
			resp.setData(dList);
		return resp;
	}
	
	@RequestMapping(path="/delete/departmentId={departmentId}",method=RequestMethod.POST)
	public ResponseParam<DepartmentT> delete(@PathVariable("departmentId") int departmentId){
		dService.deleteById(departmentId);
		
		return new ResponseParam();
	}
	
	@RequestMapping(path="/list/hospitalId={hospitalId}",method=RequestMethod.GET)
	public ResponseParam<DepartmentT> findByHospistal(@PathVariable("hospitalId") int hospitalId){
		ResponseParam<DepartmentT> resp=new ResponseParam<>();
		List<DepartmentT> dList= dService.findByHospitalId(hospitalId);
		resp.setData(dList);
		return resp;
	}
	
	
	@RequestMapping(path="/findById/departmentId={departmentId}",method=RequestMethod.GET)
	public ResponseParam<DepartmentT> findById(@PathVariable("departmentId") int departmentId){
		
		ResponseParam<DepartmentT> resp=new ResponseParam<>();
		
		DepartmentT department= dService.findById(departmentId);
		List<DepartmentT> dList=new ArrayList<>();
			dList.add(department);
			
		resp.setData(dList);
		
		return resp;
			
		
	}
	
	@RequestMapping(path="/findByDepartmentType/typeId={departmentTypeId}&hospitalId={hospitalId}",method=RequestMethod.GET)
	public ResponseParam<DepartmentT> findByDepartmentType(@PathVariable("departmentTypeId") int departmentTypeId,
								@PathVariable("hospitalId") int hospitalId){
		ResponseParam<DepartmentT> resp=new ResponseParam<>();
		List<DepartmentT> dList= dService.findByDepartmentType(hospitalId, departmentTypeId);
			resp.setData(dList);
			
		return resp;
	}
	
	
}
