package com.linkor.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linkor.ENUM.UserENUM;
import com.linkor.dao.UserLoginDAO;
import com.linkor.dao.UserSignUpDAO;
import com.linkor.model.UserLogin;
import com.linkor.model.UserSignUp;


@Service("userSignUpService")
@Transactional
public class UserSignUpServiceImpl implements UserSignUpService{
	
	@Autowired
	private UserSignUpDAO userSignUpDAO;
	
	@Autowired
	private UserLoginDAO userLoginDAO;
	
	@Autowired
	private MailingService mailingService;

	public UserSignUp findByUserName(String UserName) {
		return userSignUpDAO.findByUserName(UserName);
	}

	public UserSignUp findByEmailId(String emailId) {
		return userSignUpDAO.findByEmailId(emailId);
	}

	public void saveUserSignUp(UserSignUp userSignUp) {
		userSignUpDAO.saveUserSignUp(userSignUp);
		UserLogin userLogin = new UserLogin();
		userLogin.setCreatedDate(new Date());
		userLogin.setPassword(userSignUp.getPassword());
		userLogin.setRole("user");
		userLogin.setStateIndicater(UserENUM.PENDING.getStatusCode());
		userLogin.setStatus(UserENUM.ACTIVE.getStatusCode());
		userLogin.setUpdatedDate(new Date());
		userLogin.setUserName(userSignUp.getUserName());
		userLogin.setVerificationCode(Integer.toString(new Random().nextInt(100000000)));
		userLogin.setEmailId(userSignUp.getEmailId());
		userLoginDAO.insertUserLogin(userLogin);
		mailingService.sendMail(userSignUp.getEmailId(), "golivinaykumar9@gmail.com", "Verification Code", "Verification Code  "+userLogin.getVerificationCode());
		
		
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
