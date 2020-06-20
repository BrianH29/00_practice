package com.hw1.model.vo;

public class Student extends Person {
	
	// field
	private int grade;
	private String major;
	
	// Constructor
	public Student() {
		
	}
	
	//매개변수 constructor
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name; 
		this.grade = grade;
		this.major = major; 
		
	}
	
	//setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	//getter
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major; 
	}
	
	//info
	public String info() {
		return super.info() + "학년 : " + grade + "전공 : " + major; 
	}
	
}
