package com.portfolioweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.portfolioweb.Entity.ContactMessage;

public interface ContactService {
	
	ContactMessage createmessage(ContactMessage contactmessage);

	List<ContactMessage> getAllMessage();


	ContactMessage getMessageByid(Long id);
	
	void deleteMessage(Long id);

	

}
