package com.rays.constructor;

public class Person {

	private int id;
	private String name;
	private String email;

	public Person(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return this.id + " :" + this.name + " :" + this.email;
	}

}

