package com.study;

public class CaptionTvExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTV ctv = new CaptionTV();
		ctv.channel =23; // �θ�Ŭ������ ���� ��ӹ��� ��� ����
		ctv.channelUp();// �θ� Ŭ������ ���� ��ӹ��� ��� �޼ҵ�
		
		System.out.println(ctv.channel);
		ctv.displayCaption("�� ä���� ���� ���� ä�� �Դϴ�.....");
		ctv.caption = true;
		ctv.displayCaption("�� ä���� ���� ���� ä�� �Դϴ�.....");
		
	}

}
