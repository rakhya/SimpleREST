package com.database;

import java.util.Map;
import java.util.TreeMap;

import com.models.Student;

public class DatabaseClass {

	private static Map<Integer,Student> students = new TreeMap<Integer, Student>();
	
	public static Map<Integer,Student> getStudents(){
		return students;
		}
	public static void setStudents() {
		students = new TreeMap<Integer, Student>();
	}
}
