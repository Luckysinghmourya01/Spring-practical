package com.rays.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("standalone.collection.xml");

		Person person = context.getBean("person", Person.class);

		System.out.println(person.getName().getClass().getName());
		System.out.println(person);

		System.out.println("------------------------------------");

		System.out.println(person.getSalary());
		System.out.println(person.getSalary().getClass().getName());

		System.out.println("-------------------------");
		System.out.println(person.getProps());

	}
}
 