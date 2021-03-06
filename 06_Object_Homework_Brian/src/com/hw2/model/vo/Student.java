package com.hw2.model.vo;

public class Student {

	// 1. 필드
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 2. 생성자
	public Student() {
		
	}
	// 3. 메소드생성자
	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	// 4. setter
	public void setGrade(int grade)	{
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 5.getter
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String info() {
		return grade + "학년 " + classroom + "반 " + name + " " + kor + "점 " + eng + "점 " + math +"점";
	}
}
