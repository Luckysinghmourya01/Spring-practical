package com.rays.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/rays/constructor/constructor.xml");

		Person person = (Person) context.getBean("person1");
		
		System.out.println(person);

	}
}
