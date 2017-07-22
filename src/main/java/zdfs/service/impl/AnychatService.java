package zdfs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zdfs.dao.RDoctorAnychatTMapper;
import zdfs.model.DoctorT;
import zdfs.model.RDoctorAnychatT;
import zdfs.model.RDoctorAnychatTExample;
import zdfs.service.IAnychatService;
import zdfs.web.param.ResponseParam;

@Service
@Transactional
public class AnychatService implements IAnychatService{

	@Autowired
	private RDoctorAnychatTMapper mapper;
	
	public AnychatService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bindDoctorAndAnyChat(int doctorId, int anychatId) {
		// TODO Auto-generated method stub
		RDoctorAnychatT rda=mapper.selectByPrimaryKey(doctorId);
		if(rda!=null) {
			rda.setAnychat_id(anychatId);
			mapper.updateByPrimaryKey(rda);
		}else {
			RDoctorAnychatT RDA=new RDoctorAnychatT();
				RDA.setAnychat_id(anychatId);
				RDA.setDoctor_id(doctorId);
				mapper.insert(RDA);
		}

	}

	@Override
	public RDoctorAnychatT findByDoctorId(int doctorId) {
		// TODO Auto-generated method stub
		RDoctorAnychatT rda=mapper.selectByPrimaryKey(doctorId);
		return rda;
	}
	
	
	public RDoctorAnychatT findByAnychatId(int anychatId) {
			RDoctorAnychatTExample example= new RDoctorAnychatTExample();
			example.createCriteria().andAnychat_idEqualTo(anychatId)
									.andDelflagEqualTo(false);
			example.setOrderByClause("id");
		
			List<RDoctorAnychatT>  rdaList=mapper.selectByExample(example);
			if(rdaList!=null && rdaList.size()>0)
				return rdaList.get(0);
			else 
				return null;
	}
	
	

}
