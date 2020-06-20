package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {
	
	public static void main(String[] args) {
		
		NonStaticSample a = new NonStaticSample();
		
		int input = 5;
		System.out.printf("크기가 %d인 배열의 랜덤값: ",input);
		int[] arr = a.intArrayAllocation(input);
		
		 a.display(arr);
		
		 System.out.println();
		 System.out.print("내림차순 출력 : ");
		 a.sortDescending(arr);
		 
		 
		 System.out.println();
		 System.out.print("오름차순 출력 : ");
		 a.sortAscending(arr);
		System.out.println();
	}

}
