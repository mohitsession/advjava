package com.learn.session3;

public class ArrayExample {
	public static void main(String[] args) {
		int[] scores = new int[5];
		scores[0] = 90;
		scores[1] = 96;
		scores[2] = 80;
		scores[3] = 88;
		scores[4] = 77;
		
		for(int i=0; i<scores.length;i++) {
			System.out.println(scores[i]);
		}
	}
}
