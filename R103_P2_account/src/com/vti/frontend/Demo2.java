package com.vti.frontend;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Mơì bạn nhập vào 1 số nguyên: ");
//		int a = scanner.nextInt();
// Kiểm tra: Nếu người dùng nhập vào số >=0 thì in ra bạn vừa nhập vào số nguyên dương
//			 Nếu người dùng nhập vào số <0 thì in ra bạn vừa nhập vào số nguyên âm

//		System.out.println("Số nguyên bạn vừa nhập là: " + a);
//		if (a > 0) {
//			System.out.println("bạn vừa nhập vào số nguyên dương");
//		} else if (a == 0) {
//			System.out.println("bạn vừa nhập vào số 0");
//		} else {
//			System.out.println("bạn vừa nhập vào số nguyên âm");
//		}

//		if (a < 0) {
//			System.out.println("bạn vừa nhập vào số nguyên âm");
//
//		}
		System.out.println("Mơì bạn nhập vào 1 số thứ nhất: ");
		int a = scanner.nextInt();

		System.out.println("Mơì bạn nhập vào 1 số thứ hai: ");
		int b = scanner.nextInt();

//		So sánh: số nào lớn hơn
		int max;
//		if (a > b) {
//			max = a;
//		} else {
//			max = b;
//		}
		max = (a > b) ? a : b; // Ternary
		System.out.println("Số lơn hơn trong 2 số là: " + max);
	}
}
