package com.inherexam;

import java.io.*;
import java.util.Scanner;
public class BClass extends AClass{

	// 데이터 입력 (메소드 정의)
	//boolean input() throws IOException {
		void input() throws IOException {
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 */
		Scanner sc = new Scanner(System.in);
		
		
	
		System.out.print("임의의 두 정수 입력(공백 구분):");
		//String temp = br.readLine(); // 20, 15
		String str = sc.nextLine(); // 20 15
		
		/*
		 * String[] str = temp.split("\\s");// {"20", "15"}
		 */
		
		str  = str.replaceAll("\\s", ",");
		System.out.print("연산자 입력[+ - * /] :");
	    ch = sc.nextLine();
		ch = ch.trim();
		
		/*
		 * if(str.length != 2) return false;
		 */	
		String su[] = str.split(",");
		
		x = Integer.parseInt(su[0]);
		y = Integer.parseInt(su[1]);
		
		
		//ch = (char)System.in.read();
		
		/*
		 * if(ch =="+" || ch =="-" || ch =="*" || ch =="/" ) return true;
		 * 
		 * return false;
		 */
	}
	
	// 연산처리
	double calc () {
		double result =0;
		
		/*
		 * switch(ch) {
		 * 
		 * case '+': result = x + y; break; case '-': result = x - y; break; case '*':
		 * result = x * y; break; case '/': result = (double)x / y; break;
		 * 
		 * }
		 */
		
		if(ch.equals("+")) {
			result  = (double) x + y;
		}else if(ch.equals("-")) {
			result  = (double) x - y;
		}else if(ch.equals("*")) {
			result  = (double) x * y;
		}else if(ch.equals("/")) {
			result  = (double) x / y;
		}
		return result;
	}

}
