package com.method.hw1.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NonStaticSample {

	public void printLottoNumbers() {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) { // ���� 6�ڱ� �̱�
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 1; j < i; j++) { // �ߺ�Ȯ���ϱ�
				if (lotto[i] == lotto[j]) {
					i--;

				}

			}

		}
		Arrays.sort(lotto); // ��������
		for (int i = 0; i < lotto.length; i++) { // ���
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	} // e.lotto

	public void outputChar(int num, char c) {

		System.out.print(c + "����" + num + "�� ��� : ");
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
		
		return str+"�� "+index1+"�� "+index2+"�� �ε��� ������ ���� ���:";*/
		
		String pick = null;
		pick = str.substring(index1,index2);
		return str+"�� "+index1+"�� "+index2+"�� �ε��� ������ ���� ���: "+pick;
		
	}

}