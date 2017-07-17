package zdfs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zdfs.dao.DoctorTMapper;
import zdfs.model.DoctorT;
import zdfs.service.IDoctorService;

@Service
public class DoctorService implements IDoctorService {

	@Autowired
	private DoctorTMapper dMapper;
	
	@Override
	public int register(DoctorT doctor) {
		// TODO Auto-generated method stub
		
		return dMapper.insert(doctor);
		
	}

}
