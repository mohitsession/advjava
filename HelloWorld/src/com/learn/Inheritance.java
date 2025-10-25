package com.learn;

import com.test.Vehicle;

public class Inheritance {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Toyota", "50");
//		vehicle.brand = "toyota";    // As we have defined the property (variable) as protected it is not accessible inside this package.

//		System.out.println(vehicle.getBrand());

		Cars cars = new Cars("Honda", "80", 4, true);

		Bicycle bicycle = new Bicycle("XYZ", "30", 7);

		System.out.println(cars);

		System.out.println(bicycle);
		
		cars.move();
		bicycle.move();
	}
}

class Insurance{
	
}

// Child Class Car
class Cars extends Vehicle {

	private int numberOfDoors;
	private boolean turnOnWiper;

	public Cars(String branch, String speed, int numberOfDoors, boolean turnOnWiper) {
		super(branch, speed);
		this.numberOfDoors = numberOfDoors;
		this.turnOnWiper = turnOnWiper;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public boolean isTurnOnWiper() {
		return turnOnWiper;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "numberOfDoors : " + numberOfDoors + ", turnOnWiper : " + turnOnWiper;
	}
}

// Child Class Bicycle

class Bicycle extends Vehicle {

	private int numberOfGears;

	public Bicycle(String branch, String speed, int numberOfGears) {
		super(branch, speed);
		this.numberOfGears = numberOfGears;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void ringBell() {
		System.out.println("Tring tring");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand Name: " + brand + ", Speed: " + speed + ", numberOfGears: " + numberOfGears;
	}
}