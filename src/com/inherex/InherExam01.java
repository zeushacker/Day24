package com.inherex;

// 자바는 단일 상속만 지원한다. 다중 상속은 지원하지 않는다.
public class InherExam01 extends SuperExam1{

	public InherExam01() {
	          System.out.println("Sub Class 클래스.........................");
	}
	
	public void circle() {
		
		int r = 10;
		super.area = (double)r * r * 3.14;
		write("원:");
	}
	
	public void rect() {
		int w =20, h = 15;
		area = (double)w * h;
		write("사각형 :");
	}
	
	
	public static void main(String[] args) {
		InherExam01 ie = new InherExam01();
		ie.circle();
		ie.rect();
	}

}
