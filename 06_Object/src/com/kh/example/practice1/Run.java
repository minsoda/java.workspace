package com.kh.example.practice1;

import java.util.Scanner;

import com.kh.example.practice1.model.Member;

public class Run {
	
	public static void main(String[] args) {
		Member a = new Member();
		
		a.printName();
	
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 이름 > ");
		String name = sc.nextLine();
		
		a.changeName(name);
		a.printName();
		
	}
		
	}
		


