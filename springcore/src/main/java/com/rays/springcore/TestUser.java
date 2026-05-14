package com.rays.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");

		UserBean user = (UserBean) context.getBean("user");

		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getEmail());
		System.out.println(user.getMobileNo());
	}
}
