package zdfs.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import zdfs.model.DiagnoseT;
import zdfs.model.DoctorT;
import zdfs.service.IDoctorService;
import zdfs.service.impl.DoctorService;


@RestController
@RequestMapping(path="/doctor")
public class DoctorController {
	
	private static Logger log=LogManager.getLogger();

	
	@Autowired
	private DoctorService doctorService;
	
	@ResponseBody
	@Consumes("applicaton/x-www-form-urlencoded")
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public Map<String, Object> login(@RequestParam("tel") String tel
			,@RequestParam("pwd") String pwd){
		
		log.info("username:"+tel);
		log.info("password:"+pwd);
		
		List<DoctorT> dList= doctorService.findByTelAndPwd(tel, pwd);
		
		Map<String, Object> result=new HashMap<>();
		if(dList.size()>0){
			result.put("is_success", 1);
			DoctorT doctor=dList.get(0);
			doctor.setPwd(null);
			result.put("doctor",doctor);
		}else{
			result.put("is_success", 0);
		}
		
		return result;

	}
	
	@ResponseBody
	@RequestMapping(path="/update",method=RequestMethod.POST)
	@Consumes("application/json;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	public Map<String, Object> update(@RequestBody DoctorT doctor){
		
		DoctorT old=doctorService.findById(doctor.getId());
		Map<String,Object> resultMap=new HashMap<>();
		if(old!=null){
			doctor.setPwd(old.getPwd());
			doctorService.update(doctor);
			
				resultMap.put("is_success", 1);
				doctor.setPwd(null);
				resultMap.put("doctor", doctor);
		}else{
			resultMap.put("is_success", 0);
			resultMap.put("reason", "can't find doctor by ID!");
		}
		
			
		return resultMap;
	}
	
	@ResponseBody
	@RequestMapping(path="/register",method=RequestMethod.POST)
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=utf-8")
	public Map<String, Object> register(@RequestParam("tel") String tel
								,@RequestParam("pwd") String pwd
								,@RequestParam("mail") String mail
			,@RequestParam("name") String name
			,@RequestParam("birthday") String birthday_str
			,@RequestParam("hospital_id") Integer hospital_id
			,@RequestParam("department_id") Integer department_id
			,@RequestParam("doctor_type_id") Integer doctor_type_id
			,@RequestParam("good_at") String good_at
			){	
		
		// validate if message is complete.
		log.info("@register");
		
		String photo="http://fakePhotoURL";
		boolean online_state=true;
		boolean has_video=false;
		/*
		String name, String pwd, String mail, String tel, String photo, Date birthday, Integer hospital_id,
		Integer department_id, Integer doctor_type_id, String good_at, Boolean online_state, Boolean has_video
		*/
		Date birthday=null;
		try {
			birthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthday_str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DoctorT doctor=new DoctorT(name, pwd, mail, tel, photo, birthday, hospital_id, department_id, doctor_type_id, good_at, online_state, has_video);
		
		int id=(int)doctorService.add(doctor);
		
		log.info("generatedId:"+id);
		
		doctor.setPwd(null);

		Map<String, Object> resultMap=new HashMap<>();
			resultMap.put("is_success", 1);
			resultMap.put("doctor", doctor);
		
		
		return resultMap;
	}
	
	@ResponseBody
	@RequestMapping(path="/changePwd/doctorId={doctorId}",method=RequestMethod.POST)
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=utf-8")
	public Map<String, Object> changePwd(@PathVariable("doctorId") int doctorId
										,@RequestParam(value="code",required=false) String code
										,@RequestParam("pwd") String pwd) {
		
		
		log.info("doctorId:"+doctorId+" code:"+code+" pwd:"+pwd);
		
		DoctorT doctor=doctorService.findById((int)doctorId);
			
			doctor.setPwd(pwd);
		
			doctorService.update(doctor);
		
		Map<String, Object> result=new HashMap<>();
			result.put("is_success", 1);
			
		return result;
	}
	

	@RequestMapping(path="/isExists?tel={tel}",method=RequestMethod.GET)
	public ResponseEntity<Map<String,Object>> checkExists(@PathVariable("tel") int tel){
		
		return null;
	}
	
	@ResponseBody
	@RequestMapping(path="/findByHospitalId/{hospitalId}",method=RequestMethod.GET)
	public List<DoctorT> findByHospitalId(@PathVariable("hospitalId") int hospitalId){
		return doctorService.findByHospitalId(hospitalId);
	}
	
	@ResponseBody
	@RequestMapping(path="/find/hospitalId={hospitalId}&departmentId={departmentId}",method=RequestMethod.GET)
	public List<DoctorT> findByHospitalAndDepartment(@PathVariable("hospitalId") int hospitalId,@PathVariable("departmentId") int departmentId){
		return doctorService.findByHospitalIdAndDepartmentId(hospitalId, departmentId);
	}
	
	

	
}
