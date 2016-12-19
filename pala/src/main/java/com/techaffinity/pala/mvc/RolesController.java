package com.techaffinity.pala.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techaffinity.pala.entity.RolesEntity;
import com.techaffinity.pala.entity.UserEntity;
import com.techaffinity.pala.service.RoleService;

@RestController
@RequestMapping(value = "/superadmin")
public class RolesController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/role",method=RequestMethod.POST)
	public RolesEntity addRole(@ModelAttribute RolesEntity role){
		RolesEntity savedRole = roleService.addRole(role);
		return savedRole;
	}
	
	@RequestMapping(value="/role",method=RequestMethod.GET)
	public List<RolesEntity> getAllRoles(){
		
		return null;
	}
	@RequestMapping(value="/role/{roleId}",method=RequestMethod.PUT)
	public String editRole(@ModelAttribute RolesEntity role, @PathVariable int roleId){
		System.out.println(role.getRoleName());
		return null;
	}
	@RequestMapping(value="/role/{roleId}",method=RequestMethod.DELETE)
	public String deleteRole(@PathVariable int roleId){
		System.out.println(roleId);
		return null;
	}
}
