package com.arjun.java8.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class BikeServiceImpl {
	public static void main(String[] args) {
		
		ArrayList<BikeService> list= new ArrayList<BikeService>();
		list.add(new BikeService("Splendor", "Ravi", 25000, "Hero"));
		list.add(new BikeService("Pulsar", "Amit", 30000, "Bajaj"));
		list.add(new BikeService("Karizma", "Seshnag", 50000, "Hero"));
		list.add(new BikeService("Super Splendor", "Surmesh", 3000, "Hero"));
		list.add(new BikeService("Ambition", "Kala", 47200, "Hero"));
		list.add(new BikeService("Passion plus", "Edward", 250000, "Hero"));
		list.add(new BikeService("Passion Pro", "James", 1000, "Hero"));
		list.add(new BikeService("CD Delux", "Davis", 500, "Hero"));
		list.add(new BikeService("Cd Down", "Ramesh", 250000, "Hero"));
		list.add(new BikeService("Victor", "Dolly", 8500, "Bajaj"));
		
		
		Predicate<BikeService> allowed1= s -> s.kms>=30000 && s.bikebrand=="Hero";
		System.out.println("The Allowed Bikes to the service are:");
		for(BikeService s :list) {
			if(allowed1.test(s)) {
				System.out.println(s);
			}
		}
		
	}

}
