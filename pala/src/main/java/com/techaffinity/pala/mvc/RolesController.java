package com.techaffinity.pala.mvc;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techaffinity.pala.entity.RolesEntity;
import com.techaffinity.pala.entity.UserEntity;

@RestController
@RequestMapping(value = "/superadmin")
public class RolesController {

	@RequestMapping(value="/role",method=RequestMethod.POST)
	public String addUser(@ModelAttribute RolesEntity role){
		System.out.println(role.getRoleName());
		return null;
	}
	
}
