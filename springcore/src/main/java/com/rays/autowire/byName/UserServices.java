package com.rays.autowire.byName;

public class UserServices {

	private UserInt user;

	public UserInt getUser() {
		return user;
	}

	public void setUser(UserInt user) {
		this.user = user;
	}

	public void testAdd() {
		user.add();
	}

}
