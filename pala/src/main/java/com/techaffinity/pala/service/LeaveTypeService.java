package com.techaffinity.pala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaffinity.pala.entity.LeaveType;
import com.techaffinity.pala.repository.LeaveTypeRepository;

@Service
public class LeaveTypeService {

	@Autowired
	private LeaveTypeRepository leaveRepo;
	
	public LeaveType addLeaveType(LeaveType leaveType){
		LeaveType savedLeaveType = leaveRepo.save(leaveType);
		return savedLeaveType;
	}
	
	public List<LeaveType> getAllLeaveTypes(){
		List<LeaveType> allLeaveType = leaveRepo.findAll();
		return allLeaveType;
	}
	
}
