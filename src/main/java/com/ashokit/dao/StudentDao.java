package com.ashokit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashokit.pojo.StudentPojo;

@Repository
public class StudentDao {

	
	@Autowired
	private StudentPojo std;

	@Override
	public String toString() {
		return "StudentDao [std=" + std + "]";
	}
	
	
}
