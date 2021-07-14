package com.roomcleaning.model;

import org.springframework.stereotype.Component;

@Component
public class LoginModel {

	private String userId;
	private String password;
	
	

	public LoginModel() {
	}

	public LoginModel(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
