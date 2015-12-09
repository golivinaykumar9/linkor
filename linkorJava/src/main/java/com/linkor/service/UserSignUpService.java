package com.linkor.service;

import com.linkor.model.UserSignUp;

public interface UserSignUpService {

	UserSignUp findByUserName(String UserName);

	UserSignUp findByEmailId(String emailId);

	void saveUserSignUp(UserSignUp userSignUp);
	
	boolean checkSignUp(String UserName,String emailId);

}
