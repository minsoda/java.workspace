package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Application app = new Application();
//		app.method1();
		app.method2();

	}
	//TreeSet
	public void method1() {
		// size()
		TreeSet<Integer> lotto = new TreeSet<>();

		//lotto 번호 
		for(int i = 0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45) +1;
			lotto.add(num);
		}

		// 내 번호는 반복문 안에 반복문
		int count = 0;
		while(true) {
			TreeSet<Integer> myLotto = new TreeSet<>();
			
			// 내 번호가 랜덤 6개 숫자 추출
			while(myLotto.size() < 6) {
				int choose = (int)(Math.random()*45) +1;
				myLotto.add(choose);
			}
			System.out.println("로또 번호 : " + lotto);
			System.out.println("내 번호 : " + myLotto);
			count++;
			
			
			// 내 번호랑 로또 번호가 일치한지
			
			if(lotto.equals(myLotto)) {
				System.out.println("횟수 : " + count);		
				break;
			// 횟수!
			
			}
			
				
				}
			}
		




	//HashSet
	public void method2() {
		HashSet<Integer> lotto = new HashSet<>();

		//lotto 번호 
		for(int i = 0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45) +1;
			lotto.add(num);
		}
		
		List lottoList = new ArrayList(lotto); //set을 list로 할수있음.
		Collections.sort(lottoList);
		
		// 내 번호는 반복문 안에 반복문
		int count = 0;
		while(true) {
			HashSet<Integer> myLotto = new HashSet<>();
			
			// 내 번호가 랜덤 6개 숫자 추출
			while(myLotto.size() < 6) {
				int choose = (int)(Math.random()*45) +1;
				myLotto.add(choose);
			}
			
			List myLottoList = new ArrayList(myLotto);
			Collections.sort(myLottoList);
			
			System.out.println("로또 번호 : " + lottoList);
			System.out.println("내 번호 : " + myLottoList);
			count++;
			
			
			// 내 번호랑 로또 번호가 일치한지
			
			if(lottoList.equals(myLottoList)) {
				System.out.println("횟수 : " + count);		
				break;
			// 횟수!
			
			}
			
				
				}
			}
		
	}
