package com.arjun.markerInterface;
import java.util.Scanner;
//import java.lang.*;
public class Product {
int pid;
String pname;
double pcost;
//Product class constructor

public Product (int pid,String pname,double pcost) {
	this.pid=pid;
	this.pname=pname;
	this.pcost=pcost;
	
}
//Method that prints the detail on the console
 public void showDetail() {
	 System.out.println("Product ID:"+pid);
	 System.out.println("Product Name:"+pname);
	 System.out.println("Product Cost:"+pcost);
 }
 public static void main(String[] args)throws CloneNotSupportedException {
	//Reading the values of the product from the user
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the Product ID");
	 int pid=sc.nextInt();
	 System.out.println("Enter product name");
	 String pname=sc.next();
	 System.out.println("Enter Product Cost");
	 double pcost=sc.nextDouble();
	 System.out.println("******Product Details******");
	 Product p1 = new Product(pid,pname,pcost);
	 //Cloning the object of the Product class using the clone()
	 Product p2=(Product)p1.clone();
	 p2.showDetail();
	 
}
}



