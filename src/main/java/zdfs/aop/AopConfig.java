package zdfs.aop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AopConfig {

	private static Logger logger=LogManager.getLogger();
	
	public AopConfig() {
		// TODO Auto-generated constructor stub
	}
	
	@Pointcut("zdfs/**/*.*(**)")
	public void everyMethod(){
		
	}
	
	@Before(value="everyMethod()")
	public void logClassNameBeforeMethodExec(){
			logger.error("method run!");
	}
}
