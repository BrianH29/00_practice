package com.method.hw1.run;

import com.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample a = new NonStaticSample();
		a.printLottoNumbers();
		
		a.outputChar(5,'a');
		
		//a.alphabet();
		System.out.println("���� ������ ���: " + a.alphabet());
		
		//a.mySubstring("apple", 2, 4);
		System.out.println(a.mySubstring("apple", 2, 4));
		
	}
}
