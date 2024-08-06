package com.corejava8.learning;

import java.util.Objects;

public class Employee {
	
	// member variables
    private Long id;
    private String name;
    private int age;
    private String designation;
    
    public Employee() {}
    
    // 4-arg parameterized constructor
	public Employee(Long id, String name, int age, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, designation, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(designation, other.designation) && id == other.id
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
 
  
}
