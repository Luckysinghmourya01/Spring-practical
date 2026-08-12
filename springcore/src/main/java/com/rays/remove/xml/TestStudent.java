package com.rays.remove.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

		Student student = context.getBean("student", Student.class);

		System.out.println(student.getName());

		student.study();

	}
}
