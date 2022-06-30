package com.arjun.java8.DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class Class5 {
public static void main(String[] args) {
	
	LocalDate birthday =LocalDate.of(1998, 7, 17);
	LocalDate today=LocalDate.now();
	
	Period p=Period.between(birthday, today);
	
	System.out.printf("Your age is %d years and %d months %d Days", p.getYears(),p.getMonths(),p.getDays());
	
	LocalDate deathday=LocalDate.of(1998+60, 7, 17);
	Period p1=Period.between(today, deathday);
	
	int d=p1.getYears()*365+p1.getMonths()*30+p1.getDays();
	System.out.printf("\n You will be on earth only %d Days,Hurry up to do more important things",d);
}
}
