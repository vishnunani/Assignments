package com.main;

/*Question 4:
 * 
 * Write a Java program to read first 3 lines from a file
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Read3Lines {

	public static void main(String[] args) throws FileNotFoundException {

		try  
		{  
		File file=new File("C:\\files\\myfile2.txt");   
		FileReader fr=new FileReader(file);   
		BufferedReader br=new BufferedReader(fr);  
		StringBuffer sb=new StringBuffer();   
		  
		int i=3;
		for(i=0;i<3;i++)
		{
		sb.append(br.readLine());     
		sb.append("\n");  
		}  
		fr.close();    
		System.out.println("Contents of File: ");  
		System.out.println(sb.toString()); 
		} 
		
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
	}

}
