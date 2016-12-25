package com.techaffinity.pala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaffinity.pala.entity.Team;
import com.techaffinity.pala.repository.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepo;
	
	public Team addTeam(Team team){
		return teamRepo.save(team);
	}
	
}
