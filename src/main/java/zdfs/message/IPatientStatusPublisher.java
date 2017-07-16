package zdfs.message;

public interface IPatientStatusPublisher {
	
	public void login(int id);
	
	public void logout(int id);
	
	public void heartBeat(int id);
}
