package com.demo;

public class Operation8 {
	public static int process(int number) {

		int remainder;
		int sum = 0;
		while (number != 0) {

			remainder = number % 10;
			if ((remainder % 2) != 0) 
			{
				sum += remainder;

			}
			number = number / 10;
		}
		return sum;
}
}