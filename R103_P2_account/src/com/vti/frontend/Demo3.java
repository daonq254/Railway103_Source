package com.vti.frontend;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
//
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mơì bạn nhập vào 1 số(1-7) : ");
		int day = scanner.nextInt();
//		if (day == 1) {
//			System.out.println("Chủ nhật");
//		} else if (day == 2) {
//			System.out.println("Thứ 2");
//		} else if (day == 3) {
//			System.out.println("Thứ 2");
//		} else if (day == 4) {
//			System.out.println("Thứ 4");
//		} else if (day == 5) {
//			System.out.println("Thứ 5");
//		} else if (day == 6) {
//			System.out.println("Thứ 6");
//		} else if (day == 7) {
//			System.out.println("Thứ 7");
//		} else {
//			System.out.println("Số nhập không đúng");
//		}
		switch (day) {
		case 1:
			System.out.println("Chủ nhật");
			break;
		case 2:
			System.out.println("Thứ 2");
			break;
		case 3:
			System.out.println("Thứ 3");
			break;
		case 4:
			System.out.println("Thứ 4");
			break;
		case 5:
			System.out.println("Thứ 5");
			break;
		case 6:
			System.out.println("Thứ 6");
			break;
		case 7:
			System.out.println("Thứ 7");
			break;
		default:
			System.out.println("Số bạn nhập chưa chính xác");
			break;
		}

	}
}
