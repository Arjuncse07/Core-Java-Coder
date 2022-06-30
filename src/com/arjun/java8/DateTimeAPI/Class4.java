package com.arjun.java8.DateTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;

public class Class4 {
  public static void main(String[] args) {
	
	  LocalDateTime dt=LocalDateTime.of(1998, Month.JULY,17,18,45);
	  LocalDateTime dt1=LocalDateTime.of(1998, 07, 17, 12, 25, 44);
	  
	  System.out.println(dt);
	  System.out.println(dt1);
	  System.out.println("----------------------------------------------");
	  System.out.println("After six Months:"+dt.plusMonths(6));
	  System.out.println("Before six Months:"+dt.minusMonths(6));
	  
	  System.out.println("----------------------------------------------");
	  
	  System.out.println("After six Months:"+dt1.plusMonths(6));
	  System.out.println("Before six Months:"+dt1.minusMonths(6));
	  
	  
	  
}

}
