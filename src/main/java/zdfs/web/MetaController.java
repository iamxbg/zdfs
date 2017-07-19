package zdfs.web;

import java.util.ArrayList;
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
import zdfs.web.param.ResponseParam;

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
	public ResponseParam<MetaDepartmentTypeT> addDepartmentType(@RequestBody MetaDepartmentTypeT type){
		
		mDptService.add(type);
		//Map<String, Object> result=new HashMap<>();
			//result.put("is_success", 1);
			
		ResponseParam<MetaDepartmentTypeT> resp=new ResponseParam<>();
			List<MetaDepartmentTypeT> dList=new ArrayList<>();
				dList.add(type);
			resp.setData(dList);
		return resp;
		
		
	}
	
	@RequestMapping(value="/doctorType/add",method=RequestMethod.POST)
	public ResponseParam<MetaDoctorTypeT> addDoctorType(@RequestBody MetaDoctorTypeT type){
		mDocService.add(type);
		//Map<String, Object> result=new HashMap<>();
			//result.put("is_success", 1);
			
			ResponseParam<MetaDoctorTypeT> resp=new ResponseParam<>();
				List<MetaDoctorTypeT> dList=new ArrayList<>();
					dList.add(type);
				
					resp.setData(dList);
		return resp;
	}
	
	@RequestMapping(value="/doctorType/list",method=RequestMethod.GET)
	public ResponseParam<MetaDoctorTypeT> listDoctorType(){
		ResponseParam<MetaDoctorTypeT> resp=new ResponseParam<>();
			
		List<MetaDoctorTypeT> dList= mDocService.listAll();
			resp.setData(dList);
			
			return resp;
	}
	
	@RequestMapping(value="/departmentType/list",method=RequestMethod.GET)
	public ResponseParam<MetaDepartmentTypeT> listDepartmentType(){
		ResponseParam<MetaDepartmentTypeT> resp=new ResponseParam<>();
			List<MetaDepartmentTypeT> dList= mDptService.listAll();
			resp.setData(dList);
		
			return resp;
		
	}
	
	@RequestMapping(value="/{type}/del/id={id}",method=RequestMethod.POST)
	public ResponseParam deleteMeta(@PathVariable("type") String type,@PathVariable("id") Integer id){
		//Map<String, Object> resultMap=new HashMap<>();
		ResponseParam resp=new ResponseParam<>();
		if("doctorType".equals(type)){
			mDocService.deleteById(id);
		}else if("departmentType".equals(type)){
			mDptService.deleteById(id);
		}else{
			resp.setCode(1);
			resp.setInfo("UNKOWN_TYPE");
		}
		return resp;
	}
}
