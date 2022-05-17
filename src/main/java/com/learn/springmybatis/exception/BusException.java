package com.learn.springmybatis.exception;

public class BusException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	private String code;
	
	public BusException(String msg){
		super(msg);
		this.msg=msg;
	}
	
	public BusException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public BusException(String code, Throwable e){
		super(e);
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
