package com.inherex;

public class SuperExam1 {

	protected double area;
	
	// protected : 하위클래스, 동일 패키지에서만 접근이 가능하다.
	// private : 하위 클래스에서도 접근 불가(클래스 내에서만 사용가능)
	
	public SuperExam1() {
	
		System.out.println("Super Class 클래스...................");
	}
	
	 public void write(String title) {
		 System.out.println(title+area);
	 }
	 
}
