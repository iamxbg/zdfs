package zdfs.web;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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


@Controller
@RequestMapping(path="/doctor")
public class DoctorController {
	
	private static Logger log=LogManager.getLogger();
	

	
	@RequestMapping(path="/login")
	public ResponseEntity login(@RequestParam("username") String username
			,@RequestParam("password") String password){
		
		log.info("username:"+username);
		log.info("password:"+password);
		
		
		return null;
		
	}
	
	
	@RequestMapping(path="/register",method=RequestMethod.POST)
	public ResponseEntity register(@RequestParam("tel") int tel
								,@RequestParam("code") String code
								,@RequestParam("pwd") String pwd
								,@RequestParam("email") String email
			,@RequestParam("name") String name
			,@RequestParam("birthday") String birthday
			,@RequestParam("hospital") String hospital
			,@RequestParam("department") String department
			,@RequestParam("job") String job
			,@RequestParam("good_at") String good_at
			){	
		
		// validate if message is complete.
		log.info("@register");
		
		return null;
	}
	
	@ResponseBody
	@RequestMapping(path="/listByDepartment",method=RequestMethod.POST)
	@Consumes("application/json;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	public List<DoctorT> findByDepartment(@RequestParam("hid") int hid,@RequestParam("did") int did){
		return null;
		
	}
	
	
	@RequestMapping(path="/changePwd",method=RequestMethod.POST)
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=utf-8")
	public ResponseEntity changePwd(@RequestParam("code") String code,@RequestParam("pwd") String pwd) {
		
		return null;
	}
	
	@RequestMapping(path="/listPatents",method=RequestMethod.POST,consumes= {"application/json"},produces= {"application/json"})
	public ResponseEntity listPatients(@PathVariable("did") int did,@PathVariable("page") int page) {
		return null;
	}
	
	
	
	@RequestMapping(path="/findPatient",method=RequestMethod.POST,consumes= {"application/json"},produces= {"application/json"})
	public ResponseEntity listStatusOfPatient(@PathVariable("pid") int pid) {
		return null;
	}
	
	
	
	@RequestMapping(path="/isExists?tel={tel}",method=RequestMethod.GET)
	public ResponseEntity<Map<String,Object>> checkExists(@PathVariable("tel") int tel){
		
		return null;
	}
	
	
	@RequestMapping(path="/changeProfile?did={did}")
	public ResponseEntity<Map<String, Object>> changeProfile(@PathVariable("did") int did){
		return null;
	}
	
	@RequestMapping(path="/addPatient?did={did}&pid={pid}")
	public ResponseEntity<Map<String, String>> addPatient(@PathVariable("did") int did,@PathVariable("pid") int pid){
		return null;
	}
	
	@RequestMapping(path="/searchPatinet?did={did}",method=RequestMethod.POST)
	public ResponseEntity<Map<String, String>> searchPatient(@PathVariable("did") int did,String pName,String SN,String date){
		return null;
	}
	
	@RequestMapping(path="/findPatientBySFZ?cid={cid}",method=RequestMethod.POST)
	public ResponseEntity<Map<String, String>> findPatientByCid(@PathVariable("cid") String cid){
		return null;
	}
	
	@RequestMapping(path="/uploadDiagnoseInfo?did={did}")
	public Map<String, Object> uploadDiagnoseInfo(@PathVariable("did") int did,@RequestBody DiagnoseT diagnose){
		return null;
	}
	
	@RequestMapping(path="/listDInfos?did={did}")
	public List<DiagnoseT> ListDInfos(@PathVariable("did") int did){
		return null;
	}
	
	@RequestMapping(path="/embarkAppointment?did={did}&pid={pid}")
	public String embarkAppointment(int did,int pid) {
		return null;
	}
	

	
}
