package com.kh.practice2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Application app = new Application();
		app.method1();

	}
	//TreeSet
	public void method1() {
		// size()
		TreeSet<Integer> lotto = new TreeSet<>();

		//lotto 번호 
		for(int i = 0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45) +1;
			lotto.add(num);
			System.out.print("로또 번호 : " + num);
		}

		// 내 번호는 반복문 안에 반복문
		int count = 0;
		while(true) {
			TreeSet<Integer> mylotto = new TreeSet<>();
			// 내 번호가 랜덤 6개 숫자 추출
			// 내 번호랑 로또 번호가 일치한지
			// 횟수!
			for(int i=0; mylotto.size()<6; i++) {
				int num2 = (int)(Math.random()*45) +1;
				lotto.add(num2);
				if(mylotto.equals(lotto)) {
					count++;
					System.out.println("횟수 : " + count);		
					break;
				}
				System.out.print("내 번호 : " + num2);
			}
		}
	}
}


	
//	public void method2() {
//	}
