package com.rays.sterotype.anotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person") /*
			 * agar hmm yha bean ka name nhi dete to by default class ke name se bean create
			 * kr dega
			 */
public class Person {

	private String name;
	private String address;

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
