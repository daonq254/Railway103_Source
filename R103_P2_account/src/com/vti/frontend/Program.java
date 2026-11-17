package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Program {
	public static void main(String[] args) {
		// Tạo các phòng ban tương ứng
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "BOD";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Maketting";

//		Tạo ra các position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.Dev;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.Scrum_Master;
//		Tạo Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Mentor";

		Group group2 = new Group();
		group2.id = 1;
		group2.name = "Tutor";

		Group group3 = new Group();
		group3.id = 1;
		group3.name = "Football";

//		Tạo  Account
		// account 1
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "daonq1@gmail.com";
		account1.userName = "daonq1";
		account1.fullName = "Nguyễn Đạo 1";
		account1.department = department1;
		account1.position = position2;
		account1.createDate = LocalDate.of(2026, 11, 17);

		Group[] groupAccount1 = { group1, group3 };
		account1.groups = groupAccount1;

		// account 2
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "daonq2@gmail.com";
		account2.userName = "daonq2";
		account2.fullName = "Nguyễn Đạo 2";
		account2.department = department2;
		account2.position = position3;
		account2.createDate = LocalDate.of(2026, 11, 15);

		Group[] groupAccount2 = { group1, group2, group3 };
		account2.groups = groupAccount2;

		// account 3
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "daonq3@gmail.com";
		account3.userName = "daonq3";
		account3.fullName = "Nguyễn Đạo 3";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = LocalDate.of(2026, 10, 10);

		Group[] groupAccount3 = { group1 };
		account3.groups = groupAccount3;

////		 Hiển thị thông tin account 1
//		System.out.println("Account, id: " + account1.id + " ,email: " + account1.email + " ,fullname: "
//				+ account1.fullName + " ,department: " + account1.department.name + " ,group: "
//				+ account1.groups[0].name + " ," + account1.groups[1].name);
//
////		 Hiển thị thông tin account 2
//		System.out.println("Account, id: " + account2.id + " ,email: " + account2.email + " ,fullname: "
//				+ account2.fullName + " ,department: " + account2.department.name + " ,group: "
//				+ account2.groups[0].name + " ," + account2.groups[1].name);

//		account1.showInfoAccount();
//		account2.showInfoAccount();
//		account3.showInfoAccount();

		System.out.println(account1.toString());
		System.out.println(account2.toString());

		System.out.println(department1.toString());
		System.out.println(department2.toString());
	}

}
