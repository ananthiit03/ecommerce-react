/**
 * 
 */
package com.ecommerce.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.model.UserProfile;

/**
 * @author ananthi
 *
 */
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer>{

}
