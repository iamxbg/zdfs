package zdfs.tf02.service;

import java.util.Date;
import java.util.List;

import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BpData;
import zdfs.tf02.model.EcgData;
import zdfs.tf02.model.GluData;
import zdfs.tf02.model.Rspo2Data;

public interface IHealthDataService {

	public List<GluData> findGluDataByDateRange(int memberId,Date startDate,Date endDate);
	
	public List<EcgData> findEcgDataByDateRange(int memberId,Date startDate,Date endDate);
	
	public List<BpData> findBpDataByDateRange(int memberId,Date startDate,Date endDate);
	
	public List<Rspo2Data> findRspo2DataByDateRange(int memberId,Date startDate,Date endDate);
						
	public List<BfData> findBfDataByDateRange(int memberId,Date startDate,Date endDate);
}
