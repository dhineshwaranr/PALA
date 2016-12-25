package com.techaffinity.pala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techaffinity.pala.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

	public Team save(Team team);
	
}
