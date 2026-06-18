package com.rays.autowire.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnotation {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("anotation.xml");
		
	AnoService user = 	context.getBean("user1", AnoService.class);

		//Employe employe = context.getBean("employe", Employe.class);

		//System.out.println(employe);
	
	user.testAdd();
	}
}
   