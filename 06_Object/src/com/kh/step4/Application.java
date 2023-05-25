package com.kh.step4;

import com.kh.step4.model.Car;

public class Application {

	 public static void main(String[] args) {
		
		 Car c = new Car();
		 
		 /* public 일 경우 가능
		 c.color = "white";
		 c.gearType = "auto";
		 c.door = 4;
		 */
		 
		 Car c1 = new Car("Whire", "auto", 4);
		 Car c2 = new Car("Blak", "maual");
		 
		 System.out.println(c1);
		 System.out.println(c2);
		 
//		 System.out.print();
	}
	 
	 /*
	  * 오버로딩 : 한 클래스 내에 동일한 이름의 메소드를 매개변수의 자료형과 갯수, 순서가 다르게 작성되어야 함
	  * ex)print
	  * */
	 void test() {}
//	 void test() {} 같아서 안됨!
	 void test(int a) {}
	 void test(int a, String s) {}
	 void test(String s, int a) {}
	 void test(int a, int b) {}
//	 void test(int c, int d) {} 매개변수의 자료형의 갯수와 순서가 다르게 작성되어야함.
	 void test(String s) {}

}
