package com.learn.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ram", "Sham", "Rohit", "Kishor");
		List<String> results = new ArrayList<String>();

		for (String name : names) {
			if (name.startsWith("R")) {
				results.add(name);
			}
		}
		System.out.println("Result : " + results);
// Intermediate Operation
		List<String> resultUsingStream = names.stream()
				.filter(name -> name.startsWith("R"))
				.map(name -> name.toUpperCase())
				.toList();

		System.out.println("Result using Stream : " + resultUsingStream);
// Terminal Operation
		names.stream().forEach(name -> System.out.println(name));
		names.stream().anyMatch(name -> name.startsWith("R"));
	}

}
