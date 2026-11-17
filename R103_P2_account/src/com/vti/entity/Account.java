package com.vti.entity;

import java.time.LocalDate;

public class Account {
//	Thuộc tính
	public int id;
	public String email;
	public String userName;
	public String fullName;

	public Department department;
	public Position position;
	public LocalDate createDate;

	public Group[] groups;

//	Phương thức
	public void showInfoAccount() {
		System.out.println("Account, id: " + this.id + " ,email: " + this.email + " ,fullname: " + this.fullName
				+ " ,department: " + this.department.name);
	}

//	Hàm toString
//	@Override
//	public String toString() {
////		String accountInfo = "Account, id: " + this.id + " ,email: " + this.email + " ,fullname: " + this.fullName
////				+ " ,department: " + this.department.name;
//		return "Account, id: " + this.id + " ,email: " + this.email + " ,fullname: " + this.fullName + " ,department: "
//				+ this.department.name;
//	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + "]";
	}
}
