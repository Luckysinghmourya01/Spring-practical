package com.rays.autowire.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employe {

	@Autowired
	@Qualifier("address")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
	}

	public Employe() {
		// TODO Auto-generated constructor stub
	}

	
	public Employe(Address address) {
		super();
		System.out.println("constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employe [address=" + address + "]";
	}

}
