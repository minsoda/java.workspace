package com.kh._interface;

import com.kh._interface.step1.Bus;
import com.kh._interface.step1.Taxi;
import com.kh._interface.step1.Vehicle;
import com.kh._interface.step2.Advanced;
import com.kh._interface.step2.Beginner;
import com.kh._interface.step2.Player;
import com.kh._interface.step2.Super;
import com.kh._interface.step3.Audio;
import com.kh._interface.step3.Television;

/*
 * 추상 클래스 : 미완성 설계도
 * 인터페이스 : 기본 설계도
 * 
 * 
 * */


public class Application {

	public static void main(String[] args) {

//		Vehicle v = new Vehicle(); // 인터페이스 객체 생성 x
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
	
		bus.run();
		taxi.run();
	
		
		 Player[] player = {new Beginner(), new Advanced(), new Super()};
		 
		 for(Player players : player) {
			 players.showLevelMessage();
			 players.run();
			 players.jump();
			 players.turn();
		 }
		 
		 System.out.println();
		 
		 Television tv = new Television();
		 tv.turnOn();
		 tv.setVolume(-1);
		 tv.thrnOff();
		 
		 Audio audio = new Audio();
		 audio.turnOn();
		 audio.setVolume(20);
		 audio.thrnOff();
		 }

}
