package com.dao;

public class Rectangle extends Shape {
	String name;
	int length;
	int breadth;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	@Override
	public float calculateArea() {
		float area=length*breadth;

		return area;
	}

}
