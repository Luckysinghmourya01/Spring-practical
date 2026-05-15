package com.rays.constructor;

import java.util.List;

public class Person {

	private int id;
	private String name;
	private String email;
	private List<String> phone;

	public Person(int id, String name, String email, List<String> phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return this.id + " :" + this.name + " :" + this.email + ":" + this.phone;
	}

}
