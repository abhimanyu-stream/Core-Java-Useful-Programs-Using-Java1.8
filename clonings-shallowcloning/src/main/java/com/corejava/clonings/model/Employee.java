package com.corejava.clonings.model;

import java.util.Objects;

public class Employee implements Cloneable {

	private int empoyeeId;
	private String employeeName;
	private Department department;

	public Employee() {}
	public Employee(int id, String name, Department dept)
	{
		this.empoyeeId = id;
		this.employeeName = name;
		this.department = dept;
	}
	
	//clone()
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	public int getEmpoyeeId() {
		return empoyeeId;
	}
	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, employeeName, empoyeeId);
	}

	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; return Objects.equals(department,
	 * other.department) && Objects.equals(employeeName, other.employeeName) &&
	 * empoyeeId == other.empoyeeId; }
	 */
	
	
	  @Override 
	  public boolean equals(Object obj) { 
		  if (this == obj) return true;
		  if (obj == null) return false; 
		  if (getClass() != obj.getClass()) 
			  return false; 
		  Employee other = (Employee) obj;
		  return Objects.equals(department,other.department) && Objects.equals(employeeName, other.employeeName) && empoyeeId == other.empoyeeId; 
	}
	 
	@Override
	public String toString() {
		return "Employee [empoyeeId=" + empoyeeId + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}
	
	

	//Getters and Setters
	
	
}