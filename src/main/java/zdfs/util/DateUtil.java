package zdfs.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	
	public static Date getStartDateOfDate(Date date){
		Calendar cal=Calendar.getInstance();
			cal.setTime(date);
			
			cal.set(Calendar.HOUR_OF_DAY, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			
			return cal.getTime();
	}
	
	public static Date getDateEndDateOfDate(Date date){
		Calendar cal=Calendar.getInstance();
			cal.setTime(date);
			
			cal.set(Calendar.HOUR_OF_DAY, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			
			cal.add(Calendar.DAY_OF_MONTH, 1);
			
			return cal.getTime();
	}
}
