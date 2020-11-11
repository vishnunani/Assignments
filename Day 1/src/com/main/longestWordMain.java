package com.main;

import java.util.Scanner;

import com.demo.LongestWord;

public class longestWordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		
		String input= "";
		input+= scanner.nextLine();
		LongestWord longestword=new LongestWord();
		String result= longestword.getLargestWord(input);
		System.out.println(result);
		
	}

}
