package com.main;

import com.demo.Operations2;

public class Operation2Main {
	public static void main(String[] args)
	{
		Operations2 operations2 = new Operations2();
		operations2.setNumber1(20);
		operations2.setNumber2(5);

		System.out.println("Two numbers are 20 and 5");
		System.out.println(
				"Addition of numbers is" + operations2.addition(operations2.getNumber1(), operations2.getNumber2()));
		System.out.println("Subtraction of numbers is"
				+ operations2.subtraction(operations2.getNumber1(), operations2.getNumber2()));
		System.out.println("multiplication of numbers is"
				+ operations2.multiplication(operations2.getNumber1(), operations2.getNumber2()));
		System.out.println(
				"division of numbers is" + operations2.division(operations2.getNumber1(), operations2.getNumber2()));
	}

}
