package com.linkor.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linkor.model.UserSignUp;
@Service("mailingService")
@Transactional
public class MailingServiceImpl implements MailingService {

	@Override
	public void sendMail(UserSignUp userSignUp, String Code) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Mail.xml");
   	 
    	MailMail mm = (MailMail) context.getBean("mailMail");
        mm.sendMail("Yong Mook Kim", "This is text content");
		
	}

}
