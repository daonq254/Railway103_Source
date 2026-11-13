package com.vti.frontend;

public class Program2 {
	public static void main(String[] args) {
// Viết chương trình tính tổng 2 số: 10, 20
//  Lưu trữ được số 10, 20 
		int a = 10;
		int b = 20;
		float f = 3.14f;
		int sum = a + b; // 30
		System.out.println("Tổng của 2 số là: " + sum);
//		
		char c = 'd';
		String s = "NGuyenDao";
		boolean t = true;

		Gender gender = Gender.Male;

//		 Kiểu mảng dữ liệu
//		String student1 = "Đạt";
//		String student2 = "Hiếu";
//		String student3 = "Nhật";
//		String student4 = "Cường";

		System.out.println("------------------");
		String[] students = { "Đạt", "Hiếu", "Nhật", "Cường" };
		System.out.println("Phần tử ở vị trí số 0:" + students[0]);
		System.out.println("Phần tử ở vị trí số 3:" + students[3]);
	}
}
