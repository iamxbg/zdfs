package zdfs.message;

public class MessageUtil {

		static final String DOCTOR_NAMESPACE="zdfs.doctor.";
		static final String PATIENT_NAMESPACE="zdfs.patient";
		
		static final int DOCTOR_NAMESPACE_EXPIRES_COUNT=10000;
		static final int PATIENT_NAMESPACE_EXPIRES_COUNT=10000;
		
		static final String CHANNEL_DOCTOR_LOGIN="doctor_login";
		static final String CHANNEL_DOCTOR_LOGOUT="doctor_logout";
		static final String CHANNEL_DOCTOR_HEARTBEAT="dcotro_heartbeat";
		
		static final String CHANNEL_PATIENT_LOGIN="patient_login";
		static final String CHANNEL_PATIENT_LOGOUT="patient_logout";
		static final String CHANNEL_PATIENT_HEARTBEAT="patient_heartbeat";
		
		static final int USER_EXISTS=1;
		static final int USER_ABSENT=0;
}
