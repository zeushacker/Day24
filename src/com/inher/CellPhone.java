package com.inher;

public class CellPhone {

	String model;// �𵨸�
	String number;//��ȭ��ȣ
	int chord; //ȭ��
	
	
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
		System.out.println("��ȭ�� �մϴ�.");
	}
	
}
