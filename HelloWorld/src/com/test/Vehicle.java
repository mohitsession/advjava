package com.test;

public class Vehicle {
	protected String brand;
	protected String speed;

	public Vehicle(String branch, String speed) {
		super();
		this.brand = branch;
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public String getSpeed() {
		return speed;
	}
	
	public void move() {
		System.out.println("Vehicle is moving");
	}
}
