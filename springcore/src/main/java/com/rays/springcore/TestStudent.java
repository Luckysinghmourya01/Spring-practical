package com.rays.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");

		StudentBean student = (StudentBean) context.getBean("student1");

		System.out.println(student.getId());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAddress());

		System.out.println("-----------------------------------");

		StudentBean student2 = (StudentBean) context.getBean("student2");

		System.out.println(student2.getId());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getStudentAddress());

	}
}
