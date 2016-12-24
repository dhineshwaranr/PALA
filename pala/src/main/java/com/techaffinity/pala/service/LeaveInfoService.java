package com.techaffinity.pala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaffinity.pala.entity.LeavesInfo;
import com.techaffinity.pala.entity.User;
import com.techaffinity.pala.repository.LeaveInfoRepository;
import com.techaffinity.pala.repository.UserRepository;

@Service
public class LeaveInfoService {
	
	@Autowired
	private LeaveInfoRepository leaveInfoRepo;
	@Autowired
	private UserRepository userRepo;
	
	
	public LeavesInfo addLeaveInfo(LeavesInfo leaveInfo){
		LeavesInfo addLeaveInfo = leaveInfoRepo.save(leaveInfo);
		return addLeaveInfo;
	}
	
	public LeavesInfo getUserLeaveInfo(Long userId){
		LeavesInfo addLeaveInfo = null;
		try{
			User user = userRepo.findById(userId);
			addLeaveInfo = leaveInfoRepo.findByUser(user);
		}catch(Exception e){
			System.out.println(e);
		}
		return addLeaveInfo;
	}
	
}
