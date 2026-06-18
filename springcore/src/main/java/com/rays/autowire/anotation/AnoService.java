package com.rays.autowire.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnoService {

	@Autowired
	@Qualifier("anotation")
	private AnoInt anotation;

	public AnoInt getAnotation() {
		return anotation;
	}

	public void setAnotation(AnoInt anotation) {
		this.anotation = anotation;
	}
	
	public void testAdd() {
		anotation.add();
	}
}
