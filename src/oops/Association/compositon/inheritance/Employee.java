package oops.Association.compositon.inheritance;

public class Employee {
	String name;
	int age;
	Address adr; // Aggregation -- Loosly coupling
	Salary slr; // Aggregation

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
		adr = new Address("Aligarh", "UP", "INDIA");
		slr = new Salary(2500, 1400, 2500, 15000);
	}

	void show() {
		System.out.println("Name of Employees=" + name);
		System.out.println("Age of Employees=" + age);
		System.out.println("Address" + adr.city);
		System.out.println("Hra employee=" + slr.hra + "TA:" + slr.ta + "TDS:" + slr.tds + "TravelAllowance:"
				+ slr.travelallowance);
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Ram", 25);
		emp.show();
	}
}

class Address {
	String city, state, country;

	Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Salary {
	float ta;
	float hra;
	float tds;
	float travelallowance;

	Salary(float ta, float hra, float tds, float travelallowance) {
		this.hra = hra;
		this.ta = ta;
		this.tds = tds;
		this.travelallowance = travelallowance;
	}
}