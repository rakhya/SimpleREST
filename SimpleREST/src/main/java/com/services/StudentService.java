package com.services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.models.*;

public class StudentService {
	
	
	private List<Student> students = new ArrayList<Student>();
	public StudentService() {
		
	}
	public void addStudent() {
		students.add(new Student(1,"Rakhya",10));
		students.add(new Student(2,"Harika",10));
		Collections.sort(students);
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public Student getStudent(int id){
		Student s = null;
		for (Student s1 : students) {
			if (s1.getRollNum()==id) {
				return s1;
			}
		}
		return s;
	}
}