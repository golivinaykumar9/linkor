package com.linkor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linkor.model.UserSignUp;
@Service("mailingService")
@Transactional
public class MailingServiceImpl implements MailingService {
	
	@Autowired
	JavaMailSender javaMailSender;

	@Override
	public void sendMail(String toAddress, String fromAddress, String subject, String msgBody) {

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(fromAddress);
		simpleMailMessage.setTo(toAddress);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(msgBody);
		javaMailSender.send(simpleMailMessage);
			
	}

}
