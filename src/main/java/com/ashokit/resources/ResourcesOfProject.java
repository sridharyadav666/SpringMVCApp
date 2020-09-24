package com.ashokit.resources;

import org.springframework.context.annotation.Configuration;

import com.ashokit.pojo.StudentPojo;

@Configuration
public class ResourcesOfProject {

	
	public StudentPojo getInstant() {
		
		StudentPojo std=new StudentPojo();
		std.setSid(111);
		std.setSclass("10th");
		std.setSname("Mahesh");
		std.setSmobile("9988776655");
		std.setSaddr("karimnagar");
		
		return std;
		
	}
	
}
