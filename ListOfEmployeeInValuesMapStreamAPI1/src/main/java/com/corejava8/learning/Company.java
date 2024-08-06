package com.corejava8.learning;

import java.util.List;
import java.util.Objects;

public class Company {
	
	private String name;
	private Long regId;
	private List<Employee> lisOfEmployee;
	
	public Company() {}
	public Company(String name, Long i, List<Employee> lisOfEmployee) {
		super();
		this.name = name;
		this.regId = i;
		this.lisOfEmployee = lisOfEmployee;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", regId=" + regId + ", lisOfEmployee=" + lisOfEmployee + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(lisOfEmployee, name, regId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(lisOfEmployee, other.lisOfEmployee) && Objects.equals(name, other.name)
				&& Objects.equals(regId, other.regId);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRegId() {
		return regId;
	}
	public void setRegId(Long regId) {
		this.regId = regId;
	}
	public List<Employee> getLisOfEmployee() {
		return lisOfEmployee;
	}
	public void setLisOfEmployee(List<Employee> lisOfEmployee) {
		this.lisOfEmployee = lisOfEmployee;
	}
	
	
	

}
