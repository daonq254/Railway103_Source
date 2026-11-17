package com.vti.frontend;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Nhập tên
		System.out.println("Mơì bạn nhập tên: ");
		String name = scanner.nextLine();

//		Nhập tuổi của người dùng
		System.out.println("Mơì bạn nhập tuổi: ");
		int age = scanner.nextInt();

//		Nhập điểm GPA của người dùng
		System.out.println("Mơì bạn nhập điểm GPA: ");
		float gpa = scanner.nextFloat();

		System.out.println("Tên của bạn là: " + name);
		System.out.println("Tuổi của bạn là: " + age);
		System.out.println("Điểm GPA của bạn là: " + gpa);
	}
}
