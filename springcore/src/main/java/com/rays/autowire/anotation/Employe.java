package com.rays.autowire.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employe {

	@Autowired
	@Qualifier("address1")
	private Address adress;

	public Address getAdress() {
		return adress;
	}

//	@Autowired
	public void setAdress(Address adress) {
		System.out.println("set value");
		this.adress = adress;
	}

	public Employe() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employe [adress=" + adress + "]";
	}

}
