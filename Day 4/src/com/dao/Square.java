package com.dao;

public class Square extends Shape{
	String name;
	int side;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public float calculateArea() {
		float area=side*side;
		
		return area;
	}
	

}
