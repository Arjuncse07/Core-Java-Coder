package com.arjun.java8.DateTimeAPI;

import java.time.LocalDate;

public class DateTimeFormatter {
public static void main(String[] args) {
	LocalDate date= LocalDate.of(2022, 12, 12);
	String txt= date.format(java.time.format.DateTimeFormatter.ISO_DATE);
	String txt1= date.format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);

	System.out.println(txt);
}
}
