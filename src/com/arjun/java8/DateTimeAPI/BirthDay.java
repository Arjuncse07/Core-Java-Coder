package com.arjun.java8.DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

//Given birthday DOB and we have to provide the total age if the person

public class BirthDay {
public static void main(String[] args) {
LocalDate currentDate= LocalDate.now();
LocalDate birthdayDate=LocalDate.of(1998, 07, 17);

Period period= Period.between(currentDate, birthdayDate);

}
}
