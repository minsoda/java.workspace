package com.kh._abstract.step1;

public abstract class Sports {

	protected int numberofPlayers; //참여하는 사람의 수

	public Sports(int numberofPlayers) {
		this.numberofPlayers = numberofPlayers;
	}
	
	/*
	추상매서드
	- 중괄호({})가 구성되지 않은 상태
	- 미완성된 추상 매서드가 있다는 이야기는 이 클래스 또한 미완성 상태
	- 즉, 해당 클래스로 객체를 생성할 수 없다.
	- 자식 클래스에서 무조건 재정의! 재정의 하지 않으면 에러!
	*/
	public abstract void rule(); //중괄호 빼고 abstract 로 추상매소드 만듬, 클래스에도 입력
	
	
}
