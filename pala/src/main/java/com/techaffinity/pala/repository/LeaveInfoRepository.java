package com.techaffinity.pala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techaffinity.pala.entity.LeavesInfo;
import com.techaffinity.pala.entity.User;

public interface LeaveInfoRepository extends JpaRepository<LeavesInfo, Integer> {
	
	public LeavesInfo save(LeavesInfo leaveInfo);
	public LeavesInfo findByUser(User user);

}
