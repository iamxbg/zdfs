package zdfs.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import zdfs.model.HospitalT;
import zdfs.web.param.ResponseParam;

@ControllerAdvice(basePackages="zdfs.web")
public class CommonExceptionHandler {

	private static Logger log=LogManager.getLogger();
	
	public CommonExceptionHandler() {
		// TODO Auto-generated constructor stub
	}

	
	@ResponseBody
	@ExceptionHandler({DuplicateKeyException.class,DataIntegrityViolationException.class})
	public ResponseParam handleDuplicateKeyException(DataAccessException ex){
		
		log.error("@Message:"+ex.getMessage());
		log.error("@Most-Specific:"+ex.getMostSpecificCause().getMessage());
		log.error("@Root-Cause:"+ex.getRootCause().getMessage());
		
		return new ResponseParam(1, ex.getMostSpecificCause().getMessage());
	}
	

	
}
