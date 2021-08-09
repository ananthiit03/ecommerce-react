/**
 * 
 */
package com.ecommerce.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ananthi
 * Profile table mapped with UserProfile Entity
 *
 */
@Entity
@Table(name = "profile")
public class UserProfile implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	@Column(name="name")
	String name;
	@Column(name ="username")
	String userName;
	@Column(name="emailid")
	String emailId;
	@Column(name="address")
	String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserProfile(int id, String name, String userName, String emailId,  String address) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.emailId = emailId;
		this.address = address;
	}
	public UserProfile() {
		super();
	}
	

}
