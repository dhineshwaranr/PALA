package com.techaffinity.pala.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techaffinity.pala.entity.LeaveTypeEntity;

@Repository
public interface LeaveTypeRepository extends JpaRepository<LeaveTypeEntity, Integer>{

	public LeaveTypeEntity save(LeaveTypeEntity leave);
	public List<LeaveTypeEntity> findAll();
	
}
