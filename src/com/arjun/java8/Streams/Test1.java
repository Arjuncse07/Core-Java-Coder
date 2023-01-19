package com.arjun.java8.Streams;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

class Prodoct1{
	int id;
	String name;
	float price;
	public Prodoct1(int id, String name, float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

}

public class Test1 {
public static void main(String[] args) {
	List<Prodoct1> productsList= new ArrayList<Prodoct1>();
	
	productsList.add(new Prodoct1(1, "HP Product", 25000f));
	productsList.add(new Prodoct1(2, "Dell", 35000f));
	productsList.add(new Prodoct1(3, "Oracle", 45000f));
	productsList.add(new Prodoct1(4, "Apple", 55000f));
	
	List<Float> productPriceList2= productsList.stream()
			.filter(p -> p.price > 30000) //filtering data
			.map(p -> p.price) //fetching price
			.collect(Collectors.toList()); //collecting as list
	
	System.out.println(productPriceList2);
}
}
