package com.core.java8.online;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		List<String> listOfSubject = Arrays.asList("java", "spring", "microservice", "kotlin");

		List<String> newListOfSubjectJava8 = removeOneSubjectJava8(listOfSubject, "kotlin");

		newListOfSubjectJava8.stream().forEach(System.out::println);
		
		List<String> newListOfSubjectJava6 = removeOneSubjectJava6(listOfSubject, "kotlin");

		newListOfSubjectJava6.stream().forEach(System.out::println);
	

		//List<String> result = listOfSubject.stream() .filter(line -> !"kotlin".equals(line)).collect(Collectors.toList()); 

		//result.forEach(System.out::println);

	}

	private static List<String> removeOneSubjectJava6(List<String> listOfSubject, String subjectTORemoved) {
		
		List<String> newListOfSubjectJava6 = new ArrayList<>();
		
		for(String s:listOfSubject) {
			
			if(!(s.equals(subjectTORemoved))){
				newListOfSubjectJava6.add(s);
			}
		}


		return newListOfSubjectJava6;
	}

	private static List<String> removeOneSubjectJava8(List<String> listOfSubject, String subject) {

		List<String> output = listOfSubject.stream().filter(oneSubject -> !oneSubject.equals(subject)).collect(Collectors.toList()); 
		return output;
	}

}
