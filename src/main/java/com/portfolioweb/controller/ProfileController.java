package com.portfolioweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolioweb.Entity.Profile;
import com.portfolioweb.service.ProfileService;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/profile")
@RequiredArgsConstructor
public class ProfileController {
	@Autowired
	public ProfileService service;

	@GetMapping()
	public Profile getProfile(@RequestParam Profile profile) {
		return service.getProfile();
	}

	@PostMapping()
	public Profile createProfile(@RequestBody Profile profile) {

		return service.createProfile(profile);
	}

	@PutMapping("/{id}")
	public Profile updateProfile(@PathVariable Long id, @RequestBody Profile profile) {

		return service.updateProfile(id, profile);
	}
}
