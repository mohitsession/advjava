package com.learn;

public class MyString {

	public static void main(String[] args) {
		String greeting = "Hellow";
		String name = "Ram";
		
		String greetingMessage  = greeting + " " + name; 
		System.out.println(" Greeting message : " + greetingMessage);
		

		System.out.println(" Greeting message : " + greetingMessage.toUpperCase());

		System.out.println(" Greeting message : " + greetingMessage.toLowerCase());
	}

}
