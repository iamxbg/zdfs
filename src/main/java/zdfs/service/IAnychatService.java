package zdfs.service;

import zdfs.model.RDoctorAnychatT;
import zdfs.web.param.ResponseParam;

public interface IAnychatService {
	
	public ResponseParam<RDoctorAnychatT> bindDoctorAndAnyChat(int doctorId,int anychatId);
	
}
