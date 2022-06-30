package com.arjun.FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test1 {

	
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw= new FileWriter("java1.txt");
			String a="Amit is student";
			fw.write(a.toCharArray());
			fw.close();
			
			FileReader fr= new FileReader("java1.txt"); //16bit buffer
			fr.read();
			System.out.println();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
}
