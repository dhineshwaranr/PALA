package com.techaffinity.pala.mvc;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techaffinity.pala.entity.UserEntity;

@RestController
public class UserController {

	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String addUser(@ModelAttribute UserEntity user){
		System.out.println(user.getUserName());
		return null;
	}
	
}
