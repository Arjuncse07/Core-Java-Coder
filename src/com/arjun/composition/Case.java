package com.arjun.composition;

public class Case {
	private String model;
	private String manufacturer;
	private String powersupply;
	
	//Parameterised Constructor
	public Case(String model,String manufacturer,String powersupply) {
		this.model=model;
		this.manufacturer=manufacturer;
		this.powersupply=powersupply;
	}
	//method of PressPowerButton
	public void PressPowerButton() {
		System.out.println("Press Power Button");
	}
	//Getters and Setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getPowersupply() {
		return powersupply;
	}
	public void setPowersupply(String powersupply) {
		this.powersupply = powersupply;
	}
	
	

}
