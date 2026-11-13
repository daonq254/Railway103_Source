package com.vti.frontend;

public class Program3 {
// Main
	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int sum = a + b; // 30
//		System.out.println("Tổng của 2 số là: " + sum);
		sum(10, 20);
		sum(50, 20);
//		Demo sum_a_b
		System.out.println(sum_a_b(100, 150));

	}

//	Hàm tính tổng 2 số
	public static void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Tổng 2 số là: " + sum);
	}

	public static int sum_a_b(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
