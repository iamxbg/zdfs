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
import zdfs.tf02.dao.Rspo2DataMapper;
import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BfDataExample;
import zdfs.tf02.model.BpData;
import zdfs.tf02.model.BpDataExample;
import zdfs.tf02.model.EcgData;
import zdfs.tf02.model.EcgDataExample;
import zdfs.tf02.model.GluData;
import zdfs.tf02.model.GluDataExample;
import zdfs.tf02.model.Rspo2Data;
import zdfs.tf02.model.Rspo2DataExample;
import zdfs.tf02.service.IHealthDataService;

@Service
@Transactional
public class HealthDataService implements IHealthDataService {

	public HealthDataService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private GluDataMapper gluMapper;
	@Autowired
	private EcgDataMapper ecgMapper;
	@Autowired
	private BpDataMapper bpMapper;
	@Autowired
	private BfDataMapper bfMapper;
	@Autowired
	private Rspo2DataMapper rspo2Mapper;

	
	@Override
	public List<GluData> findGluDataByDateRange(int memberId, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		GluDataExample example=new GluDataExample();
			example.createCriteria().andMember_idEqualTo(String.valueOf(memberId))
									.andCreatetimeBetween(startDate, endDate);
			example.setOrderByClause("createtime");
		return gluMapper.selectByExample(example);
	}
	

	@Override
	public List<EcgData> findEcgDataByDateRange(int memberId, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		EcgDataExample example=new EcgDataExample();
		example.createCriteria().andMember_idEqualTo(String.valueOf(memberId))
								.andCreatetimeBetween(startDate, endDate);
		example.setOrderByClause("createtime");
	return ecgMapper.selectByExample(example);
	}

	@Override
	public List<BpData> findBpDataByDateRange(int memberId, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		BpDataExample example=new BpDataExample();
		example.createCriteria().andMember_idEqualTo(String.valueOf(memberId))
								.andCreatetimeBetween(startDate, endDate);
		example.setOrderByClause("createtime");
	return bpMapper.selectByExample(example);
	}

	@Override
	public List<Rspo2Data> findRspo2DataByDateRange(int memberId, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		Rspo2DataExample example=new Rspo2DataExample();
		example.createCriteria().andMember_idEqualTo(String.valueOf(memberId))
								.andCreatetimeBetween(startDate, endDate);
		example.setOrderByClause("createtime");
	return rspo2Mapper.selectByExample(example);
	}

	@Override
	public List<BfData> findBfDataByDateRange(int memberId, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		BfDataExample example=new BfDataExample();
		example.createCriteria().andMember_idEqualTo(String.valueOf(memberId))
								.andCreatetimeBetween(startDate, endDate);
		example.setOrderByClause("createtime");
		return bfMapper.selectByExample(example);
	}


	@Override
	public GluData findLastestGluData(int memberId) {
		// TODO Auto-generated method stub
		return gluMapper.findLatest(memberId);
	}


	@Override
	public EcgData findLastestEcgData(int memberId) {
		// TODO Auto-generated method stub
		return ecgMapper.findLatest(memberId);
	}


	@Override
	public BpData findLastestBpData(int memberId) {
		// TODO Auto-generated method stub
		return bpMapper.findLatest(memberId);
	}


	@Override
	public Rspo2Data findLastestRspo2Data(int memberId) {
		// TODO Auto-generated method stub
		return rspo2Mapper.findLatest(memberId);
	}


	@Override
	public BfData findLastestBfData(int memberId) {
		// TODO Auto-generated method stub
		return bfMapper.findLatest(memberId);
	}


}
