package com.kh.example.practice1.model;

public class Member {
	
			
	public String memberld;
	public String memberPwd;
	public String memberName = "김민소";
	public int age;
	public char gender;
	public String phone;
	public String email;


	public void changeName(String name) { //매게 변수!
		memberName = name;
	}
	public void printName() {
		System.out.println(memberName);
	}
	
}