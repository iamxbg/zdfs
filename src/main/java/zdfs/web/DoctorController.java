package zdfs.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import zdfs.web.param.ResponseParam;


@RestController
@RequestMapping(path="/doctor")
public class DoctorController {
	
	private static Logger log=LogManager.getLogger();

	
	@Autowired
	private DoctorService doctorService;
	
	@ResponseBody
	@Consumes("applicaton/x-www-form-urlencoded")
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public ResponseParam<DoctorT> login(@RequestParam("tel") String tel
			,@RequestParam("pwd") String pwd){
		
		log.info("username:"+tel);
		log.info("password:"+pwd);
		
		ResponseParam<DoctorT> resp=new ResponseParam<>();
		
		List<DoctorT> dList= doctorService.findByTelAndPwd(tel, pwd);
		
		Map<String, Object> result=new HashMap<>();
		if(dList.size()>0){
			
			dList.get(0).setPwd("");;
			resp.setData(dList);
			
		}else{
			resp.setCode(1);
		}
		
		return resp;

	}
	
	@ResponseBody
	@RequestMapping(path="/update",method=RequestMethod.POST)
	@Consumes("application/json;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	public ResponseParam<DoctorT> update(@RequestBody DoctorT doctor){
		
		DoctorT old=doctorService.findById(doctor.getId());
		
		ResponseParam<DoctorT> resp=new ResponseParam<>();
		if(old!=null){
			doctor.setPwd(old.getPwd());
			doctorService.update(doctor);
				doctor.setPwd(null);
			
			List<DoctorT> dList=new ArrayList<>();
				dList.add(doctor);
		
				resp.setData(dList);
				
		}else{
	
			resp.setCode(1);
		}
		
			
		return resp;
	}
	
	@ResponseBody
	@RequestMapping(path="/register",method=RequestMethod.POST)
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=utf-8")
	public ResponseParam<DoctorT> register(@RequestParam("tel") String tel
								,@RequestParam("pwd") String pwd
								,@RequestParam("mail") String mail
			,@RequestParam("name") String name
			,@RequestParam("birthday") String birthday_str
			,@RequestParam("hospital_id") Integer hospital_id
			,@RequestParam("department_id") Integer department_id
			,@RequestParam("doctor_type_id") Integer doctor_type_id
			,@RequestParam("good_at") String good_at
			){	
		
		ResponseParam<DoctorT> resp=new ResponseParam<>();
		
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

		
		List<DoctorT> dList=new ArrayList<>();
			dList.add(doctor);
			
		resp.setData(dList);
		
		return resp;
	}
	
	@ResponseBody
	@RequestMapping(path="/changePwd/doctorId={doctorId}",method=RequestMethod.POST)
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=utf-8")
	public ResponseParam<DoctorT> changePwd(@PathVariable("doctorId") int doctorId
										,@RequestParam(value="code",required=false) String code
										,@RequestParam("pwd") String pwd) {
		
		
		ResponseParam<DoctorT> resp=new ResponseParam<>();
		
		log.info("doctorId:"+doctorId+" code:"+code+" pwd:"+pwd);
		
		DoctorT doctor=doctorService.findById((int)doctorId);
			
			doctor.setPwd(pwd);
		
			doctorService.update(doctor);


			List<DoctorT> dList=new ArrayList<>();
				dList.add(doctor);
			
			resp.setData(dList);
			
		return resp;
	}
	

	
	@ResponseBody
	@RequestMapping(path="/findByHospitalId/hospitalId={hospitalId}",method=RequestMethod.GET)
	public ResponseParam<DoctorT> findByHospitalId(@PathVariable("hospitalId") int hospitalId){
		ResponseParam<DoctorT> resp=new ResponseParam<>();
		List<DoctorT> dList= doctorService.findByHospitalId(hospitalId);
		resp.setData(dList);
		return resp;
	}
	
	@ResponseBody
	@RequestMapping(path="/find/hospitalId={hospitalId}&departmentId={departmentId}",method=RequestMethod.GET)
	public ResponseParam<DoctorT> findByHospitalAndDepartment(@PathVariable("hospitalId") int hospitalId,@PathVariable("departmentId") int departmentId){
		ResponseParam<DoctorT> resp=new ResponseParam<>();
		List<DoctorT> dList= doctorService.findByHospitalIdAndDepartmentId(hospitalId, departmentId);
		resp.setData(dList);
		
		return resp;
	}
	
	

	
}
