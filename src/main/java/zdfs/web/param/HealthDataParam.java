package zdfs.web.param;

public class HealthDataParam {

	private int memberId;
	private String startDateStr;
	private String endDateStr;
	
	public HealthDataParam() {
		// TODO Auto-generated constructor stub
	}

	public HealthDataParam(int memberId, String startDateStr, String endDateStr) {
		super();
		this.memberId = memberId;
		this.startDateStr = startDateStr;
		this.endDateStr = endDateStr;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getStartDateStr() {
		return startDateStr;
	}

	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}

	public String getEndDateStr() {
		return endDateStr;
	}

	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}
	
	

}
