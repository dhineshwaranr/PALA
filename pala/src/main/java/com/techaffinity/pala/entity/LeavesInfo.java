package com.techaffinity.pala.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="leaveInfo")
public class LeavesInfo {

	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private int totalClCount;
	
	@NotNull
	private int totalElCount;
	
	@NotNull
	private int totalCompOffCount;

	@OneToOne
	@JoinColumn
	private User user;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalClCount() {
		return totalClCount;
	}

	public void setTotalClCount(int totalClCount) {
		this.totalClCount = totalClCount;
	}

	public int getTotalElCount() {
		return totalElCount;
	}

	public void setTotalElCount(int totalElCount) {
		this.totalElCount = totalElCount;
	}

	public int getTotalCompOffCount() {
		return totalCompOffCount;
	}

	public void setTotalCompOffCount(int totalCompOffCount) {
		this.totalCompOffCount = totalCompOffCount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
		
}
