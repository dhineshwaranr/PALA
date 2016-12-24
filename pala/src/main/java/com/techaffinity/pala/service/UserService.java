package com.techaffinity.pala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaffinity.pala.entity.User;
import com.techaffinity.pala.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public User addUser(User user){
		User savedUser = userRepo.save(user);
		return savedUser;
	}
	
	public List<User> findAllUsers(){
		return userRepo.findAll();
	}
	
	public User findUserById(int userId){
		return null;
	}
	
	public User updateUser(String[] roles, String userId){
		User savedUser = null;
		try{
			//User selectedUser = userRepo.findById(Integer.parseInt(userId));
			
			//savedUser = userRepo.save(user);
		}catch(Exception e){
			System.out.println(e);
		}
		return savedUser;
	}
	
	
}
