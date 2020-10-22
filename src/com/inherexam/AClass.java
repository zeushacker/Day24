package com.inherexam;

public class AClass {

	protected int x, y;
	protected String ch;
	
	public AClass() {
	
	}
	
	public void write(double result) {
		//System.out.printf("%d %c %d = %.2f\n", x, ch, y, result);
		System.out.printf("%d %s %d = %.2f\n", x, ch, y, result);
	}
	
}
