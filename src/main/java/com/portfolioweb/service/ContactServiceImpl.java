package com.portfolioweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolioweb.Entity.ContactMessage;
import com.portfolioweb.repo.ContactRepo;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	public ContactRepo contactrepo;

	@Override
	public ContactMessage createmessage( ContactMessage contactmessage) {
		
		return contactrepo.save(contactmessage);
	}

	@Override
	public List<ContactMessage> getAllMessage() {
		
		return contactrepo.findAll();
		
	}

	@Override
	public void deleteMessage(Long id) {
		ContactMessage message=contactrepo.findById(id).orElseThrow(()->new RuntimeException("Message Not Found"));
		contactrepo.delete(message);
		
		
	}

	@Override
	public ContactMessage getMessageByid(Long id) {
	return	contactrepo.findById(id).orElseThrow(()->new RuntimeException("Message not Found"));
	}

	

	

	

}
