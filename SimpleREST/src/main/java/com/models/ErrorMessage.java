package com.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	
	private int statusCode;
	private String errorMsg;
	private String documentation;
	
	public ErrorMessage() {
		
	}
	
	public ErrorMessage(int statusCode, String errorMsg, String documentation) {
		this.statusCode = statusCode;
		this.errorMsg = errorMsg;
		this.documentation = documentation;
	}

	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getDocumentation() {
		return documentation;
	}
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
}
