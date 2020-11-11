package com.main;

import java.util.Scanner;


import com.demo.Operation8;

public class Operation8Main {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = inputNumber.nextInt();
		Operation8 operation8 = new	Operation8 ();
		System.out.println("The result sum is :  " + operation8.process(input));


	}

}
