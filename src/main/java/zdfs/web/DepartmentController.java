package zdfs.web;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import zdfs.model.DepartmentT;

@RequestMapping(path="/department")
public class DepartmentController {

	
	@RequestMapping("/list?hostpitalName={hName}")
	public List<DepartmentT> findByHospistal(@PathVariable("hName") String hName){
		return null;
	}
	
	
}
