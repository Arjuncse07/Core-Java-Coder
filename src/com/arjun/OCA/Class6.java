package com.arjun.OCA;

interface House{
	public default String getAddress() {
		return "101 main street";
	}
}

interface Banglow extends House{
	public default String getAddress() {
		return "101 smart street";
	}
}

class MyHouse implements Banglow, House{
	
}

public class Class6 {
public static void main(String[] args) {
	
	House ci= new MyHouse();
	System.out.println(ci.getAddress());
}
}
