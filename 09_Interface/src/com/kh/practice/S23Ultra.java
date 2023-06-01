package com.kh.practice;

public class S23Ultra extends SmartPhone implements Pen{

	String name = "S23 Ultra";
	String brand = "Samsung";
	
	public S23Ultra() {
		
	}

	public void printInformation() {
		super.printInformation(name, brand);
		System.out.println("펜 탑재 여부 : " + pen());
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public boolean pen() {
		return true;
	}

	@Override
	public String picture() {
		return "2억 화소 카메라";
	}
}
