package com.luv.com.web.jdbc;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String e_mail;
	
	public Student(int id, String firstName, String lastName, String e_mail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.e_mail = e_mail;
	}
	
	public Student(String firstName, String lastName, String e_mail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.e_mail = e_mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", e_mail=" + e_mail + "]";
	}
	
	
	
	
	
	
}
