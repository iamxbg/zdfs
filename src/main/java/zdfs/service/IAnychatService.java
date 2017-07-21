package zdfs.service;

import java.util.List;

import zdfs.model.RDoctorAnychatT;
import zdfs.web.param.ResponseParam;

public interface IAnychatService {
	
	public void bindDoctorAndAnyChat(int doctorId,int anychatId);
	 
	public RDoctorAnychatT findByDoctorId(int doctorId);
	
	public RDoctorAnychatT findByAnychatId(int anychatId);
	
}
