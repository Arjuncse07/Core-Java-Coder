package com.arjun.Design_Patterns.FactoryDesignPattern;

abstract class Vehical{
	public abstract int getWheel();

	@Override
	public String toString() {
		return "Vehical [getWheel()=" + getWheel() + "]";
	}
}
class Car extends Vehical{
	int wheel;
	Car(int wheel){
		this.wheel=wheel;
	}
	
	public int getWheel() {
			return this.wheel;  
	}
}

class Bike extends Vehical{
int wheel;
Bike (int wheel){
	this.wheel=wheel;
}
@Override
public int getWheel() {
	
	return this.wheel;
}
}
class VehicalFactory{
	public static  Vehical getInstance(String type,int wheel) {
		if(type==cag) {
			return new car(wheel)
		}
	}
}
public class FactoryDp {

}
