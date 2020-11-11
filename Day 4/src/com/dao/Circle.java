package com.dao;

public class Circle extends Shape{
	String name;
	int radius;

	public String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		float area=(float) (3.14*(float)radius*(float)radius);
		
		return area;
	}

}
