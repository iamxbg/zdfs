package zdfs.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/user")
public class UserController {

	private static Logger log=LogManager.getLogger();
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(path="/login")
	public ResponseEntity login(@RequestParam("username") String username
			,@RequestParam("password") String password){
		
		log.info("username:"+username);
		log.info("password:"+password);
		
		
		return null;
		
	}

}
