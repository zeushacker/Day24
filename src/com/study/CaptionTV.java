package com.study;

public class CaptionTV extends Tv{

	boolean caption; // ĸ�ǻ���(on/off)
	
	void displayCaption(String text) {
		if(caption) { // ĸ���� ���°� on(true) �϶��� text�� ������
			System.out.println(text);
		}
	}
}
