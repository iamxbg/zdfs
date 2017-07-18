package zdfs.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import zdfs.model.MetaDepartmentTypeT;
import zdfs.model.MetaDoctorTypeT;
import zdfs.service.IMetaDepartmentTypeService;
import zdfs.service.IMetaDoctorTypeService;

@RestController
@RequestMapping("/metaData")
public class MetaController {

	@Autowired
	private IMetaDepartmentTypeService mDptService;
	@Autowired
	private IMetaDoctorTypeService mDocService;
	
	public MetaController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value="/departmentType/add",method=RequestMethod.POST)
	public Map<String, Object> addDepartmentType(@RequestBody MetaDepartmentTypeT type){
		
		mDptService.add(type);
		Map<String, Object> result=new HashMap<>();
			result.put("is_success", 1);
			
		return result;
		
		
	}
	
	@RequestMapping(value="/doctorType/add",method=RequestMethod.POST)
	public Map<String, Object> addDoctorType(@RequestBody MetaDoctorTypeT type){
		mDocService.add(type);
		Map<String, Object> result=new HashMap<>();
			result.put("is_success", 1);
			
		return result;
	}
	
	@RequestMapping(value="/doctorType/list",method=RequestMethod.GET)
	public List<MetaDoctorTypeT> listDoctorType(){
		return mDocService.listAll();
	}
	
	@RequestMapping(value="/departmentType/list",method=RequestMethod.GET)
	public List<MetaDepartmentTypeT> listDepartmentType(){
		return mDptService.listAll();
	}
	
	@RequestMapping(value="/{type}/del/{id}",method=RequestMethod.POST)
	public Map<String, Object> deleteMeta(@PathVariable("type") String type,@PathVariable("id") Integer id){
		Map<String, Object> resultMap=new HashMap<>();
		if("doctorType".equals(type)){
			mDocService.deleteById(id);
			resultMap.put("is_success", 1);
		}else if("departmentType".equals(type)){
			mDptService.deleteById(id);
			resultMap.put("is_success", 1);
		}else{
			resultMap.put("is_success", 0);
			resultMap.put("reason", "UNKNOW_META_TYPE");
		}
		return resultMap;
	}
}
