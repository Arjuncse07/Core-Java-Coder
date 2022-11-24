package com.arjun.Collections.AL;

public class Address {
String street;
String city;
String state;
String country;
public Address(String street, String city,String state,String country) {
	super(); //super cons by default called
	this.street=street;
	this.city=city;
	this.state=state;
	this.country=country;
}
public String getStreet() {
	return street;
}
public String getCity() {
	return city;
}
public String getState() {
	return state;
}
public String getCountry() {
	return country;
}

}
