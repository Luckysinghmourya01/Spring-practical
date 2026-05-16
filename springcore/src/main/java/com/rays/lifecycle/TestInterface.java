package com.rays.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterface {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");

		InterfaceBean bean1 = (InterfaceBean) context.getBean("interface");

		System.out.println(bean1);
		
		context.registerShutdownHook();
	}
}
