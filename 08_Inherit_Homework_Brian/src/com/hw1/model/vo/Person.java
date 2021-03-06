package com.hw1.model.vo;

public class Person {
	
	//field
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	// Constructor
	public Person() {
		
	}
	
	//매개변수 constructor
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height= height;
		this.weight = weight;
	}

	//setter
	public void setAge(int age) {
		this.age = age; 
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight; 
	}
	
	//getter
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight; 
	}
	
	// info
	public String info() {
		return "이름: " + name + ", age: " + age + ", height: " + height + ", weight: " + weight;
	}
	
}





