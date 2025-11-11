package com.learn.session3;

import java.util.HashMap;

public class HashMapExamples {

	public static void main(String[] args) {
		HashMap<String, Integer> studentScores = new HashMap<>();
		studentScores.put("Ram", 98);
		studentScores.put("Sham", 80);
		studentScores.put("Rohit", 70);
		studentScores.put("Pranay", 65);

		System.out.println(studentScores);

		System.out.println("Score of Rohit : " + studentScores.get("Rohit"));

		studentScores.remove("Pranay");

		System.out.println(studentScores.get("Pranay"));

		System.out.println("Sham exisit? " + studentScores.containsKey("Pranay"));
		System.out.println("Any student with marks 100 exisit? " + studentScores.containsValue(98));

		for (String studentName : studentScores.keySet()) {
			System.out.println("StudentName : " + studentName + ", Score: " + studentScores.get(studentName));
		}
	}

}
