package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Exercise1;
import com.vti.backend.Exercise2;

public class Program2 {
	public static void main(String[] args) {
		Exercise1 exercise1 = new Exercise1();
//

//
		Exercise2 exercise2 = new Exercise2();

		Scanner scanner = new Scanner(System.in);
//		Hiển thị ra menu để người dùng lựa chọn
		while (true) {
			System.out.println("+===================================+");
			System.out.println("Mời bạn chọn câu hỏi muốn xem");
			System.out.println("1. Câu hỏi Ex1.Question 1");
			System.out.println("2. Câu hỏi Ex1.Question 2");
			System.out.println("3. Câu hỏi Ex2.Question 1");
			System.out.println("4. Câu hỏi Ex2.Question 2");
			System.out.println("+===================================+");

			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				exercise1.question1();
				break;

			case 2:
				exercise1.question2();

				break;

			case 3:
				exercise2.question1();
				break;

			case 4:
				exercise2.question2();
				break;

			default:
				break;
			}
		}
	}
}
