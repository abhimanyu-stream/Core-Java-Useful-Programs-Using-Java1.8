package com.corejava.clonings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.corejava.clonings.model.Department;
import com.corejava.clonings.model.Employee;

@SpringBootApplication
public class CloningsApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		SpringApplication.run(CloningsApplication.class, args);
		
		
		
		
		Department dept = new Department(1, "Human Resource");
		Employee original = new Employee(1, "Admin", dept);

		//Lets create a clone of original object
		Employee cloned = (Employee) original.clone();

		//Let verify using employee id, if cloning actually workded
		System.out.println(cloned.getEmpoyeeId());

		//Verify JDK's rules

		//Must be true and objects must have different memory addresses
		System.out.println(original != cloned);

		//As we are returning same class; so it should be true
		System.out.println(original.getClass() == cloned.getClass());

		//Default equals method checks for references so it should be false. If we want to make it true,
		//then we need to override equals method in Employee class.
		// If Employee class do not override equals() then below output is false
		// If Employee class  override equals() then below output is true
		System.out.println(original.equals(cloned));
		
		
		
		// Break Object's state
		//Let change the department name in cloned object and we will verify in original object
				cloned.getDepartment().setName("Finance");

				System.out.println(original.getDepartment().getName());
				System.out.println(cloned.getDepartment().getName());
	}

}
