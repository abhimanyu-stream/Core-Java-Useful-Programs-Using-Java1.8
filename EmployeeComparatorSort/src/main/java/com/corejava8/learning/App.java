package com.corejava8.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	// @Autowired
	// private EmployeeRepository empoyeeRepo;

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();// java8 syntax
		// consider 10000 employee object has beeen inserted
		employee.add(new Employee("Abhsiri", 25));
		employee.add(new Employee("Abhinav", 20));
		employee.add(new Employee("Rebecaa", 15));
		employee.add(new Employee("Callista", 10));

		Collections.sort(employee, new AgeComparator());
		// output in descending order
		System.out.println(employee);
		employee.sort(Comparator.comparing(Employee::getName));

	}

}

class AgeComparator implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		
		// Collections()
		// return o1.getAge().compareTo(o2.getAge());
		if (o1.getAge() > o2.getAge()) {
			return -1;
		} else if (o1.getAge() < o2.getAge()) {
			return 1;
		}
		return 0;
	}

}
