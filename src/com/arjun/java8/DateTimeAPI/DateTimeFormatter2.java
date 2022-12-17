package com.arjun.java8.DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter2 {
	public static void main(String[] args) {
		LocalDateTime dateTime= LocalDateTime.now();
		
		LocalDateTime dateTime2= dateTime.plusDays(10);
		
		LocalDateTime dateTime3= dateTime2.minusMonths(3);
		
		String string=dateTime3.format(DateTimeFormatter.ISO_DATE);
		System.out.println(string);
	}
}
