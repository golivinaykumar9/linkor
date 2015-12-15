package com.linkor.ENUM;

public enum UserENUM {

	PENDING("PENDING"), 
	ACTIVE("ACTIVE"), 
	INACTIVE("INACTIVE"), 
	DELETED("DELETED"),
	FAILED("failed"),
	SUCESS("sucess"),
	TABSIGNUP("tabsignup"),
	TABLOGIN("tabLogin"),
	TABACTIVE("tab active"),
	NOTFOUND("notfound"),
	TABINACTIVE("tab");

	private String statusCode;

	private UserENUM(String s) {

		statusCode = s;
	}

	public String getStatusCode() {
		return statusCode;
	}
}
