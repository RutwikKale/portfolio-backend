package com.portfolioweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolioweb.Entity.ContactMessage;

public interface ContactRepo extends JpaRepository<ContactMessage, Long> {
	

}
