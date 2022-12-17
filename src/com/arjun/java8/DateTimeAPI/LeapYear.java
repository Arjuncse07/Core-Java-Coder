package com.arjun.java8.DateTimeAPI;

import java.time.Year;

public class LeapYear {
public static void main(String[] args) {
	int n= Integer.parseInt(args[0]);
	Year year=Year.of(n);
	if(year.isLeap()) {
		System.out.printf("%d is leap year",n);
	}else {
		System.out.printf("%d is not a leap year",n);
	}

}
}
