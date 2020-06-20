package com.hw1.model.vo;

public class Student extends Person {
	
	// field
	private int grade;
	private String major;
	
	// Constructor
	public Student() {
		
	}
	
	//�Ű����� constructor
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
		return super.info() + "�г� : " + grade + "���� : " + major; 
	}
	
}
