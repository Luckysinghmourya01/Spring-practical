package com.rays.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> name;
	private Map<String, String> salary;
	private Properties prop;

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Map<String, String> getSalary() {
		return salary;
	}

	public void setSalary(Map<String, String> salary) {
		this.salary = salary;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + "]";
	}

}
