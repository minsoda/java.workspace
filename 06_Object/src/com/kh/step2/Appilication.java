package com.kh.step2;

import com.kh.step2.model.Card;

public class Appilication {

	public static void main(String[] args) {
		
		// 클래스 변수는 인스턴스 생성없이 호출가능!
		System.out.println(Card.width);
		System.out.println(Card.henght);
		
		System.out.println();
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 3;
		
		//클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.
		// static 붙여져서 클래스 변수로 서로 공유가 되기에 변경이 됨.
		
		c1.width = 50;
		c1.henght = 80;
		
		System.out.println("첫번째 카드는 " + c1.kind + " " + c1.number + "이며, 크기는 " + c1.width + " X " + c1.henght + " 입니다.");
		System.out.println("두번째 카드는 " + c2.kind + " " + c2.number + "이며, 크기는 " + c2.width + " X " + c2.henght + " 입니다.");
	}
}
