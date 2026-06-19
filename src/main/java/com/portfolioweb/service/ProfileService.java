package com.portfolioweb.service;

import com.portfolioweb.Entity.Profile;

public interface ProfileService  {
	Profile getProfile();
	Profile createProfile(Profile profile);
	Profile updateProfile(Long id, Profile profile);
	
	
	

}
