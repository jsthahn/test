package com.ssa.getataxi.passenger.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "passengers")
public class Passenger {
	@Id
	private String id;
	
	@Version
	private long version;
	
	private String passengerId;
	private String name;
	private String email;
	private String password;
	private String verifiedPassword;
	private boolean accountEnabled;
	
	
	public String getId() {
	    return id;
	}
	
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVerifiedPassword() {
		return verifiedPassword;
	}
	public void setVerifiedPassword(String verifiedPassword) {
		this.verifiedPassword = verifiedPassword;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public boolean isAccountEnabled() {
		return accountEnabled;
	}

	public boolean getAccountEnabled() {
		return accountEnabled;
	}

	public void setAccountEnabled(boolean accountEnabled) {
		this.accountEnabled = accountEnabled;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
