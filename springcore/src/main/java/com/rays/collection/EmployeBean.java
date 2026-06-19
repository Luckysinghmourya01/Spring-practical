 package com.rays.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class EmployeBean {

	private String name;
	private List<String> phoneNo;
	private Set<String> address;
	private Map<String, String> salary;
	private Properties propos;

	public Properties getPropos() {
		return propos;
	}

	public void setPropos(Properties propos) {
		this.propos = propos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getSalary() {
		return salary;
	}

	public void setSalary(Map<String, String> salary) {
		this.salary = salary;
	}

	public EmployeBean(String name, List<String> phoneNo, Set<String> address, Map<String, String> salary) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
	}

	public EmployeBean() {
		// TODO Auto-generated constructor stub
	}
}
