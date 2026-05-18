package com.rays.autowire.bytype;

public class Employe {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

	public Employe(Address address) {
		super();
		this.address = address;
	}

	public Employe() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employe [address=" + address + "]";
	}

}
