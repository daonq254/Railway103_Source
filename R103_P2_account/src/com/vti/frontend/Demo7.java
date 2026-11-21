package com.vti.frontend;

import com.vti.entity.Person;

public class Demo7 {
	public static void main(String[] args) {
		Person person1 = new Person("daonq1", 40);

//		person1.name = "daonq";
//		person1.age = 40;
//		person1.showInfo();

		Person person2 = new Person("daonq2", 45);

		System.out.println(person1.toString());
		System.out.println(person2.toString());
	}
}
