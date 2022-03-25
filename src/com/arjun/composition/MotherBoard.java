package com.arjun.composition;
//Composition----------->Strong Relation b/w class
public class MotherBoard {
	private String model;
	private String manufacturer;
	private int ramSlots;
	
	//Constructor
	public MotherBoard(String model, String manufacturer, int ramSlots) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
	}
	//loadProgram method
	void loadProgram(String p) {
		System.out.println("Program Loading.."+p);
	}
	
	
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getRamSlots() {
		return ramSlots;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setRamSlots(int ramSlots) {
		this.ramSlots = ramSlots;
	}
	
	
	

}
