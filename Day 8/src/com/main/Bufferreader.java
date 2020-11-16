package com.main;


/*Question 1:
 * 
 * Write a Java program by using BufferedReader class to prompt a user to input his/her name 
 * and then the output will be shown as an example below:
 * Hello HCL!
 * 
 */
import java.io.BufferedReader;

import java.io.FileReader;

public class Bufferreader {

	 public static void main(String args[])throws Exception
	 {    
        
		 
		 try
		 {
			 FileReader fr=new FileReader("C:\\files\\myfile");    
			 BufferedReader br=new BufferedReader(fr);    
			 int i;    
			 while((i=br.read())!=-1)
			 {  
				 System.out.print((char)i);  
			 }  
			 br.close();    
			 fr.close();    
		 }	
		 catch(Exception e)
		
		 {
			 System.out.println("Exception"+e);
		 }
	 }
}

