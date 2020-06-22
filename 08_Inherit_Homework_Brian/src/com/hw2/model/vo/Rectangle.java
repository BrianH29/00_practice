package com.hw2.model.vo;

public class Rectangle extends Point {

	private int width;
	private int height;
	
	public Rectangle()	{
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public String draw() {
	return super.draw() + "���� : " + (height*width) + "\n�ѷ� : " + 2*(height*width);
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height; 
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	
}
