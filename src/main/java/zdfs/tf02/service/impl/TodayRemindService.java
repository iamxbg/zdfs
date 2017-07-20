package zdfs.tf02.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zdfs.tf02.dao.TodayRemindMapper;
import zdfs.tf02.model.TodayRemind;
import zdfs.tf02.model.TodayRemindExample;
import zdfs.tf02.service.ITodayRemindService;

@Service
@Transactional
public class TodayRemindService implements ITodayRemindService{

	@Autowired
	private TodayRemindMapper mapper;
	
	public TodayRemindService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public List<TodayRemind> findByMemberId(int memberId){
		TodayRemindExample example=new TodayRemindExample();
			example.createCriteria().andDelflagEqualTo(false)
								.andMember_idEqualTo(String.valueOf(memberId));
			example.setOrderByClause("create_date");
			
								
			return mapper.selectByExample(example);					
	}

	@Override
	public List<TodayRemind> findByMemberIdAndDate(int memberId, Date today) {
		// TODO Auto-generated method stub
		
		TodayRemindExample example=new TodayRemindExample();
			example.createCriteria().andDelflagEqualTo(false)
									.andMember_idEqualTo(String.valueOf(memberId))
									.andCreate_dateGreaterThan(today);
			example.setOrderByClause("create_date");
			
			return mapper.selectByExample(example);
	}
	


}
