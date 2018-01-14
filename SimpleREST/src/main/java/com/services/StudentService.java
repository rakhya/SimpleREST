package com.services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.models.*;

public class StudentService {
	
	
	private List<Student> students = new ArrayList<Student>();
	public StudentService() {
		
	}
	public void addStudent(int roll, String name, int standard) {
		students.add(new Student(roll,name,standard));
		Collections.sort(students);
	}
	
	public List<Student> getStudents(){
		return students;
	}
}
