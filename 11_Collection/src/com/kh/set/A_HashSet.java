package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.set.model.Person;

/*
 * 
 * Set의 특징
 * - 중복 없음
 * - 순서 없음
 * 
 * HashSet
 * - Set 인터페이스를 구현한 대표적인 컬렉션 클래스
 * */

public class A_HashSet {

	private static final String Iterator = null;

	public static void main(String[] args) {

		A_HashSet hs = new A_HashSet();
//		hs.method1();
		hs.method2();
	}
	
	public void method1() {
		Set<String> set = new HashSet<>();
		
		set.add("마동석");
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set); //중복은 없지만 순서가 없음
		System.out.println(set.size());
		System.out.println(set.contains("마동석")); //"마동석" 있니?
		
		set.remove("아오키 무네타카");
		System.out.println(set);
		
		set.clear();
		System.out.println("비었는지? "+ set.isEmpty());
		System.out.println(set);
		
		
	}
	
	public void method2() {
	
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		
		/*
		 * 객체의 주소값을 가지고 비교하기 때문에 모두 다른 객체로 인식해서 중복 제거 되지 않음.
		 * // 객체 생성시 주소값이 다르기때문에 중복체크가 안되어서 따로 해줘야함
		 * ----> Person 클래스에서 hashCode(), equals() 메서드 재정의
		 * */
		
		System.out.println(set); 
		System.out.println(set.size());
		
		/*
		 * Iterator
		 * - 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
		 * - iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
		 * */
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) { // 읽어올 요수가 있는지 확인
			System.out.println(it.next()); //Person.. 다음 요소를 읽어옴
		}
		
	}

}
