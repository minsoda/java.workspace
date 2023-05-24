package com.kh.step3.model;

import com.kh.step3.Calculator;

public class Application {
	
	public static void main(String[] args) {
		
		/*
		 * 변수 호출 방법
		 * - 참조변수, 변수;
		 * 
		 *  메서드 호출 바업
		 *  -참조변수, 메서드이름();            // 매게변수가 없는 경우
		 *  -참조변수, 메서드이름(값1,값2, ...); // 매게변수가 있는 경우
		 * */
		Calculator c = new Calculator();
		
		c.a =5;
		c.b =4;
		
		System.out.println("최대값 : " + c.max());
		
		System.out.println();
	
		System.out.println("더하기 : " + c.add());
		System.out.println("빼기 : " + c.substract());
		System.out.println("곱하기 : " + c.multiply(c.a, c.b));
		System.out.println("나누기 : " + c.divide(c.a, c.b));
		
		System.out.println();
		
		System.out.println("팩토리얼 : " + c.factorial(c.a));
	
	}
}
