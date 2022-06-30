package com.arjun.java8.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;
import com.arjun.enumdemo.Main;
/*
 * Predicate for authentication
 * 
 */
 class User {
	String username;
	String pwd;
	User(String username,String pwd){
		this.username=username;
		this.pwd=pwd;
	}
 }
public	class Test{
		public static void main(String[] args) {
			Predicate<User> p= u->u.username.equals("durga")&& u.pwd.equals("java");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter User name:");
			String username=sc.next();
			System.out.println("Enter password");
			String pwd=sc.next();
			
			User user=new User(username,pwd);
					if(p.test(user)) {
						System.out.println("Valid user and can avild all services");
					}else {
						System.out.println("Invalid user you cannot avail services");
					}
			
			}
	}

