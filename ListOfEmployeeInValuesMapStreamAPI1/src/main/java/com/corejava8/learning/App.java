package com.corejava8.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		List<Employee> listOfEmployeeWithoutDuplicateId = new ArrayList<>();
		listOfEmployeeWithoutDuplicateId.add(new Employee(10L, "A", 15, "Software developer"));
		listOfEmployeeWithoutDuplicateId.add(new Employee(11L, "B", 11, "Solution Architect"));
		listOfEmployeeWithoutDuplicateId.add(new Employee(12L, "C", 12, "Software Tester"));
		listOfEmployeeWithoutDuplicateId.add(new Employee(19L, "D", 19, "Software Consultant"));
		listOfEmployeeWithoutDuplicateId.add(new Employee(30L, "E", 30, "CEO"));

		System.out.println(listOfEmployeeWithoutDuplicateId);

		// Convert List to Map

		Map<Long, Employee> mapEmployee = listOfEmployeeWithoutDuplicateId.stream().collect(Collectors.toMap(employee -> employee.getId(), employee -> employee));
		System.out.println(mapEmployee);
		mapEmployee.values().stream().forEach(System.out::println);
		
		
		// Convert List to Map + GroupingBy Designation , which will contains list of values for a key
		Map<String, List<Employee>> groupedByDesiginationOfEmployee = mapEmployee.values().stream().collect(Collectors.groupingBy(Employee::getDesignation));
		System.out.println(groupedByDesiginationOfEmployee);
		
		
		// Duplicate Id of Employee
		List<Employee> listOfEmployeeWithDuplicateId = new ArrayList<>();
		listOfEmployeeWithDuplicateId.add(new Employee(10L, "A", 15, "Software developer"));
		// listOfEmployeeWithDuplicateId.add(new Employee(10L,"B",11,"Solution Architect"));
		// Below is Exception with Duplicate Id
		//Exception in thread "main" java.lang.IllegalStateException: Duplicate key 10 (attempted merging values Employee [id=10, name=A, age=15,designation=Software developer] and Employee [id=10, name=B, age=11,designation=Solution Architect])

		listOfEmployeeWithDuplicateId.add(new Employee(10L, "B", 11, "Solution Architect"));
		listOfEmployeeWithDuplicateId.add(new Employee(12L, "C", 12, "Software Tester"));
		listOfEmployeeWithDuplicateId.add(new Employee(19L, "D", 19, "Software Consultant"));
		listOfEmployeeWithDuplicateId.add(new Employee(30L, "E", 30, "CEO"));
		//adding duplicate key below
		listOfEmployeeWithDuplicateId.add(new Employee(10L,"B",11,"Solution Architect"));
		System.out.println(listOfEmployeeWithDuplicateId);

		// Convert List to Map

		
		 Map<Long, Employee> mapEmployee1 = listOfEmployeeWithDuplicateId.stream().collect(Collectors.toMap(employee -> employee.getId(), employee -> employee));
		 System.out.println(mapEmployee1);

		// Solution for Duplicate Id
		Map<Long, String> mapEmployee2 = listOfEmployeeWithDuplicateId.stream().collect(Collectors.toMap(employee -> employee.getId(), employee -> employee.getName(), (e1, e2) -> e1 + "," + e2));
		System.out.println(mapEmployee2);
		
		
		// BUT I WAN TP KEEP COMPLETE OBJECT AS VALUE, THEN MANAGE DUPLICATES
		
		
		// https://stackoverflow.com/questions/54281167/how-to-convert-listsometype-to-map-keeping-all-duplicate-key-and-values
//https://www.javaprogramto.com/2020/07/java-8-convert-list-to-map-handling-duplicate-keys.html
		//https://stackoverflow.com/questions/54281167/how-to-convert-listsometype-to-map-keeping-all-duplicate-key-and-values#new-answer
		//https://stackoverflow.com/questions/34989759/issue-with-java-8-collectors-type-mismatch-cannot-convert-from-listobject-to
		//Map<Long, Employee> mapEmployee2 = listOfEmployeeWithDuplicateId.stream()
				//.collect(Collectors.toMap(employee -> employee.getId(), employee -> employee,
					//	(oldValue, newValue) -> mergeEntriesWithDuplicatedKeys(oldValue, newValue)));
		// System.out.println(mapEmployee2);
	}

	
	/*
	 * private static List<Employee> mergeEntriesWithDuplicatedKeys(Employee
	 * oldValue, Employee newValue) { List<Employee> mergedResults = new
	 * ArrayList<>(); mergedResults.add(oldValue); mergedResults.add(newValue);
	 * return mergedResults; }
	 */

	/*
	 * private static List<Employee> mergeEntriesWithDuplicatedKeys(List<Employee>
	 * oldValue, List<Employee> newValue) { List<Employee> mergedResults = new
	 * ArrayList<>(); mergedResults.addAll(oldValue);
	 * mergedResults.addAll(newValue); return mergedResults; }
	 */
}
