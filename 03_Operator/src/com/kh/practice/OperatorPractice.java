package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	public static void main(String[] args) {
		
		OperatorPractice o = new OperatorPractice();
//		o.method1();
//		o.method2();
//		o.method3();
//		o.method4();
//		o.method5();
//		o.method6();
		
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.print("인원 수 : ");
		a = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		b = sc.nextInt();
		
		System.out.println("1인당 연필 개수 : " + b/a);
		
		System.out.println("남은 연필 개수 : " + b%a);
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		System.out.print("양수를 입력해주세요 > ");
		a = sc.nextInt();
		
		
		System.out.println(a/100*100);
		
		
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		boolean result = false;
		
		System.out.print("입력 1 : ");
		a = sc.nextInt();
		
		System.out.print("입력 2 : ");
		b = sc.nextInt();
		
		System.out.print("입력 3 : ");
		c = sc.nextInt();
		
		result = (a == b) && (b == c);
		System.out.println(result);

	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		
		String result = (num1 % 2 == 0)? "짝수다" : "홀수다";
		System.out.println(result);
		
	
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		String result = "";
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		result = (age <=13)?  "어린이" : ((age<=19)? "청소년" : "성인");
		System.out.println(result);
		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		int ap = 0;
		int bk = 0;
		
		System.out.print("사과의 개수 : ");
		ap = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		bk = sc.nextInt();
		
		int n = ap / bk + ((ap % bk == 0)? 0 : 1);
		
	System.out.println("필요한 바구니의 수 : " + n);
	}
}
