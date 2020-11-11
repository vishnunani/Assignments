package com.main;

import com.demo.Operation1;

public class Operaion1Main {

	public static void main(String[] args) {

		Operation1 operation1 = new Operation1();
		operation1.arthematicOperations();
		System.out.println("Result of -5 + 8 * 6 is " + operation1.getVar1());
		System.out.println("Result of (55+9) % 9  is " + operation1.getVar2());
		System.out.println("Result of . 20 + -3*5 / 8  is " + operation1.getVar3());
		System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3  is " + operation1.getVar4());
	}

}
