package zdfs.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zdfs.dao.RDoctorAnychatTMapper;
import zdfs.model.RDoctorAnychatT;
import zdfs.service.IAnychatService;
import zdfs.web.param.ResponseParam;

@Service
@Transactional
public class AnychatService implements IAnychatService{

	private RDoctorAnychatTMapper mapper;
	
	public AnychatService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResponseParam<RDoctorAnychatT> bindDoctorAndAnyChat(int doctorId, int anychatId) {
		// TODO Auto-generated method stub
		

	}

}
