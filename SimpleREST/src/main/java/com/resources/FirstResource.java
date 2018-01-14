package com.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.models.Student;
import com.services.StudentService;

@Path("/")
public class FirstResource {
	StudentService ss = new StudentService();
	
	@Path("/resource1")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String getMessage1() {
		return "1 , Hello, REST!";
	}
	
	@Path("/resource2")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String getMessage2() {
		return "2 , Hello, REST!";
	}
	
	@Path("/resource3")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String getMessage3() {
		return "3 , Hello, REST!";
	}
	
	@Path("students")
	@GET
	@Produces({MediaType.APPLICATION_XML})
	public List<Student> getStudents(){
		ss.addStudent(1, "rakhya", 10);
		ss.addStudent(2, "harika", 10);
		return ss.getStudents();
	} 
}
