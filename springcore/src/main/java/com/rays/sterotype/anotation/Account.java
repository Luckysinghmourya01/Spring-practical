package com.rays.sterotype.anotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("account")
public class Account {

	private String name;
	private String type;
	@Value("#{no}")
	private List<String> number;

	public List<String> getNumber() {
		return number;
	}

	public void setNumber(List<String> number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	@Value("lucky")
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	@Value("Saving")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", type=" + type + ", number=" + number + "]";
	}

}
