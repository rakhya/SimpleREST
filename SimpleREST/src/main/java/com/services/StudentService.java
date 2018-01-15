package com.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.database.DatabaseClass;
import com.models.*;

public class StudentService {
	
	
	private Map<Integer,Student> students = DatabaseClass.getStudents();
	
	/*public StudentService() {
		
	}*/
	
	public Student getStudent(int id) {
		return students.get(id);
	}
	
	public Student addStudent(Student s) {
		int roll = 1;
		for(int i : students.keySet()) {
			roll = i+1;
		}
		s.setRollNum(roll);
		students.put(s.getRollNum(), s);
		return s;
	}
	
	public Student updateStudent(Student s) {
		for(int i: students.keySet()) {
			if (s.getRollNum() == i) {
				students.put(i, s);
				return s;
			}
		}
		return null;
	}
	
	public void delStudent(int id) {
		for(int i: students.keySet()) {
			if (i == id) {
				students.remove(id);
				break;
			}
		}
	}
	
	public List<Student> getAllStudents() {
		return new ArrayList<Student>(students.values());
	}
	
	public void removeAll(){
		DatabaseClass.setStudents();
	}
	
	
}