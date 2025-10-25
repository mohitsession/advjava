package com.learn;

public class Loops {
	public static void main(String[] args) {
		int count = 1;
		while (count <= 5) {
			System.out.println("The count is using while loop : " + count);
			count++;
		}
		System.out.println("We are outside While Loop");

		for (int counter = 1; counter <= 5; counter++) {
			System.out.println("The counter is using for loop : " + counter);
		}
	}
}
