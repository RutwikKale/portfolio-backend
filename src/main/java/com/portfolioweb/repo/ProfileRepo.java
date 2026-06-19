package com.portfolioweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolioweb.Entity.Profile;

public interface ProfileRepo  extends JpaRepository<Profile, Long> {
	

}
