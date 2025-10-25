package com.learn;

// Encapsulation
public class OOP {

	public static void main(String[] args) {
		Car toyota = new Car("Toyota", "Corolla");

		Car honda = new Car("Honda", "Accord");

		System.out.println("Brand Name : " + toyota.getBranchName() + ", Model Name : " + toyota.getModelName());
		System.out.println("Brand Name : " + honda.getBranchName() + ", Model Name : " + honda.getModelName());

	}

}

class Car {
	private String brandName;
	private String modelName;

	public Car(String brandNme, String modelName) {
		this.brandName = brandNme;
		this.modelName = modelName;
	}
	
	public String getBranchName() {
		return brandName;
	}
	
	public String getModelName() {
		return modelName;
	}
}
