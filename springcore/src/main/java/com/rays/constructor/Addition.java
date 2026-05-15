package com.rays.constructor;

public class Addition {

	private int a;
	private int b;

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("int , int");
	}

	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
	}
	
	public Addition(String a, String b) {
		super();
		this.a =  Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("string , String  ");
	}

	public void doSum() {
		System.out.println("sum=" + (this.a + this.b));
	}

}
