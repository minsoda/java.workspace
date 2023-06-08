package com.kh.map;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class B_Properties {

	/*
	 * Properties
	 * - HashMap 구버전인 Hashtable(Object, Object)을 상속받아 구현한 것
	 * - Properties는 (String, String) 형태로 단순화된 컬렉션 클래스
	 * - 주로 환경설정과 관련된 속성(property)를 저장하는데 사용
	 * */
	
	public static void main(String[] args) {
		B_Properties b = new B_Properties();
//		b.method1();
		b.method2();
	}



	public void method1() {
		Properties prop = System.getProperties();
		
		//prop에 저장된 요소들을 Enumeration을 이용해서 출력
		//컬렉션 프레임워크 이전 구버전이므로 Iterator가 아닌 Enumeration
	Enumeration en = prop.propertyNames();
	
	while(en.hasMoreElements()) {
		String key = (String)en.nextElement(); //key값을 가지고 있어서 형변환
		String value = prop.getProperty(key); 
		System.out.println(key + " : " + value);
		
	}
	}
	
	public void method2() {
		Properties prop = new Properties();
		
		//순서 유지x, 키값 중복x
		//prop에 키와 값(key, value) 저장
		prop.setProperty("List", "ArrayLis");
		prop.setProperty("Set","HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop);//map은 마지막 입력한 부분 출력
		
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("Stack", "값이 없음."));// null 대신 출력값 가능
		
		Set<Entry<Object, Object>>entrySet = prop.entrySet();
		Iterator<Entry<Object, Object>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			Entry<Object, Object> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
