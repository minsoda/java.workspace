package com.kh.plactice;

import java.util.Scanner;

public class VariablePractice {

	
	//FQCN(Fully Qualified Class Name)
	//클래스가 속한 패키지명을 모두 포함한 이름
	
	public static void main(String[] args) {
		
		VariablePractice v = new VariablePractice();
		v.method1();
		v.method2();
		v.method3();
		v.method4();
	}

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (a+b) );
		System.out.println("빼기 결과 : " + (a-b) );
		System.out.println("곱하기 결과 : " + (a*b) );
		System.out.println("나누기 몫 결과 : " + (a/b) );
		
	}
	
	public void method2 () {
	 
	 int a = 10000;
	 int b = 7000;
	 
	 System.out.println("성인 2명 : " + (a * 2) + "원");
	 System.out.println("청소년 3명 : " + (b * 3) + "원");
	 System.out.println();
	 
	 System.out.println("총 금액 : " + ((a*2)+(b*3)) + "원");
		
	}
	
	public void method3 () {
		int x = 5;
		int y = 7;
		int z = 9;
		
		int a = 0;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
		
	}
	
	public void method4 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String a = sc.next();
		
		System.out.println("첫번째 문자 : " + a.charAt(0));
		System.out.println("마지막 문자 : " + a.charAt(7));
		
	}
}
		

		
		
		
	
	
