package com.rays.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnotation {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");

		AnotationBean bean = (AnotationBean) context.getBean("anotation");

		System.out.println(bean);

		context.registerShutdownHook();

	}
}
