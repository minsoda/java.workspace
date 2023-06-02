package com.kh.practice1;

import java.io.IOException;

public class B_Throws {

	/*
	 * 예외처리 떠넘기기
	 * [표현법]
	 * 리터타입 메서드명(매게변수, ...)  throws 예외클래스1, 예외클래스2, ...{
	 * 
	 * }
	 * */
	
	public static void main(String[] args) {
		try {
			new B_Throws().method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {  // Exception 최상위 클래스라서 가장 아래에 입력
			e.printStackTrace();
		}
		} //static이 아닌 다른 메서드 불러올때 new사용
	
	
	public void method1() throws ClassNotFoundException, IOException { //Exception 만 작성해도 가능.
		System.out.println("method1() 호출");
		
		method2();
		
		System.out.println("method1() 종료");
	}
	
	public void method2() throws IOException, ClassNotFoundException {
		System.out.println("method2() 호출");
		
		method3();
		
		System.out.println("method2() 종료");
	
		
	}
	
	public void method3() throws IOException, ClassNotFoundException {
		System.out.println("method3() 호출");
		
		int random = (int)(Math.random() * 3 + 1 );
		
		if(random == 1) {
			throw new ClassNotFoundException();
		}else if(random == 2) {
			throw new IOException();
		}
		
		System.out.println("method3() 종료");
		
	}
}
