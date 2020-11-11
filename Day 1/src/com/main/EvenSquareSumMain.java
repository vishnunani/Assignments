package com.main;

import java.util.Scanner;

import com.demo.EvenSquareSum;

public class EvenSquareSumMain {

	public static void main(String[] args) {

		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = inputNumber.nextInt();
		EvenSquareSum evenSqaureSum = new EvenSquareSum();
		System.out.println("The result sum is :  " + evenSqaureSum.process(input));

	}

}
