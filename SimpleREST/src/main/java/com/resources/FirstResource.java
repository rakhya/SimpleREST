package com.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.models.Student;
import com.services.StudentService;

@Path("/")
public class FirstResource {
	StudentService ss = new StudentService();
	
	@Path("resource1")
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public String getMessage1() {
		return "1 , Hello, REST!";
	}
	
	@Path("resource2")
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public String getMessage2() {
		return "2 , Hello, REST!";
	}
	
	@Path("resource3")
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public String getMessage3() {
		return "3 , Hello, REST!";
	}
	
	@Path("students")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Student> getStudents(){
		return ss.getAllStudents();
	}
	
	@Path("students/{studentid}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Student getStudent(@PathParam("studentid") int id){
		return ss.getStudent(id);
	}
	
	@Path("addstudent")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student addStudent(Student s) {
		return ss.addStudent(s);
	}
	
	@Path("delete/{studentid}")
	@DELETE
	public void removeStudent(@PathParam("studentid") int id) {
		ss.delStudent(id);
	}
	
	@Path("update")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateStudent(Student s) {
		return ss.updateStudent(s);
	}
	
	@Path("deleteall")
	@DELETE
	public void removeStudent() {
		ss.removeAll();
	}
	
}
