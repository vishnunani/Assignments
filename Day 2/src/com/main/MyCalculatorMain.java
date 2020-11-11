package com.main;

import java.util.Scanner;

public class MyCalculatorMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int input = in.nextInt();

		MyCalculator myCalculator = new MyCalculator();
		int result = myCalculator.divisor_sum(input);
		System.out.println(result);
		in.close();
		myCalculator = null;

	}

}