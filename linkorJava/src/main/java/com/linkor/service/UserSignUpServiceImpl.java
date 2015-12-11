package com.linkor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linkor.dao.UserSignUpDAO;
import com.linkor.model.UserSignUp;


@Service("userSignUpService")
@Transactional
public class UserSignUpServiceImpl implements UserSignUpService{
	
	@Autowired
	private UserSignUpDAO userSignUpDAO;

	public UserSignUp findByUserName(String UserName) {
		return userSignUpDAO.findByUserName(UserName);
	}

	public UserSignUp findByEmailId(String emailId) {
		return userSignUpDAO.findByEmailId(emailId);
	}

	public void saveUserSignUp(UserSignUp userSignUp) {
		userSignUpDAO.saveUserSignUp(userSignUp);
		
	}

	@SuppressWarnings("null")
	public boolean checkSignUp(String UserName, String emailId) {
		List<UserSignUp> checkSignUp = userSignUpDAO.checkSignUp(UserName, emailId);
		if(checkSignUp != null && checkSignUp.size() !=0){
			return false;
		}
		return true;
	}

}
