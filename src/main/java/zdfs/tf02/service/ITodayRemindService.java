package zdfs.tf02.service;

import java.util.Date;
import java.util.List;

import zdfs.tf02.model.TodayRemind;

public interface ITodayRemindService {

	public List<TodayRemind> findByMemberId(int memberId);
	
	public List<TodayRemind> findByMemberIdAndDate(int memberId,Date today);
	
}
