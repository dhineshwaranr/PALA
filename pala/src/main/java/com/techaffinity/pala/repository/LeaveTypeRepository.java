package com.techaffinity.pala.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techaffinity.pala.entity.LeaveType;

@Repository
public interface LeaveTypeRepository extends JpaRepository<LeaveType, Integer>{

	public LeaveType save(LeaveType leave);
	public List<LeaveType> findAll();
	
}
