package com.rays.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReference {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("reference.xml");

		ClassA a = (ClassA) context.getBean("a");

		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		
		System.out.println(a);
	}
}
