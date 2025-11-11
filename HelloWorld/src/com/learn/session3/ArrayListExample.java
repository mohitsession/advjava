package com.learn.session3;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person());
		Person person = new Person();
		persons.add(person);
		person.name = "Sham";
		for (Person temp : persons) {
			System.out.println(temp.name);
		}
//		persons.remove(0);
//		persons.clear();
		
		System.out.println(persons);
		
//		persons.add(new Student());
		
		person.equals(persons);
	}

}

class Human{
	
}

class Person extends Human {
	public String name = "Ram";

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

class Student extends Human{


}