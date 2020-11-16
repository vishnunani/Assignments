package com.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Longestword {

	
	 public String findLongestWords() throws FileNotFoundException {

	       String longest_word = "";
	       String current;
	       Scanner inputfile = new Scanner(new File("C:\\files\\myfile4.txt"));


	       while (inputfile.hasNext()) {
	          current = inputfile.next();
	           if (current.length() > longest_word.length()) {
	             longest_word = current;
	           }

	       }
	        
	            return longest_word;
	            }
}
	
