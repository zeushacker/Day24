package com.inherex;

public class SubExam3  extends SuperExam3{

	protected int b = 100;
	
	public void print() {
		System.out.println("Sub print �޼ҵ� :"+super.b +":"+c);
	}
	
	@Override
	public void write() {
	    System.out.println("Sub write �޼ҵ� :"+b + " : "+c);
	}
	
}
