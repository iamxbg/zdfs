package zdfs.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zdfs.model.DepartmentT;
import zdfs.service.IDepartmentService;

@Controller
@RequestMapping(path="/department")
public class DepartmentController {

	
	@Autowired
	private IDepartmentService dService;
	
	@ResponseBody
	@RequestMapping("/list?hostpitalId={hospitalId}")
	public List<DepartmentT> findByHospistal(@PathVariable("hospitalId") int hospitalId){
		return dService.findByHospitalId(hospitalId);
	}
	
	@ResponseBody
	@RequestMapping("/find/departmentId={departmentId}")
	public DepartmentT findById(@PathVariable("departmentId") int departmentId){
		return dService.findById(departmentId);
	}
	
	
}
