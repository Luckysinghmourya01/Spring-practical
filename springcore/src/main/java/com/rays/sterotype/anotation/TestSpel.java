package com.rays.sterotype.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpel {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spel.xml");

		Spel spl = context.getBean("spl", Spel.class);

		System.out.println(spl);

		System.out.println(spl.getW());
		

	}
}
