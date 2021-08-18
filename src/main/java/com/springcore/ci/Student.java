package com.springcore.ci;

public class Student {

	private String name;
	private int age;
	private Address address;
	

	
	public Student(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}


}
