package com.vti.entity;

public class Person {
	public String name;
	public int age;

//	Hàm contructor
	public Person() {
//		this.name = "daonq123";
//		this.age = 45;
	}

	public Person(String p_name, int p_age) {
		this.name = p_name;
		this.age = p_age;
	}

//	
	public void showInfo() {
		System.out.println("...");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
