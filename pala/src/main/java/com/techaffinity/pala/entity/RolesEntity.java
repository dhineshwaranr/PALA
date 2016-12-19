package com.techaffinity.pala.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

@Entity
@Table(name="role")
public class RolesEntity{

	@Id
	@GeneratedValue
	private int id;
	//private DateTime createdDate;
	
	//private DateTime modifiedDate;
	@NotNull
	private String roleName;

	@NotNull
	private String roleCode;
	
    @OneToOne
    @JoinColumn
	private UserEntity createdBy;
	
    //@ManyToOne(cascade = CascadeType.ALL)
    //@JoinTable(name="UserRole",joinColumns = @JoinColumn(name = "roleId"),inverseJoinColumns = @JoinColumn(name="userId"))
    @ManyToMany(mappedBy="role",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private List<UserEntity> user;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public UserEntity getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UserEntity createdBy) {
		this.createdBy = createdBy;
	}

	public List<UserEntity> getUser() {
		return user;
	}

	public void setUser(List<UserEntity> user) {
		this.user = user;
	}

	
	
}
