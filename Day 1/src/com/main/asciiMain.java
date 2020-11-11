package com.main;

import java.util.Scanner;

import com.demo.Ascii;

public class asciiMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Ascii ascii = new Ascii();
		System.out.println("Enter a charecter");
		ascii.setCharecter(scanner.next().charAt(0));
		System.out.println("Ascii value of the charecter " + ascii.getCharecter() + " is" + " "
				+ ascii.asciiValue(ascii.getCharecter()));


	}

}
