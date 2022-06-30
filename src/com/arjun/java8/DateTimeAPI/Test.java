package com.arjun.java8.DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

/*Date and Time API== Manufactured by joda.org
 * This is also known as Joda Time API
 * 
 */
public class Test {
public static void main(String[] args) {
	
	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	LocalTime time= LocalTime.now();
	System.out.println(time);
}
}
