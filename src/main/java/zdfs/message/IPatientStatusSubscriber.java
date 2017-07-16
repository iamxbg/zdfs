package zdfs.message;

public interface IPatientStatusSubscriber {
	
	void handleLogin(int patientId);
	
	void handleLogout(int patientId);
	
	void handleHeartbeat(int patientId);
	
	void handleExpireEvent(int patientId);
}
