package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*Question 2:
 * Write a Java program to write and read a plain text file.
 */
public class ReadWriteFile {

	public static void main(String[] args) {

		try {
			FileOutputStream fout=new FileOutputStream("C:\\files\\myfile1.txt");    
            fout.write(65);    
            fout.close();  
			FileInputStream fin = new FileInputStream("C:\\files\\myfile1.txt");
			int character;

			while ((character = fin.read()) != -1)
			{
				System.out.print((char) character);

			}

			fout.close();
			
			
		} 
		
		catch (Exception e) {
			System.out.println("Exception " + e);

		}

	}

}
