package zdfs.util;

import java.util.Calendar;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AgeUtil {

	private static Logger log=LogManager.getLogger();
	
	public AgeUtil() {
		// TODO Auto-generated constructor stub
	}

	public static int computeAgeByBirthday(Date birthday){
		Date now=new Date();
		
		Calendar nowCal=Calendar.getInstance();
			nowCal.setTime(now);
			int nowYear=nowCal.get(Calendar.YEAR);
			int nowMonth=nowCal.get(Calendar.MONTH)+1;
			int nowDay=nowCal.get(Calendar.DAY_OF_MONTH);
			
		Calendar birthCal=Calendar.getInstance();
			birthCal.setTime(birthday);
			int birthYear=nowCal.get(Calendar.YEAR);
			int birthMonth=nowCal.get(Calendar.MONTH)+1;
			int birthDay=nowCal.get(Calendar.DAY_OF_MONTH);
			
			
			log.info("now calendar:"+"Y:"+nowYear+"M:"+nowMonth+"D:"+nowDay);
			log.info("birth calendar:"+"Y:"+birthYear+"M:"+birthMonth+"D:"+birthDay);
			if(nowMonth>birthMonth||(birthMonth==nowMonth && birthDay<nowDay)){
				
				log.info("age:"+(nowYear-birthYear-1));
				return nowYear-birthYear-1;
			}else{
				log.info("age:"+(nowYear-birthYear));
				return nowYear-birthYear;
			}
				
	}
}
