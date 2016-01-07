package com.linkor.service;

import com.linkor.model.UserProfile;

public interface UserSignUpService {

	UserProfile findByUserName(String UserName);

	UserProfile findByEmailId(String emailId);

	void saveUserSignUp(UserProfile userSignUp);
	
	boolean checkSignUp(String UserName,String emailId);

}
