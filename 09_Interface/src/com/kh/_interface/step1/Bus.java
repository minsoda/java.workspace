package com.kh._interface.step1;

public class Bus implements Vehicle{ //interface를 가져오려면 implements 사용

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	} 

}
