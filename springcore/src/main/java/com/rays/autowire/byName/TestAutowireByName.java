package com.rays.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByName {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-byname.xml");

		UserServices user = context.getBean("user1", UserServices.class);

		user.testAdd();
	}
}
 