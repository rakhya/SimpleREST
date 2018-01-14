package com.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student implements Comparable<Student> {

	private int rollNum;
	private String name;
	private int standard;
	
	public Student() {
		
	}
	
	public Student(int rollNum, String name, int standard) {
		this.rollNum = rollNum;
		this.name = name;
		this.standard = standard;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return new Integer(rollNum).compareTo(new Integer(o.getRollNum()));
	}
	
	
}
