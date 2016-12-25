package com.techaffinity.pala.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techaffinity.pala.entity.SupervisorMaster;

@Repository
public interface SupervisorMasterRepository extends JpaRepository<SupervisorMaster, Long> {

	public List<SupervisorMaster> findAll();
	
}
