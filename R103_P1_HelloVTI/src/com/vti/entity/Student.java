package com.vti.entity;

public class Student {
//	Thuộc tính
	public int id;
	public String name;
	public int age;

//	Phương thức
//	Khai báo phương thức giới thiệu bản thân
	public void showInfor() {
		System.out.println("-----------------------");
		System.out.println("Học viên giới thiệu bản thân");
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}

	public void goToVTI() {
		System.out.println("Học viên tới VTI để học tập");
	}
}
