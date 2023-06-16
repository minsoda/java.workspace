package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

public class SnackController {

	// 멤버변수 -> 보통 모델로 만들어놓은 클래스!
	Snack snack = new Snack();
	
	// 생성자
//	public SnackController() {}
	
	// 메서드
	// 데이터를 setter를 이용해 저장하고 저장되었다는 결과를 반환하는 메서드
	public boolean saveDate(Snack viewSnack) {
		
		// snack은 controller에서 만든 임시 데이터 창고
		// viewSnack은 Application에서 데이터를 담은 임시 데이터 창고
		String kind = viewSnack.getKind();
		// == snack.setKind(viewSnack.getKind());
		
		snack.setName(viewSnack.getName());
		snack.setFlavor(viewSnack.getFlavor());
		snack.setNumOf(viewSnack.getNumOf());
		snack.setPrice(viewSnack.getPrice());
		
		return true;
	}
	
	// controller에 저장된 데이터를 반환하는 메서드
		public Snack confirmDate() {
			return snack; //this.snack 해도 같음. 변수명이 달라서 this.처리 안함.
			
		}
}
