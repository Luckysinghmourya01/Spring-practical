package com.rays.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnotationBean {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("subject set");
		this.subject = subject;
	}

	public AnotationBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AnotationBean [subject=" + subject + "]";
	}

	@PostConstruct
	public void init() {

		System.out.println("init method : subject");
	}

	@PreDestroy
	public void destory() {

		System.out.println("destory method : subject");
	}

}
