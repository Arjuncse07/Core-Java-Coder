package com.arjun.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {

	public static void main(String[] args) {
		
		try {
			//writing data to the file
			String s="Hey this is my First IO Program";
			FileOutputStream fos= new FileOutputStream("demo.txt");
			byte b[]=s.getBytes();
			fos.write(b);
			
			//reading data from file
			FileInputStream fis= new FileInputStream("demo.txt");
			MyTimer.startTime();
			while(true) {
				
				int i= fis.read();
				if(i==-1) 
					break;
                  System.out.print((char)i);
                  
				
				MyTimer.endTime();
				System.out.println("");
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

class MyTimer
{
	static long endTime, startTime;
	
	static public void startTime() {
		startTime=System.nanoTime();
	}
	
	static public void endTime() {
		endTime=System.nanoTime();
		System.out.print("Total execution Time="+(endTime-startTime));
	}
}

