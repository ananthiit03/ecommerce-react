/**
 * 
 */
package com.ecommerce.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.Repository.UserProfileRepository;
import com.ecommerce.demo.model.UserProfile;

/**
 * @author ananthi
 *
 */
@Service
public class UserProfileService {
	@Autowired
	private UserProfileRepository userProfileRepository;
	public List<UserProfile> saveProfile(List<UserProfile> profile){
		return userProfileRepository.saveAll(profile);
	}
   public List<UserProfile> getUserProfile(){
	return userProfileRepository.findAll();
   }
   public UserProfile saveProfile(UserProfile profile) {
	   UserProfile exsistingProfile = userProfileRepository.findById(profile.getId()).orElse(null);
		exsistingProfile.setName(profile.getName());
		exsistingProfile.setAddress(profile.getAddress());
		return userProfileRepository.save(exsistingProfile);
   }
}
