package com.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendText {

	public static void main(String[] args) {

		try {

			FileWriter fileWritter = new FileWriter("c:\\files\\myfile1.txt", true);
			BufferedWriter bw = new BufferedWriter(fileWritter);
			bw.write("Hiiii");
			bw.close();
			System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
