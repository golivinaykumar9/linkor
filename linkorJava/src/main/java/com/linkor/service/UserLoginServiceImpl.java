package com.linkor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linkor.ENUM.UserENUM;
import com.linkor.dao.UserLoginDAO;
import com.linkor.model.UserLogin;

@Service("UserLoginService")
@Transactional
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	UserLoginDAO userLoginDAO;
	
	public String checkLogin(UserLogin userLogin) {
		List<UserLogin> listuserLoginDAO = userLoginDAO.fetchByUsrNamePass(userLogin);
		if(listuserLoginDAO == null){
			return UserENUM.NOTFOUND.getStatusCode();
		}else if(listuserLoginDAO.size() == 1){
			UserLogin userLoginResult = listuserLoginDAO.get(0);
			if(userLoginResult.getStateIndicater() != null){
				return userLoginResult.getStateIndicater();
			}
		}
		return null;
	}


}
