package zdfs.tf02.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zdfs.tf02.dao.BfDataMapper;
import zdfs.tf02.dao.BpDataMapper;
import zdfs.tf02.dao.EcgDataMapper;
import zdfs.tf02.dao.GluDataMapper;
import zdfs.tf02.dao.MembersInfoMapper;
import zdfs.tf02.dao.Rspo2DataMapper;
import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BfDataExample;
import zdfs.tf02.model.BpData;
import zdfs.tf02.model.BpDataExample;
import zdfs.tf02.model.EcgData;
import zdfs.tf02.model.EcgDataExample;
import zdfs.tf02.model.GluData;
import zdfs.tf02.model.GluDataExample;
import zdfs.tf02.model.MembersInfo;
import zdfs.tf02.model.Rspo2Data;
import zdfs.tf02.model.Rspo2DataExample;
import zdfs.tf02.service.IMembersInfoService;

@Service
@Transactional
public class MembersInfoService implements IMembersInfoService {


	@Autowired
	private MembersInfoMapper miMapper;
	
	public MembersInfoService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MembersInfo findByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return miMapper.selectByPrimaryKey(memberId);
	}


	
	
}
