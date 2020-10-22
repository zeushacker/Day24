package com.study;

public class Tv {  // 부모클래스

	boolean power; // 전원상태(on/off)
	int channel; // 채널
	
	// 부모클래스의 메소드
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}
