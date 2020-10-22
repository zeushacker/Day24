package com.inherexam;

import java.io.*;
public class MainClass {

	public static void main(String[] args) throws IOException{
		
		BClass bb = new BClass();
		
		bb.input();
		/*
		 * if(!bb.input()) { System.out.println("Error"); return ; }
		 */
		
		double result = bb.calc();
		
		bb.write(result);
		
	}

}
