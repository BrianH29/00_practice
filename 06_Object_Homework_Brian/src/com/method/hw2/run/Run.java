package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {
	
	public static void main(String[] args) {
		
		NonStaticSample a = new NonStaticSample();
		
		int input = 5;
		System.out.printf("ũ�Ⱑ %d�� �迭�� ������: ",input);
		int[] arr = a.intArrayAllocation(input);
		
		 a.display(arr);
		
		 System.out.println();
		 System.out.print("�������� ��� : ");
		 a.sortDescending(arr);
		 
		 
		 System.out.println();
		 System.out.print("�������� ��� : ");
		 a.sortAscending(arr);
		System.out.println();
	}

}