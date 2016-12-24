package com.techaffinity.pala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaffinity.pala.entity.Authority;
import com.techaffinity.pala.repository.RolesRepository;

@Service
public class RoleService {

	@Autowired
	private RolesRepository roleRepo;
	
	public Authority addRole(Authority role){
		Authority savedRole = roleRepo.save(role);
		return savedRole;
	}
	
}
