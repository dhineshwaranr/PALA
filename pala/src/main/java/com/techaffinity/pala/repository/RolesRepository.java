package com.techaffinity.pala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techaffinity.pala.entity.Authority;

@Repository
public interface RolesRepository extends JpaRepository<Authority, Integer> {
	
	public Authority save(Authority role);

}
