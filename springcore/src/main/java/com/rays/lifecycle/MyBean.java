package com.rays.lifecycle;

public class MyBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyBean [name=" + name + "]";
	}

	public void init() {

		System.out.println("Inside init method");
	}

	public void destory() {

		System.out.println("inside destory method");
	}
}
