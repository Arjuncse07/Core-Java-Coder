package com.arjun.FileIO;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class IO {

	public static void main(String[] args) {
		//System.out.println("hello world");
		try {
			
			FileOutputStream fos= new FileOutputStream("java.txt");
			PrintStream ps= new PrintStream(fos);
			
			FileOutputStream fos1= new FileOutputStream("java1.txt");
			PrintStream ps1= new PrintStream(fos1);
			
			System.setOut(ps);
			System.setErr(ps1);
			System.out.println("Java is Great");
			System.err.println("error value");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
