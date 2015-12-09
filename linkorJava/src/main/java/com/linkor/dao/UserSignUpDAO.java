package com.linkor.dao;

import java.util.List;

import com.linkor.model.UserSignUp;

public interface UserSignUpDAO {
	
	UserSignUp findByUserName(String userName);
	
	UserSignUp findByEmailId(String email);
	
	void saveUserSignUp(UserSignUp userSignUp);
	
	List<UserSignUp> checkSignUp(String userName,String emailId);
	
}
