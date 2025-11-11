package com.learn.session3;

public class PolymorpismExample {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal animal = new Animal();
		Animal[] animals = {dog, cat, animal};
		
		for(Animal temp : animals) {
			temp.makeSound();
		}
		
		Dog actualDog = new Dog();
		actualDog.makeSound("German Shepherd");
	}
}

class Animal{
	
	public void makeSound() {
		System.out.println("This is animal");
	} 
}

class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println( "Woof!");
	}
	
	public void makeSound(String type) {
		System.out.println(type + " Woof!");
	}
	
}

class Cat extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
	
}

