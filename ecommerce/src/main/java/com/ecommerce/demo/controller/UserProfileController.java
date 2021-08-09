/**
 * 
 */
package com.ecommerce.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.Repository.UserProfileRepository;
import com.ecommerce.demo.model.UserProfile;
import com.ecommerce.demo.service.UserProfileService;

/**
 * @author ananthi
 *
 */
/**
 * 
 * UserProfile controller to list getProfile api and update profileapi
 *
 */
@CrossOrigin(origins={ "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping(value="/api")
public class UserProfileController {
	@Autowired
	UserProfileService userProfileService;
	
	/**
	 * 
	 * @param profile
	 * @return
	 */
	@PostMapping(value="/addUserProfile")
	public List<UserProfile> saveProfile(@RequestBody List<UserProfile> profile) {
		return userProfileService.saveProfile(profile);
		
	}
	/**
	 * 
	 * @return profileList
	 */
	@GetMapping(value="/userprofiles")
	public List<UserProfile> getProfile(){
		return userProfileService.getUserProfile();
	}
	/**
	 * 
	 * @param profile
	 * update profile
	 */
	@PutMapping(value="/update")
	public UserProfile updateProfile(@RequestBody UserProfile profile) {
		return userProfileService.saveProfile(profile);
		
	}
	

}
