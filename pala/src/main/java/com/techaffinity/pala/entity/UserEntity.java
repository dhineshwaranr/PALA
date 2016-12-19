package com.techaffinity.pala.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

@Entity
@Table(name="user")
public class UserEntity{
	
	@Id
	@GeneratedValue
	private int id;
	//private DateTime createdDate;
	//private DateTime modifiedDate;
	@NotNull
	private String userName;
	@NotNull
	private String password;
	@NotNull
	private String conformPassword;
	@NotNull
	private boolean isEnabled;
	@NotNull
	private boolean isActive;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<RolesEntity> roles;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getConformPassword() {
		return conformPassword;
	}
	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public List<RolesEntity> getRoles() {
		return roles;
	}
	public void setRoles(List<RolesEntity> roles) {
		this.roles = roles;
	}
	
	
	
}
