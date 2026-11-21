package com.vti.backend;

import com.vti.entity.Department;

public class Exercise1 {

	public void question1() {
		System.out.println("Lời giải question 1");
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "BOD";
		System.out.println(department1.toString());
		System.out.println(department2.toString());
	}

	public void question2() {
		System.out.println("Lời giải question 2");
	}

//	...
}
