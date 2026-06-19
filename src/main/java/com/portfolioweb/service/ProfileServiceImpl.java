package com.portfolioweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolioweb.Entity.Profile;
import com.portfolioweb.repo.ProfileRepo;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepo repo;

    @Override
    public Profile getProfile() {
        return repo.findAll().get(0);
    }

    @Override
    public Profile createProfile(Profile profile) {
        return repo.save(profile);
    }

    @Override
    public Profile updateProfile(Long id, Profile profile) {

        Profile existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Profile not found"));

        existing.setFullName(profile.getFullName());
        existing.setDesignation(profile.getDesignation());
        existing.setBio(profile.getBio());
        existing.setEmail(profile.getEmail()); 
        existing.setGithubUrl(profile.getGithubUrl());
        existing.setLinkedinUrl(profile.getLinkedinUrl());
        existing.setResumeUrl(profile.getResumeUrl());
       

        return repo.save(existing);
    }

	

	
}
