package com.inherex;

// �ڹٴ� ���� ��Ӹ� �����Ѵ�. ���� ����� �������� �ʴ´�.
public class InherExam01 extends SuperExam1{

	public InherExam01() {
	          System.out.println("Sub Class Ŭ����.........................");
	}
	
	public void circle() {
		
		int r = 10;
		super.area = (double)r * r * 3.14;
		write("��:");
	}
	
	public void rect() {
		int w =20, h = 15;
		area = (double)w * h;
		write("�簢�� :");
	}
	
	
	public static void main(String[] args) {
		InherExam01 ie = new InherExam01();
		ie.circle();
		ie.rect();
	}

}
