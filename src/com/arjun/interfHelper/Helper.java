package com.arjun.interfHelper;

import com.arjun.interface1.Bank;

public abstract class Helper implements Bank {

	@Override
	public void deposite() {
		System.out.println("Deposite called");

	}
}
