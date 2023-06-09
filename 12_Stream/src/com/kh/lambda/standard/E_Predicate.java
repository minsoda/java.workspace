package com.kh.lambda.standard;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.kh.model.Student;

public class E_Predicate {

	/*
	 * Predicate
	 * - Predicate 함수적 인터페이스는 매개변수의 boolean 값을 리턴하는 testXXX() 추상 메서드를 가지고 있다.
	 * - testXXX() 추상 메서드는 매개값을 조사해서 true/false를 리턴하는 역할을 한다.
	 * 
	 * */
	public static void main(String[] args) {

	Student student1 = new Student("구민지", 20, "여자", 80, 70);
	Student student2 = new Student("윤종빈", 16, "남자", 100, 90);
	
		
		E_Predicate e = new E_Predicate();
//		e.method1(student2);
//		e.method2(student1, student2);
		e.method3();
		
		
	}

	//Predicate<T> : 객체 T를 조사
	public void method1(Student student) {
		Predicate<Student> pre = stu -> stu.getGender().equals("남자");
		System.out.println(student.getName() + "은 남자입니까?" + pre.equals(student));
	}
	
	//BiPredicate<T,U> : 객체 T와 U를 비교 조사
	public void method2(Student student1, Student student2) {
		BiPredicate<Student, Student> bp = (s1, s2) -> s1.getGender().equals(s2.getGender());
	System.out.println("두 학생의 성별이 동일한가? : " + bp.test(student1, student2));
	
	}
	
	//IntPredicate : int 값을 조사
	public void method3() {
		IntPredicate ip = i -> i > 100;
		System.out.println(ip.test(90));
		System.out.println(ip.test(101));
	}
	
}
