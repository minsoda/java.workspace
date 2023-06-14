package com.kh.step1;

public class GoThread extends Thread {

	public GoThread(String name) {
		super(name); //super에 이름을 넘긴다.
		
	}
	
	public void run() {
		
		for(int i=0; i<20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			System.out.println("CurrentThread :: " + name + ", " + i);
		}
	}
}
