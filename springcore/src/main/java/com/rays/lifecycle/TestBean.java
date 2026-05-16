package com.rays.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	public static void main(String[] args) {
		
	AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("lifecycle.xml");
	
	MyBean bean = (MyBean)context.getBean("bean");
	
	System.out.println(bean);
	
	//((ClassPathXmlApplicationContext) context).close();
	context.registerShutdownHook(); // object destory krne ka liya
	}
}
