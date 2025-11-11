package com.learn.session3;

public class AbstractionExample {

	public static void main(String[] args) {

	}

}

class Vehicle {
	private String name;

	public void printBrandName() {
		System.out.println("Brand name is " + name);
	}
}

interface Driveable {
	void steer(String direction);
	void brake();
}

interface Documentation{
	void manual();
}

class Car extends Vehicle implements Driveable, Documentation{

	@Override
	public void steer(String direction) {
		System.out.println("Car direction : "+direction);
	}

	@Override
	public void brake() {
		System.out.println("Car stopped");
		
	}

	@Override
	public void manual() {
		// TODO Auto-generated method stub
		
	}
	
}