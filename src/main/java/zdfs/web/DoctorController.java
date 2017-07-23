package zdfs.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

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
import org.springframework.web.multipart.MultipartFile;

import zdfs.model.DiagnoseT;
import zdfs.model.DoctorT;
import zdfs.model.RDoctorAnychatT;
import zdfs.service.IDoctorService;
import zdfs.service.impl.AnychatService;
import zdfs.service.impl.DoctorService;
import zdfs.web.param.ResponseParam;


@Controller
@RequestMapping(path="/doctor")
public class DoctorController {
	
	private static Logger log=LogManager.getLogger();

	
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private AnychatService anychatService;
	
	
	@ResponseBody
	//@Consumes("applicaton/x-www-form-urlencoded")
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
	@RequestMapping(path="/logout/doctorId={doctorId}",method=RequestMethod.POST)
	public ResponseParam<DoctorT> logout(@PathVariable("doctorId") int doctorId){
		
		return new ResponseParam<>();
	}
	
	@ResponseBody
	@RequestMapping(path="/getAnyChatId/doctorId={doctorId}",method=RequestMethod.GET)
	public ResponseParam<RDoctorAnychatT> getRDoctorAnychatT(@PathVariable("doctorId") int doctorId){
		
		RDoctorAnychatT RDA=anychatService.findByDoctorId(doctorId);
		if(RDA!=null) {
			List<RDoctorAnychatT> rdaList=new ArrayList<>();
				rdaList.add(RDA);
			return new ResponseParam<>(rdaList);
		}else {
			return new ResponseParam<>(1, "NOT FOUND");
		}

	}
	
	@ResponseBody
	@RequestMapping(path="/update"
		,method=RequestMethod.POST
		,produces={"application/json;charset=utf-8"}
		,consumes={"application/json;charset=utf-8"})
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
	@RequestMapping(path="/register"
		,method=RequestMethod.POST,consumes="multipart/form-data")
	public ResponseParam<DoctorT> register(@RequestParam("tel") String tel
								,@RequestParam("pwd") String pwd
								,@RequestParam("mail") String mail
								,@RequestParam("name") String name
								,@RequestParam("birthday") String birthday_str
								,@RequestParam("hospital_id") Integer hospital_id
								,@RequestParam("department_id") Integer department_id
								,@RequestParam("doctor_type_id") Integer doctor_type_id
								,@RequestParam("good_at") String good_at
								,@RequestParam(name="photo",required=false) MultipartFile picture,
								HttpServletRequest req
			){	
		
		ResponseParam<DoctorT> resp=new ResponseParam<>();
		
		// validate if message is complete.
		log.info("@register");
		
		String photo="none";
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
			return new ResponseParam<>(5,"Birthday Date format error!");
		}
		

		
		DoctorT doctor=new DoctorT(name, pwd, mail, tel, photo, birthday, hospital_id, department_id, doctor_type_id, good_at, online_state, has_video);
		
		if(picture!=null){
			if(picture.getSize()>4*1024*1024){
				return new ResponseParam<>(6, "Picture is too big!");
			}
			String[] allowed={"image/x-png","image/png","image/pjpeg","image/jpeg","image/bmp"};
			boolean isAllowed=false;
			for(String a:allowed){
				if(a.equals(picture.getContentType())){
					isAllowed=true;
					break;
				}
			}
			if(isAllowed){
				
				File dir=new File(req.getServletContext().getRealPath("/")+"image/");
				if(!dir.exists()) dir.mkdirs();
				
				
				File pictureFile=new File(req.getServletContext().getRealPath("/")+"/image/doctor_"+tel+"_"+picture.getOriginalFilename().substring(picture.getOriginalFilename().lastIndexOf(".")));

				
				
				try {
					
					log.info("save picture to:"+pictureFile.getAbsolutePath());
					picture.transferTo(pictureFile);
					doctor.setPhoto(pictureFile.getName());
					doctorService.update(doctor);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return new ResponseParam<>(4, e.getCause().getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return new ResponseParam<>(3, "File Writer error");
				}
			}else{
				 ResponseParam<DoctorT> response=new ResponseParam<>();
				 response.setCode(2);
				 response.setInfo("picture type is not allowed :"+picture.getContentType());
			}
		}
		
		doctorService.add(doctor);
		
		doctor.setPwd(null);

		
		List<DoctorT> dList=new ArrayList<>();
			dList.add(doctor);
			
		resp.setData(dList);
		
		return resp;
	}
	
	@ResponseBody
	@RequestMapping(path="/changePwd/tel={tel}"
		,method=RequestMethod.POST
		,produces={"application/x-www-form-urlencoded"}
		,consumes={"application/json;charset=utf-8"})
	public ResponseParam<DoctorT> changePwd(@PathVariable("tel") String tel
										,@RequestParam("pwd") String pwd) {
		
		
		ResponseParam<DoctorT> resp=new ResponseParam<>();

		List<DoctorT> doctorList=doctorService.findByTel(tel);	
		
			if(doctorList!=null && doctorList.size()>0) {
				
				DoctorT doctor=doctorList.get(0);
				doctor.setPwd(pwd);
				doctorService.update(doctor);
				resp.setInfo("success");
			}else {
				resp.setCode(1);
				resp.setInfo("Tel not found!");
			}
			
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
	
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping(path="/findByTel/tel={tel}")
	public ResponseParam findByTel(@PathVariable("tel") String tel){
		ResponseParam<DoctorT> resp=new ResponseParam();
		
		List<DoctorT> dList=doctorService.findByTel(tel);
		if(dList!=null && dList.size()>0){
			return new ResponseParam<>(dList);
		}else
			return new ResponseParam<>(1, "用戶不存在!");
	}
	
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping(path="/checkIfExists/tel={tel}")
	public ResponseParam checkIfExists(@PathVariable("tel") String tel){
		ResponseParam resp=new ResponseParam<>();
		List<DoctorT> dList=doctorService.findByTel(tel);
		return dList.size()>0?new ResponseParam<>():new ResponseParam<>(1, "沒有電話!");
	}
	
	@ResponseBody
	@RequestMapping(path="/bindAnyChat/doctorId={doctorId}&anychatId={anychatId}")
	public ResponseParam<DoctorT> bindAnyChat(@PathVariable("doctorId") int doctorId,@PathVariable("anychatId") int anychatId){
		RDoctorAnychatT rda=anychatService.findByAnychatId(anychatId);
		if(rda!=null) {
			return new ResponseParam<>(1, "anychatId:"+rda.getAnychat_id()+" already bind for doctorId:"+rda.getDoctor_id());
		}else {
			anychatService.bindDoctorAndAnyChat(doctorId, anychatId);
			return new ResponseParam<>();
		}
	}
	
	@ResponseBody
	@RequestMapping(path="/changePhoto/doctorId={doctorId}",consumes="multipart/form-data",method=RequestMethod.POST)
	public ResponseParam<DoctorT> changePhoto(@PathVariable("doctorId") int doctorId,@RequestParam("photo") MultipartFile picture,HttpServletRequest req){
		DoctorT doctor=doctorService.findById(doctorId);
		if(doctor!=null){
			if(picture!=null){
				if(picture.getSize()>4*1024*1024){
					return new ResponseParam<>(6, "Picture is too big!");
				}
				String[] allowed={"image/x-png","image/png","image/pjpeg","image/jpeg","image/bmp"};
				boolean isAllowed=false;
				for(String a:allowed){
					if(a.equals(picture.getContentType())){
						isAllowed=true;
						break;
					}
				}
				if(isAllowed){
					
					File dir=new File(req.getServletContext().getRealPath("/")+"image/");
					if(!dir.exists()) dir.mkdirs();
					
					String tel=doctor.getTel();
					
					File pictureFile=new File(req.getServletContext().getRealPath("/")+"/image/doctor_"+tel+"_"+picture.getOriginalFilename().substring(picture.getOriginalFilename().lastIndexOf(".")));
			
					try {
						
						picture.transferTo(pictureFile);

						return new ResponseParam<>(0, "success");
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return new ResponseParam<>(4, e.getCause().getMessage());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return new ResponseParam<>(3, "File Writer error");
					}
				}else{
					 ResponseParam<DoctorT> response=new ResponseParam<>();
					 response.setCode(2);
					 response.setInfo("picture type is not allowed :"+picture.getContentType());
				}
			}else{
				return new ResponseParam<>(2, "Picture is Null");
			}
		}else{
			return new ResponseParam<>(1, "doctor not found!");
		}
		return null;
	
	}
}
