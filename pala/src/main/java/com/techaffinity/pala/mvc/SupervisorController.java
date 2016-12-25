package com.techaffinity.pala.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techaffinity.pala.entity.SupervisorMaster;
import com.techaffinity.pala.service.SupervisorService;

@RestController
@RequestMapping(value="/supervisor")
public class SupervisorController {

	@Autowired
	private SupervisorService supervisorService;
	
	@RequestMapping(value="/getallsupervisors",method=RequestMethod.GET)
	public List<SupervisorMaster> get(){
		return supervisorService.get();
	}
	
}
