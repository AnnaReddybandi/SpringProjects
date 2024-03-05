package com.jsp.bootdemo.helper;

public class ResponseStructure<T>{
	
	private int statuscode;
	private String meg;
	private T data;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMeg() {
		return meg;
	}
	public void setMeg(String meg) {
		this.meg = meg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	

}
