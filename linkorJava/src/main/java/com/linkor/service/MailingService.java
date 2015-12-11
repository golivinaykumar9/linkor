package com.linkor.service;

import com.linkor.model.UserSignUp;

public interface MailingService {
	
	void sendMail(UserSignUp userSignUp, String Code);

}
