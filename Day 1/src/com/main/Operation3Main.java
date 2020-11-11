package com.main;

import java.util.Scanner;

import com.demo.Operation3;

public class Operation3Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter first number");
		int input1=input.nextInt();
		System.out.println("enter second number");
		int input2=input.nextInt();
		System.out.println("enter third number");
		int input3=input.nextInt();
		Operation3 operation3=new Operation3();
		System.out.println(operation3.average(input1, input2, input3));
		
		

	}

}
