package com.techaffinity.pala.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techaffinity.pala.entity.LeaveType;
import com.techaffinity.pala.entity.LeavesInfo;
import com.techaffinity.pala.entity.User;
import com.techaffinity.pala.service.LeaveInfoService;
import com.techaffinity.pala.service.LeaveTypeService;
import com.techaffinity.pala.service.UserService;

@RestController
public class LeavesController {
	
	@Autowired
	private LeaveTypeService leaveService;
	
	@Autowired
	private LeaveInfoService leaveInfoService;
	
	@RequestMapping(value="/leavesinfo", method=RequestMethod.POST)
	public LeavesInfo addLeaves(@RequestBody LeavesInfo leaveInfo){
		LeavesInfo addLeaveInfo = leaveInfoService.addLeaveInfo(leaveInfo);
		return addLeaveInfo;
	}
	
	@RequestMapping(value="/leavesinfo/{userId}", method=RequestMethod.GET)
	public LeavesInfo leaves(@PathVariable String userId){
		LeavesInfo LeaveInfo = leaveInfoService.getUserLeaveInfo(Long.parseLong(userId));
		return LeaveInfo;
	}
	
	@RequestMapping(value = "/leavetype",method=RequestMethod.POST)
	@ResponseBody
	public LeaveType addLeaveType(@RequestBody LeaveType leaveType){
		LeaveType savedLeaveType = leaveService.addLeaveType(leaveType);
		return savedLeaveType;
	}
	
	@RequestMapping(value="/leavetype",method=RequestMethod.GET)
	@ResponseBody
	public List<LeaveType> getAllLeaveTypes(){
		List<LeaveType> allLeaveType = leaveService.getAllLeaveTypes();
		return allLeaveType;
	}

}
