package com.linkor.dao;

import java.util.List;

import com.linkor.model.UserProfile;

public interface UserSignUpDAO {
	
	UserProfile findByUserName(String userName);
	
	UserProfile findByEmailId(String email);
	
	void saveUserSignUp(UserProfile userSignUp);
	
	List<UserProfile> checkSignUp(String userName,String emailId);
	
	List<UserProfile> checkLogin(String userName,String pasword);
	
}
