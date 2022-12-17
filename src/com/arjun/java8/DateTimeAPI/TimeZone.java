package com.arjun.java8.DateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {
public static void main(String[] args) {
	//ZoneId zone= ZoneId.systemDefault();
	//System.out.println(zone);
	
	
	//Represent customized zone
	 ZoneId usZone= ZoneId.of("America/Los_Angeles");
     System.out.println(usZone);
     
     ZonedDateTime zt= ZonedDateTime.now(usZone);
     System.out.println(zt); //2022-12-11T21:35:09.348-08:00[America/Los_Angeles]
     
     
     
}
}
