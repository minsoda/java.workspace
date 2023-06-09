package com.kh.lambda.practice;

/*
 * 함수적 인터페이스(Functional Interface)
 * - 단 하나의 추상 메서드만 선언된 인터페이스
 * - 함수적 인터페이스를 선언할 때 @FunctionalInterface 어노테이션을 붙이면 두개 이상의 메서드가 선언되지 않도록 컴파일러가 체크
 * 
 * */
@FunctionalInterface
public interface MathInterface {

	public int calc(int a, int b);
//	public int calc2(int a, int b); 추상 메서드 두개일시 오류 
}
