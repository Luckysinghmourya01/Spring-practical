package com.rays.springcore;

public class StudentBean {

	private int id;
	private String studentName;
	private String studentAddress;

	public int getId() {
		return id;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public void setId(int id) {
		System.out.println("this is set id");
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public StudentBean(int id, String studentName, String studentAddress) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public StudentBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
