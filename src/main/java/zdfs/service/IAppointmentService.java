package zdfs.service;

import java.util.Date;
import java.util.List;

import zdfs.model.AppointmentT;
import zdfs.model.AppointmentTExample;

public interface IAppointmentService extends CRUDService<AppointmentT>{

	
		List<AppointmentT> findByDoctorId(int doctorId);
		
		List<AppointmentT> findByMemberIdAndDoctorId(int doctorId,int memberId);

		
}
