package com.study;

public class Tv {  // �θ�Ŭ����

	boolean power; // ��������(on/off)
	int channel; // ä��
	
	// �θ�Ŭ������ �޼ҵ�
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}
