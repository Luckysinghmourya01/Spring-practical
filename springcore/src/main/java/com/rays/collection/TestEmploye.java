package com.rays.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmploye {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");

		EmployeBean employe = (EmployeBean) context.getBean("employe");

		System.out.println("Name= " + employe.getName());
		System.out.println("PhoneNo=" + employe.getPhoneNo());
		System.out.println("Address=" + employe.getAddress());
		System.out.println("Salary=" + employe.getSalary());
		System.out.println("jdbc=" + employe.getPropos());
	}
}
