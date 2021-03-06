package zdfs.tf02.service;

import java.util.Date;
import java.util.List;

import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BpData;
import zdfs.tf02.model.EcgData;
import zdfs.tf02.model.GluData;
import zdfs.tf02.model.MembersInfo;
import zdfs.tf02.model.Rspo2Data;

public interface IMembersInfoService {
	
	public MembersInfo findByMemberId(int memberId);
	
}
