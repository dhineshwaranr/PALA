package com.techaffinity.pala.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techaffinity.pala.entity.Team;
import com.techaffinity.pala.service.TeamService;

@RestController
@RequestMapping(value="team")
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value="/addTeam",method=RequestMethod.POST)
	@ResponseBody
	public Team addTeam(@RequestBody Team team){
		return teamService.addTeam(team);
	}
}
