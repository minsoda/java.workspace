package com.kh._abstract.step1;

public class BasketBall extends Sports {

	public BasketBall(int numberofPlayers) {
		super(numberofPlayers);
	}

	@Override
	public void rule() { // 무조건 Override 가지고 있어야함.
		
		System.out.println("BasketBall의 선수의 수는 " + this.numberofPlayers + "명, 공을 던져서 링에 넣어야한다.");
	}

}
