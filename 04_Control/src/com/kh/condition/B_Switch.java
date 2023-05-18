package com.kh.condition;

import java.util.Scanner;

public class B_Switch {

	Scanner sc = new Scanner(System.in);

	/*
	 * switch문
	 * 
	 * [표현법]
	 * 
	 * switch(조건식) { case 값1 : ... 조건식의 결과가 값1과 같을 경우 실행 코드 ... break; case 값2 : ...
	 * 조건식의 결과가 값2와 같을 경우 실행 코드 ... break; default : ... 조건식의 결과가 일치하는 case문이 없을 때
	 * 실행 코드 ... }
	 * 
	 * 
	 * - case 문의 수는 제한이 없다. - 조건식 결과 정수,문자,문자열이여야 한다. - 조건문을 빠져나오려면 break가 필요하다.//
	 * 경우에 따라서 각 사용하지 않아도 가능 - default문은 생략 가능한다.
	 */

	public void method1() {

		/*
		 * 숫자를 입력받아 1일 경우 "빨간색" 2일 경우 "파란색" 3일 경우 "초록색" 잘못 입력했을 경우 "잘못 입력했습니다."
		 * 
		 */

		System.out.print("정수 입력 > ");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("빨간색");
		} else if (num == 2) {
			System.out.println("파란색");
		} else if (num == 3) {
			System.out.println("초록색");
		} else {
			System.out.println("잘못 입력했습니다.");
		}

		switch (num) {

		case 1:
			System.out.println("빨간색");
			break;
		case 2:
			System.out.println("파란색");
			break;
		case 3:
			System.out.println("초록색");
			break;
		default:
			System.out.println("잘못 입력했습니다.");

		}

	}
	/*
	 * break 없을 경우의 문제
	 * 
	 * 등급별 권한 1 : 관리권환, 글쓰기권환, 읽기권환 2 : 글쓰기권환, 읽기권환 3 : 읽기권환
	 * 
	 */

	public void practice1() {

		System.out.print("등급별 권환 : ");
		int level = sc.nextInt();

		switch (level) {

		case 1:
			System.out.println("관리권환"); // 1,2,3 전부 출력
		case 2:
			System.out.println("글쓰기권환");
		case 3:
			System.out.println("읽기권환");
		}
	}

	/*
	 * 월을 입력했을 때 계절을 출력
	 * 
	 * 3,4,5 : 봄 6,7,8 : 여름 9,10,11 : 가을 12,1,2 : 겨울
	 * 
	 * 월 > 5 봄
	 * 
	 * 월 > 11 가을
	 */
	public void practice2() {

		System.out.print("월 입력 : ");
		int m = sc.nextInt();

		switch (m) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");

		}
	}

	public static void main(String[] args) {
		B_Switch b = new B_Switch();

//		b.method1();

//		b.practice1();
		b.practice2();

	}
}
