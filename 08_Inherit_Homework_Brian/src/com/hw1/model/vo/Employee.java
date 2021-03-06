package com.hw1.model.vo;

public class Employee extends Person {
	
	//field
	private int salary;
	private String dept;
	
	//constructor
	public Employee() {
		
	}
	
	//매개변수 constructor
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name; 
		this.salary = salary;
		this.dept = dept;
	}
	
	//setter
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//getter
	public int getSalary() {
		return salary;
	}
	public String getDept() {
		return dept; 
	}
	
	//info
	public String info() {
		return super.info() + ", 급여 :" + salary + ", 부서: " + dept;
	}
	

}
