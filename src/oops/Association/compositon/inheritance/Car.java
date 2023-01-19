package oops.Association.compositon.inheritance;

class CarEngine{
	int carGeneration;
	//composition  --- Tightly coupled 
	CarEngine(int carGeneration ){
		this.carGeneration=10;
		System.out.println("Car Engine has started..");
	}
	
	
}


public class Car {
String carName;
String carManufacturer;
float carCost;

CarEngine carEngine;

Car(String carName, String carManufacturer,  float carCost){
	this.carName=carName;
	this.carManufacturer=carManufacturer;
	this.carCost= carCost;
	
	carEngine= new CarEngine(10);
	}

   void show() {
	   System.out.println(carName +"::"+ carCost+ "::"+ carManufacturer+"::"+ carEngine.carGeneration);
   }
   
   public static void main(String[] args) {
	Car car = new Car("Swift", "Maruti Suzuki", 12000000.2f);
	car.show();
}
}
