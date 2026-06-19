package com.portfolioweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolioweb.Entity.ContactMessage;
import com.portfolioweb.service.ContactService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController

@RequestMapping("/api/contactmessage")

public class ContactController {
	@Autowired
	public ContactService contactservice;
	
	@PostMapping()
	public ContactMessage createContactController(@RequestBody ContactMessage contactmessage) {
	return	contactservice.createmessage(contactmessage)
;		
		
	}
	@GetMapping()
	public List<ContactMessage> getAllMessage() {
		return contactservice.getAllMessage();
	}
	@GetMapping("/{id}")
	public ContactMessage getMessageById(@PathVariable Long id) {
		return contactservice.getMessageByid(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteMessageById(@PathVariable Long id) {
		 contactservice.deleteMessage(id);
		 return " Message Deleted Successfully";
		
	}
	

}
