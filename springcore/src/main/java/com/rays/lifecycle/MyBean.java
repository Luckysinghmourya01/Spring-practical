package com.rays.lifecycle;

public class MyBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("set Name");
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
		
		System.out.println("init method : bean created");
	}
	
	public void destory() {
		
		System.out.println("destory method : close");
	}

}
