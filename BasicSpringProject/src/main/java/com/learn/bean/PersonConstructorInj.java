package com.learn.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personConstructorInj")
//@Scope(scopeName = "prototype")
public class PersonConstructorInj {

	private final String firstName;
	private final String lastName;
	private int age;

	public PersonConstructorInj(@Value("Ram") String firstName, @Value("Kumar") String lastName, @Value("30") int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
