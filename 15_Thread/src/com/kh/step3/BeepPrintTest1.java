package com.kh.step3;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
		
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			tool.beep(); // 경고음
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {}
		}
		
		BeepPrintThread bpt = new BeepPrintThread();
		BeepThread bt = new BeepThread();
		
		Thread bpThread = new Thread(bpt, "BeepPrintThread");
		Thread bThread = new Thread(bt, "BeepThread");
		
		bpThread.start();
		bThread.start();
		
		
		
	}
}
