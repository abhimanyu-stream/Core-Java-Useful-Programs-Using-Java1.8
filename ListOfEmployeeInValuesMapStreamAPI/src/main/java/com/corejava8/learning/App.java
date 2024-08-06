package com.corejava8.learning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        Map<String, Company> mapOfCompany = new HashMap<>();
        
        mapOfCompany.put("north-america", new Company("Intel", 1L, Arrays.asList(new Employee("Java",150L), new Employee("Spring",160L), new Employee("Hibernate",170L),new Employee("JPA",180L) )));
        mapOfCompany.put("south-america", new Company("Sony", 1L, Arrays.asList(new Employee("Laptop",250L), new Employee("Computer",260L), new Employee("CoreJava8",270L),new Employee("8kSamsung",280L) )));
        
        //mapOfCompany.values().stream().flatMap(company->company.getLisOfEmployee().stream()).collect(Collectors.toList()).forEach(System.out::println);
        
        // List of Company with out Sorting
        // Convert Map to List
        List<Company> listOfCompany =  mapOfCompany.values().stream().collect(Collectors.toList());
        System.out.println(listOfCompany);
        //System.out.println(listOfCompany.stream().sorted(Comparator.comparing(Company::getName)).collect(Collectors.toList()));
        // Sorted List of Company
        List<Company> listCompanySorted = listOfCompany.stream().sorted(Comparator.comparing(Company::getName)).collect(Collectors.toList());
        System.out.println(listCompanySorted);
        
        // Retrieve List of Employee from  Map of Employee
        // Convert Map to List
        List<Employee> listOfEmployee = mapOfCompany.values().stream().flatMap(company->company.getLisOfEmployee().stream()).collect(Collectors.toList());
        System.out.println(listOfEmployee);
        
        // Convert List Of Employee into Map of Employee
        // Convert List to Map
        Map<Long, Employee> mapOfEmployee = listOfEmployee.stream().collect(Collectors.toMap(employee -> employee.getId(), employee -> employee));
        //printing MapOfEmployee
        mapOfEmployee.forEach((key, value) -> System.out.println("key : " + key + "\tValue : " + value));
    }
}
