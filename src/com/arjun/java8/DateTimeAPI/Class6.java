package com.arjun.java8.DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class Class6 {
public static void main(String[] args) {
	LocalDate date1= LocalDate.of(2022, 1, 31);
	Period period=Period.ofMonths(2);
	System.out.println(date1);
	date1.plus(period); //new value is lost
	
	LocalDate date2= date1.plus(period);
	System.out.println(date2); //new value is captured
}
}
