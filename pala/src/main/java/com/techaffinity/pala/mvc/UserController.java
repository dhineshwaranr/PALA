package com.techaffinity.pala.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techaffinity.pala.entity.UserEntity;
import com.techaffinity.pala.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public UserEntity addUser(@ModelAttribute UserEntity user){
		UserEntity savedUser = userService.addUser(user);
		return savedUser;
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	@ResponseBody
	public List<UserEntity> findAllUser(){
		List<UserEntity> users = userService.findAllUsers();
		return users;
	}
	
	@RequestMapping(value="/user/{userId}",method=RequestMethod.PUT)
	@ResponseBody
	public UserEntity updateUser(@RequestParam(value="role") List<Integer> role, @PathVariable(value="userId") String userId){
		System.out.println(role);
		//UserEntity savedUser = userService.updateUser(roles, userId);
		return null;
	}
	
}
