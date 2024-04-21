package com.cityguide.guider.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@JsonProperty(value = "Id")
	@Column(name = "customerId")
	int cutomerId;

	@JsonProperty(value = "UserName")
	@Column(name = "userName")
	String userName;

	@JsonProperty(value = "Password")
	@Column(name = "password")
	String password;

	@JsonProperty(value = "FirstName")
	@Column(name = "firstName")
	String firstName;

	@JsonProperty(value = "LastName")
	@Column(name = "lastName")
	String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
