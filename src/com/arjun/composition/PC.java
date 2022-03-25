package com.arjun.composition;
/*Composition
 *PC is composed of Case and Motherboard 
 */
public class PC {	
private  Case thecase;
private  MotherBoard mb;

//Constructor
public PC(Case thecase, MotherBoard mb) {
	this.thecase=thecase;
	this.mb=mb;
}

//Getters and Setters
public Case getThecase() {
	return thecase;
}
public MotherBoard getMb() {
	return mb;
}
}
