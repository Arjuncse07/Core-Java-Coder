package com.arjun.interface1;

public class Vendor implements ServletContext{	
	@Override
	public Vendor getObject() {
		
		return new Vendor();
	}
}
