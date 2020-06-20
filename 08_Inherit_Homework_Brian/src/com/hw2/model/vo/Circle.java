package com.hw2.model.vo;

public class Circle extends Point{
	
	private int radius;
	
	public Circle() {
		
	}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	public String draw() {
	return super.draw() + "���� : " + Math.round((Math.PI*10)*radius*radius)/10.0 + "\n�ѷ� : " +
					(Math.round(Math.PI*10)*radius*2)/10.0;
	}
	
	// setter
	public void setRadius(int radius) {
		this.radius = radius;
	}
	// getter
	public int getRadius() {
		return radius;
	}
	
	public int info() {
		return super.info() + radius; 
	}
}
