package com.rays.sterotype.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("sterotype.anotation.xml");
		Account account = context.getBean("account", Account.class);

		System.out.println(account);
		System.out.println(account.getNumber().getClass().getName());
		System.out.println(account.getNumber());
	}
}
