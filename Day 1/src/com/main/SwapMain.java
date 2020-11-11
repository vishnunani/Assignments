package com.main;

import java.util.Scanner;

import com.demo.Swap;

public class SwapMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int input1 = input.nextInt();
		System.out.println("Enter the second number");
		int input2 = input.nextInt();
		Swap swap = new Swap();
		swap.process(input1, input2);
		input.close();
		swap = null;

	}

}
