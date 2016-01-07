package com.linkor.service;

import com.linkor.model.UserProfile;

public interface MailingService {
	
	void sendMail(String toAddress, String fromAddress, String subject, String msgBody);

}
