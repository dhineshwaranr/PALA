package com.techaffinity.pala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaffinity.pala.entity.SupervisorMaster;
import com.techaffinity.pala.repository.SupervisorMasterRepository;

@Service
public class SupervisorService {

	@Autowired
	private SupervisorMasterRepository supervisorRepo;
	
	public List<SupervisorMaster> get(){
		return supervisorRepo.findAll();
	}
	
}
