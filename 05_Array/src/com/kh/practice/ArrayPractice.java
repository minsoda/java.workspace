package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
		
	
		ArrayPractice ap = new ArrayPractice();
//		ap.method1();
//		ap.method2();
		ap.method3();
//		ap.method4();
//		ap.method5();
	}

	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		String[][] a = {{"바나나"}, {"딸기"}, {"키위"}, {"복숭아"}, {"사과"}};
		String b = "바나나";
		
		for(int i=0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				[i][j]++;
		}
			for(String[] i : a) {
				for(String j : i) {
					System.out.println(Arrays.toString(i));
					
				}
			}
		}
	


	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int a = sc.nextInt();
		
		int[] b = new int[a];
		int sum = 0;
		for(int i=0; i<b.length; i++) {
			System.out.print("배열 " + i + "번째 " + "인덱스에 넣을 값 : ");
			b[i] = sc.nextInt();
			sum += b[i];
		
		}	System.out.println(Arrays.toString(b));
		System.out.println(sum);
		}

	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		Scanner sc = new Scanner(System.in);
		String menu [][] = {{"치킨"}, {"맥주"}};
		
		System.out.println("메뉴를 입력하세요 : ");
		String a = sc.nextLine();
	
		if( ) {
			for(int i=0; i < a.length(); i++)
			System.out.println("배달 가능");
			}else 
				System.out.println("배달 불가능");
		}
	}
}
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호  : ");
		int a [] = []
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어 입력 : ");
		
		
	}
	
}
