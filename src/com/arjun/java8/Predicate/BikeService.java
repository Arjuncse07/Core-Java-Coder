package com.arjun.java8.Predicate;

public class BikeService {
	
	public String bikename;
	public String bikeowner;
	public long kms;
	public String bikebrand;

	public BikeService(String bikename, String bikeowner, long kms, String bikebrand) {
		super();
		this.bikename = bikename;
		this.bikeowner = bikeowner;
		this.kms = kms;
		this.bikebrand = bikebrand;
	}






	@Override
	public String toString() {
		return "BikeService [bikename=" + bikename + "]";
	}
	
	

}
