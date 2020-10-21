package com.inher;

public class CellPhone {

	String model;// 모델명
	String number;//전화번호
	int chord; //화음
	
	
	public String getModel() {
		return model;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String n) {
		number = n;
	}
	public int getChord() {
		return chord;
	}
	
	public void call() {
		System.out.println("통화를 합니다.");
	}
	
}
