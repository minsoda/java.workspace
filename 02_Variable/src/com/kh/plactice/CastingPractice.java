package com.kh.plactice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
	
	CastingPractice cp = new CastingPractice();
	//cp.method1();
	cp.method2();
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char a = sc.nextLine().charAt(0);
		int A = (int)a;
		
			System.out.println("A unicode : " + A );
			System.out.println("B unicode : " + (A+1));
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int k = sc.nextInt();
		
		System.out.print("영어 : ");
		int e = sc.nextInt();
		
		System.out.print("수학 : ");
		int m = sc.nextInt();
		
		float av = ((float)(k+e+m))/3;
		
		System.out.println("총점 : " + (k+e+m));
		System.out.printf("평균 : %.2f", av);
		
	}

}
