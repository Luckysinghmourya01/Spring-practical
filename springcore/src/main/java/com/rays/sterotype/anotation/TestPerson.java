package com.rays.sterotype.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("sterotype.anotation.xml");

		Person person = context.getBean("person", Person.class);

		System.out.println(person);
		System.out.println("-----------------");

		System.out.println(person.getNumber());

		System.out.println(person.hashCode());

		
		  Person person1 = context.getBean("person", Person.class);
		 
		System.out.println(person1.hashCode());

	}
}
