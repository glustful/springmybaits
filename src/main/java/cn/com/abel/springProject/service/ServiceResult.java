package cn.com.abel.springProject.service;

public class ServiceResult<T> {

	private boolean succeed;
	private int code;
	private String msg;
	private T data;
	
	public ServiceResult(boolean succeed,int code,String msg,T data){
		this.succeed = succeed;
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public boolean isSucceed() {
		return succeed;
	}

	public void setSucceed(boolean succeed) {
		this.succeed = succeed;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
