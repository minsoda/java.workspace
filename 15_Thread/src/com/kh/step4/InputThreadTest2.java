package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest2 {

	boolean inputCheck = false;
	
	public static void main(String[] args) {
		
		InputThreadTest2 process = new InputThreadTest2();
		
		Thread t = new Thread(new CountThread(process));
		Thread tt = new Thread(new InThread(process));
		
		t.start();
		tt.start();
	}

}

class InThread implements Runnable{ // public은 클래스에 하나만 있어야해연

	InputThreadTest2 process;
	
	InThread(InputThreadTest2 process){
	this.process = process;
	
	}
	
	@Override
	public void run() {
	
	
	// 1. 데이터 입력
	String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요...");
	
	System.out.println("입력하신 숫자는 " + input + " 입니다.");
	
	process.inputCheck = true;
	
	
}
}


class CountThread implements Runnable {

	InputThreadTest2 process;
	CountThread(InputThreadTest2 process){
		this.process = process;
	}
	
	
	@Override
	public void run() {
	
	
	// 2. 카운팅 작업
	for(int i=10; i>0; i--) {
		try {
			if(process.inputCheck) break; // 입력값이 들어올경우 멈춤
			System.out.println(i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
	if(!process.inputCheck) {
		System.out.println("시간초과");
		System.exit(0);
	}
}
	
}