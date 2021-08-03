package OOPS;

abstract class Vehicle {
	public String name;
	public int speed;
	public int mileage;

	public Vehicle(String name, int speed, int mileage) {
		this.name = name;
		this.speed = speed;
		this.mileage = mileage;
	}

	public abstract void displayDetails();
}

class Bike extends Vehicle {
	Bike(String name, int speed, int mileage) {
		super(name, speed, mileage);
	}

	public void displayDetails() {
		System.out.println("Bike name:" + name);
		System.out.println("Bike Speed:" + speed);
		System.out.println("Bile Mileage:" + mileage);
	}
}

class Car extends Vehicle {
	public Car(String name, int speed, int mileage) {
		super(name, speed, mileage);
	}

	public void displayDetails() {
		System.out.println("Car name:" + name);
		System.out.println("Car Speed:" + speed);
		System.out.println("Car" + " Mileage:" + mileage);
	}
}

public class Abstraction {
	public static void main(String args[]) {
		Bike b = new Bike("Pulsar", 200, 35);
		b.displayDetails();
		Car c = new Car("Maruthi Suzuki", 400, 20);
		c.displayDetails();
	}
}
