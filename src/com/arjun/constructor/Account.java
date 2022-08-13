package com.arjun.constructor;

import java.util.Scanner;

class Account{
	String accountHolderName;
	double balance;
	
	 Account() {
		balance=0.0;
	}
	 
	 Account(double balance) {
			this.balance=balance;
		}
	 public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the account Type");
		String accType=scanner.nextLine();
		
		if (accType.equalsIgnoreCase("zero balance")) {
			System.out.println("zero balance");
			System.out.println("Enter Your Name");
			String accountHolderName=scanner.next();
			Account account = new Account();
			account.accountHolderName=accountHolderName;
			System.out.println("Account Details:"+account.accountHolderName+"...."+account.balance);
			
		}else if(accType.equalsIgnoreCase("min balance")){
			System.out.println("Enter Your Name");
			String accountHolderName= scanner.next();
			Account account = new Account(50000.50);
			account.accountHolderName=accountHolderName;
			System.out.println("Account Details:"+accountHolderName+"..."+account.balance);
		}
		
	}
}
