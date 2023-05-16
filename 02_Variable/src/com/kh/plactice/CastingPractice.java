package com.kh.plactice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
	
	CastingPractice cp = new CastingPractice();
	cp.method1();
	//cp.method2();
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		int a = sc.nextInt();
		a ='A';
			System.out.println("A unicode : " + a );
			System.out.println("B unicode : " + (a+1));
		
	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.print("국어 : ");
		
		int e = sc.nextInt();
		System.out.print("영어 : ");
		
		int m = sc.nextInt();
		System.out.print("수학 : ");
		
		System.out.println("총점 : " + (k+e+m));
		System.out.println("평균 : " + ((k+e+m)/3));
		
	}

}
