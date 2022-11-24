package com.arjun.Collections.AL;

public class Polition {
String politianName;
int politianAge;
String politionParty;

private Address address;
public Polition(String politianName, int politianAge, String politionParty, Address address) {
	super();
	this.politianName = politianName;
	this.politianAge = politianAge;
	this.politionParty = politionParty;
	this.address=address;
}



@Override
public String toString() {
	return "Polition [politianName=" + politianName + ", politianAge=" + politianAge + ", politionParty="
			+ politionParty + ", address=" + address + "]";
}



public String getPolitianName() {
	return politianName;
}

public int getPolitianAge() {
	return politianAge;
}

public String getPolitionParty() {
	return politionParty;
}

public Address getAddress() {
	return address;
}

public void setPolitianName(String name) {
	this.politianName=name;
}


}
