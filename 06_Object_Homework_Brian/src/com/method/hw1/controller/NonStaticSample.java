package com.method.hw1.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NonStaticSample {

	public void printLottoNumbers() {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) { // 랜덤 6자기 뽑기
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 1; j < i; j++) { // 중복확인하기
				if (lotto[i] == lotto[j]) {
					i--;

				}

			}

		}
		Arrays.sort(lotto); // 오름차순
		for (int i = 0; i < lotto.length; i++) { // 출력
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	} // e.lotto

	public void outputChar(int num, char c) {

		System.out.print(c + "문자" + num + "개 출력 : ");
		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");

		}
		System.out.println();
	}

	public char alphabet() {
		Random rnd = new Random();

		char rndc = ((char) (int) (rnd.nextInt(58) + 65));
		
		if (rndc >= 97 && rndc <= 122) {

		} else if (rndc >= 65 && rndc <= 90) {

		}

		return rndc;

	}

	public String mySubstring(String str, int index1, int index2) {
		
		/*char[] ch = new char[str.length()];
		
		for(int i=index1;i<index2;i++) {
			ch[i] = str.charAt(i);
		}
		for(int i=index1;i<index2;i++) {
			System.out.print(ch[i] + " ");
		}
		
		return str+"의 "+index1+"번 "+index2+"번 인덱스 사이의 값을 출려:";*/
		
		String pick = null;
		pick = str.substring(index1,index2);
		return str+"의 "+index1+"번 "+index2+"번 인덱스 사이의 값을 출려: "+pick;
		
	}

}
