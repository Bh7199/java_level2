package com.java_level2;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String address;

	public Employee(int id, String fname, String lname, int age, String address) {
		this.setId(id);
		setFirstname(fname);
		setLastname(lname);
		this.setAge(age);
		this.setAddress(address);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
