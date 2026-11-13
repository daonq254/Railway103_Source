package com.vti.frontend;

import com.vti.entity.Student;

public class Program4 {
	public static void main(String[] args) {
//		student1: 
//			id: 1
//			name: khoa
//			age: 23
//
//		student2:
//			id: 2
//			name: Ngọc Anh
//			age: 20 
//
//		student3:
//			id: 3
//			name: Nhật
//			age: 25

//		Tạo ra các bạn sinh học
		Student student1 = new Student();
		student1.id = 1;
		student1.name = "Khoa";
		student1.age = 23;

		Student student2 = new Student();
		student2.id = 2;
		student2.name = "Ngọc Anh";
		student2.age = 20;

		Student student3 = new Student();
		student3.id = 3;
		student3.name = "Nhật";
		student3.age = 25;

//		Sử dụng dữ liệu
//		Hiển thị thông tin của student
		System.out.println(
				"Thông tin student1, id: " + student1.id + " ,name: " + student1.name + " ,age: " + student1.age);
		System.out.println(
				"Thông tin student2, id: " + student2.id + " ,name: " + student2.name + " ,age: " + student2.age);
		System.out.println(
				"Thông tin student3, id: " + student3.id + " ,name: " + student3.name + " ,age: " + student3.age);

		student1.showInfor();
		student2.showInfor();
		student3.showInfor();

	}
}
