package zdfs.message;

import java.io.Serializable;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DoctorMessageDelegate implements MessageDelegate {

	private static Logger log=LogManager.getLogger();
	
	public DoctorMessageDelegate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMessage(String message) {
		// TODO Auto-generated method stub
		log.info(message);
		
	}



}
