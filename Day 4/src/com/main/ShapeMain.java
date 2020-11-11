package com.main;

import java.util.Scanner;

import com.dao.Circle;
import com.dao.Rectangle;
import com.dao.Square;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CIRCLE");
		System.out.println("RECTANGLE");
		System.out.println("SQUARE");
		Scanner input = new Scanner(System.in);
		System.out.println("enter the shape");
		String selected = input.nextLine();
		Circle circle = new Circle();
		circle.setName("CIRCLE");
		if (selected.equals(circle.getName())) {
			System.out.println(circle.calculateArea());
		}
		Rectangle rectangle = new Rectangle();
		rectangle.setName("RECTANGLE");
		if (selected.equals(rectangle.getName())) {
			System.out.println(rectangle.calculateArea());
		}
		Square square = new Square();
		square.setName("SQUARE");
		if (selected.equals(rectangle.getName())) {
			System.out.println(square.calculateArea());
		}
		input.close();
		circle = null;
		rectangle = null;
		square = null;

	}

}
