package com.learn;

public class Operator {
	public static void main(String[] args) {
		// logical Operators

		boolean hasDrivingLicense = false;
		boolean hasCreditScore = true;

		boolean CanGetCarDiscount = hasDrivingLicense && hasCreditScore;

		System.out.println("Can Get Car Discount : " + CanGetCarDiscount);

		// Assignment Operators
		int age = 30;
		age = age + 1;
		System.out.println("Age = " + age);

		age += 1;
		System.out.println("Age = " + age);

		age++;
		System.out.println("Age = " + age);

		age--;
		System.out.println("Age = " + age);

		// Arithmetic Operators

		int a = 11;
		int b = 20;

		int result = a + b;
		System.out.println("a+b = " + result);

		result = b - a;
		System.out.println("b-a = " + result);

		result = b / a;
		System.out.println("b/a = " + result);

		result = b % a;
		System.out.println("b%a = " + result);

		System.out.println("a is even : " + (a % 2 == 0));
	}
}
