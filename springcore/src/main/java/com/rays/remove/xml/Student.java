package com.rays.remove.xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	private String name;

	public String getName() {
		return name;
	}

	@Value("Lucky Singh Mourya")
	public void setName(String name) {
		this.name = name;
	}

	public void study() {

		System.out.println("this is a student data");
	}
}
