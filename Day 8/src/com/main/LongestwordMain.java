package com.main;

/*Question 5:
 * 
 * 
 *Write a Java program to find the longest word in a text file
 *
 */


import java.io.FileNotFoundException;

import com.service.Longestword;

public class LongestwordMain {

	public static void main(String[] args) throws FileNotFoundException {
	Longestword longestword=new Longestword();
	String result=longestword.findLongestWords();
	System.out.println(result);

	}

}
