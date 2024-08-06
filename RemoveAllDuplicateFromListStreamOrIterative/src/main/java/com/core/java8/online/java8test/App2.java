package com.core.java8.online.java8test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {

	public static void main(String[] args) {

		List<String> listWithDuplicatesString = new ArrayList<>();
		listWithDuplicatesString.add("a");
		listWithDuplicatesString.add("java");
		listWithDuplicatesString.add("java");
		listWithDuplicatesString.add("java");
		listWithDuplicatesString.add("java");
		listWithDuplicatesString.add("java");

		System.out.println(listWithDuplicatesString);

		List<String> listWithoutDuplicates = listWithDuplicatesString.stream().distinct().collect(Collectors.toList());
		
		System.out.println(listWithoutDuplicates);

	}

}
