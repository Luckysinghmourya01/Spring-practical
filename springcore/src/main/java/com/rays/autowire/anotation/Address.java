package com.rays.autowire.anotation;

public class Address {

	private String city;
	private String code;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String code) {
		super();
		this.city = city;
		this.code = code;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", code=" + code + "]";
	}
	
	

}
