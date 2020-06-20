package com.hw2.model.vo;

public class Point {

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String draw() {
	 return "(x,y) : " + "(" + x + "," + y + ")\n";
	}

	// setter
	public void setX() {
		this.x = x;
	}

	public void setY() {
		this.y = y;
	}

	// getter
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int info() {
		return x + y;
	}

}
