package zdfs.tf02.service;

import java.util.Date;
import java.util.List;

import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BpData;
import zdfs.tf02.model.EcgData;
import zdfs.tf02.model.GluData;
import zdfs.tf02.model.Rspo2Data;
import zdfs.tf02.model.TodayRemind;

public interface IHealthDataService {

	public List<GluData> findGluDataByDateRange(int memberId,Date startDate,Date endDate);
	
	public List<EcgData> findEcgDataByDateRange(int memberId,Date startDate,Date endDate);
	
	public List<BpData> findBpDataByDateRange(int memberId,Date startDate,Date endDate);
	
	public List<Rspo2Data> findRspo2DataByDateRange(int memberId,Date startDate,Date endDate);
						
	public List<BfData> findBfDataByDateRange(int memberId,Date startDate,Date endDate);
	
	public GluData findLastestGluData(int memberId);
	
	public EcgData findLastestEcgData(int memberId);
	
	public BpData findLastestBpData(int memberId);
	
	public Rspo2Data findLastestRspo2Data(int memberId);
	
	public BfData findLastestBfData(int memberId);

	public List<TodayRemind> findTodayRemindByMemberId(int memberId);
	
	public List<TodayRemind> findTodayRemindByMemberIdAndDate(int memberId,Date today);
	
	public List<TodayRemind> findTodayRemindByMemberIdAndDateRange(int memberId,Date startDate,Date endDate);
	
}
