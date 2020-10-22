package com.study;

public class CaptionTvExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTV ctv = new CaptionTV();
		ctv.channel =23; // 부모클래스로 부터 상속받은 멤버 변수
		ctv.channelUp();// 부모 클래스로 부터 상속받은 멤버 메소드
		
		System.out.println(ctv.channel);
		ctv.displayCaption("이 채널은 연합 뉴스 채널 입니다.....");
		ctv.caption = true;
		ctv.displayCaption("이 채널은 연합 뉴스 채널 입니다.....");
		
	}

}
