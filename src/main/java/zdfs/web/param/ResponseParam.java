package zdfs.web.param;

import java.util.List;

public class ResponseParam <T>{

	private List<T> data;
	private int code=0;
	private String info="";
	
	
	public ResponseParam() {
		// TODO Auto-generated constructor stub
	}


	public ResponseParam(List<T> data, int code, String info) {
		super();
		this.data = data;
		this.code = code;
		this.info = info;
	}


	public ResponseParam(List<T> data) {
		super();
		this.data = data;
	}


	public ResponseParam(int code, String info) {
		super();
		this.code = code;
		this.info = info;
	}


	public List<T> getData() {
		return data;
	}


	public void setData(List<T> data) {
		this.data = data;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}

	
	
}
