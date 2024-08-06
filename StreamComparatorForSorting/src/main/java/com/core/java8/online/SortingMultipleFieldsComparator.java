package com.core.java8.online;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class SortingMultipleFieldsComparator

{
	public static void main(String[] args) {

		List<Employee> employees = getUnsortedEmployeeList();

		// Compare by first name and then last name
		Comparator<Employee> compareByFirstName = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getFirstName);

		//List<Employee> sortedEmployees = employees.stream().sorted(compareByName).collect(Collectors.toList());
		List<Employee> sortedEmployeesByFirstName = employees.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors.toList());

		for (Employee employee : sortedEmployeesByFirstName) {
			System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
		}
		
		Comparator<Employee> compareByLastName = Comparator.comparing(Employee:: getLastName);
		List<Employee> sortedEmployeesByLastName = employees.stream().sorted(compareByLastName).collect(Collectors.toList());
		

		for (Employee employee : sortedEmployeesByLastName) {
			System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
		}

	}

	private static List<Employee> getUnsortedEmployeeList() {


		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1L,"Abhimanyu","Kumar"));
		employeeList.add(new Employee(2L,"Xyz","yy"));
		employeeList.add(new Employee(3L,"LL","SZ"));
		employeeList.add(new Employee(4L,"I","W"));
		
		
		
		return employeeList;
	}

}
