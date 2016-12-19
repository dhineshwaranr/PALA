package com.techaffinity.pala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaffinity.pala.entity.LeaveTypeEntity;
import com.techaffinity.pala.repository.LeaveTypeRepository;

@Service
public class LeaveTypeService {

	@Autowired
	private LeaveTypeRepository leaveRepo;
	
	public String addLeaveType(LeaveTypeEntity leaveType){
		leaveRepo.save(leaveType);
		return "success";
	}
	
	public List<LeaveTypeEntity> getAllLeaveTypes(){
		List<LeaveTypeEntity> lt = leaveRepo.findAll();
		return lt;
	}
	
}
