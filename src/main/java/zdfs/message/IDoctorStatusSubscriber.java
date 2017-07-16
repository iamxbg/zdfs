package zdfs.message;

public interface IDoctorStatusSubscriber {
	
	void handleLogin(int did);
	
	void handleLogout(int did);
	
	void handleHeartbeat(int did);
	
	void handleExpireEvent(int did);
	
}
