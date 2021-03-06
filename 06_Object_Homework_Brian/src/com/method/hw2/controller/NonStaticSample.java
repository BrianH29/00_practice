package com.method.hw2.controller;

import java.util.Arrays;
import java.util.Collections;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {

		int[] arr1 = new int[length];
		for (int i = 0; i < length; i++) {
			arr1[i] = (int) (Math.random() * 100 + 1);

		}

		return arr1;
	}

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void swap(int[] arr, int idx1, int idx2) {
		int temp = 0;
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;

	}

	public void sortDescending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; i<j; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;
					swap(arr, i, j);
				}
			}
		}
		display(arr);
	}

	public void sortAscending(int[] arr) {
		Arrays.sort(arr);
		display(arr);
	}

	public int countChar(String str, char c) {

		return;
	}

}
