package com.kh.step3;

import java.util.Arrays;

public class Calculator {

	/*
	 * *메서드(method)
	 * - 작업을 수행하기 위한 명령문의 집합
	 * - 어떤값을 입력받아서 처리하고 그 결과를 돌려준다.
	 * - 단, 입력받는 값이 없을 수도 있고, 결과를 돌려주지 않을 수도 있음.
	 * - 하나의 메서드는 한 가지 기능만 수행하도록 작성하는 것을 권고
	 * 
	 * [표현법]
	 * 
	 * 리턴타입 메서드이름 (타입 변수명, 타입 변수명, ...) {
	 *
	 *    //메서드 호출시 수행될 코드
	 *		return;
	 *    }
	 *    
	 *    * return문
	 *    - 메서드에서 return문을 만나면 종료
	 *    - 반환값이 없는 (void) 경우 return문만 사용!
	 *    - 반환값이 있는 경우 return문 뒤에 반환값을 지정해야 함
	 */ 
	 	
	public int a;
	public int b;
	
	// 최대값을 구하는 메서드
	public int max() {
		if(a > b) return a;
		return b;
}
	
	/*
	 * 1. 인스턴스 메서드
	 * 	- 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
	 * 	- 인스턴스 변수나 인스턴스 메서드와 관련된 작업을 하는 메서드
	 * 2. 클래스 메서드(static 메서드)
	 *  - 객체 생성 없이 '클래스이름.메서드이름()'으로 호출
	 *  - 인스턴스 변수나 인스턴스 메서드와 관련 없는 작업을 하는 메서드
	 * */
	
	
	//더하기 
	public int add() {
		return a+b;
	}
	
	//빼기
	public int substract() {
		return a-b;
	}
	
	// 곱하기
	public static int multiply(int a, int b) { //static은 먼저 생성이 되기 때문에 매게변수() 사용
		return a*b;
	}
	
	// 나누기 - > 형태 : 몫은 1, 나머지는 3
	public static String divide(int a, int b) { // 문자와 숫자가 같이 있는 형식이라 사용
		return "몫은 " + quotient(a,b) + "나머지는 " + remaxinder(a,b);
	}
	
	public static int quotient(int a, int b) {
		return a/b;
	}
	
	public static int remaxinder(int a, int b) {
		return a%b;
	}
	
	/*
	 * 재귀 함수(Recursion Function)
	 *  - 메서드 내에서 자기자신을 반복적으로 호출
	 *  - 반복문으로 바꿀 수 있으며 반복문보다 성능이 나쁨
	 *  - 이해하기 쉽고 간결한 코드 작성이 가능
	 * */
	public int factorial(int n) {
		
		/*
		 * 팩토리얼!
		 * 1! = 1
		 * 2! = 2 * 1 = 2
		 * 3! = 3 * 2 * 1 =6
		 * 
		 * */
		
		int fac = 1;
		// 코드 작성!
		
		if(n!=1) fac = n *  factorial(n-1);
		
		return fac;
	}
	
}
	