package com.techaffinity.pala.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techaffinity.pala.entity.LeaveTypeEntity;
import com.techaffinity.pala.service.LeaveTypeService;

@RestController
public class LeavesController {
	
	@Autowired
	private LeaveTypeService leaveService;
	
	@RequestMapping(value="/leavesinfo", method=RequestMethod.GET)
	public String leaves(){
		return "success";
	}
	
	@RequestMapping(value = "/leavetype",method=RequestMethod.POST)
	@ResponseBody
	public String addLeaveType(@ModelAttribute LeaveTypeEntity leaveType){
		leaveService.addLeaveType(leaveType);
		return "success";
	}
	
	@RequestMapping(value="/leavetype",method=RequestMethod.GET)
	@ResponseBody
	public List<LeaveTypeEntity> getAllLeaveTypes(){
		List<LeaveTypeEntity> lt = leaveService.getAllLeaveTypes();
		System.out.println(lt);
		return lt;
	}

}
