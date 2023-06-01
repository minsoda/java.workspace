package com.kh._interface.step3;

public class Television implements RemoteControl {
	
	private int volume;
	

	@Override
	public void turnOn() {
	System.out.println("TV를 켭니다.");
	}

	@Override
	public void thrnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void search(String url) {
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		}else if(volume < RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
