package com.rays.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {

	private List<String> name;
	private List<String> number;
	private Map<String, Integer> salary;

	public Map<String, Integer> getSalary() {
		return salary;
	}

	public void setSalary(Map<String, Integer> salary) {
		this.salary = salary;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public List<String> getNumber() {
		return number;
	}

	public void setNumber(List<String> number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", number=" + number + ", salary=" + salary + "]";
	}
}
