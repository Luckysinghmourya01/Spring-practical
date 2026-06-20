package com.rays.sterotype.anotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("person")
@Scope("prototype") /* bean scope change krne k liya */
/*
 * agar hmm yha bean ka name nhi dete to by default class ke name se bean create
 * kr dega
 */
public class Person {

	private String name;
	private String address;
	@Value("#{num}")
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

	@Value("Lucky") /* bina value annotation ke value set kiya */
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	@Value("Pithampur")
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}
