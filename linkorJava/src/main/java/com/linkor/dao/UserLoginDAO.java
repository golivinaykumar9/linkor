package com.linkor.dao;

import java.util.List;

import com.linkor.model.UserLogin;

public interface UserLoginDAO {
	void insertUserLogin(UserLogin userLogin);
	List<UserLogin> fetchByUsrNamePass(UserLogin userLogin);

}
