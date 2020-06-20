package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {

		int[] arr = new int[10]; // 10�� ���� �迭

		for (int i = 0; i < arr.length; i++) { // i=0 ~ �迭 ���� , i����
			// Arrays.sort(arr);
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}// e.p1

	public void practice2() {

		int[] arr1 = new int[10]; // 10�� ������ �迭

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 10 - i;
			System.out.print(arr1[i] + " ");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : "); // �Է�
		int num = sc.nextInt(); // num = �迭����

		int[] arr = new int[num]; // �迭 ����

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 1�� ����
			System.out.print(arr[i] + " ");

		}

	}

	public void practice4() {

		String[] fruit = { "���", "��", "����", "������", "����" };
		System.out.print(fruit[1]);

	} // e.p4

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();

		System.out.print("���� : ");
		char str1 = sc.nextLine().charAt(0);

		char[] search = new char[str.length()];
		int sum = 0;

		for (int i = 0; i < search.length; i++) {
			search[i] = str.charAt(i);
			if (search[i] == str1) {
				sum += 1;

			}
		} // e.for
		System.out.printf("%s�� %c�� �����ϴ� ��ġ(�ε���) :", str, str1);
		for (int i = 0; i < search.length; i++) {
			if (search[i] == str1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.printf("%c�� ���� : %d", str1, sum);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		String[] day = { "������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���" };

		System.out.print("0~6 ���� ���� �Է�: ");
		int num = sc.nextInt();

		if (num <= 6) {
			System.out.print(day[num]);
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}

	}

	public void practice7() { // s.p7
		Scanner sc = new Scanner(System.in);

		System.out.print("����: "); // ���� �Է� �ޱ�
		int num = sc.nextInt();
		sc.nextLine();

		int[] arr = new int[num]; // �Է� ���� ������ �迭���̷� ����

		for (int i = 0; i < arr.length; i++) { // �迭���� �Ƿ� �Է¹ޱ�
			System.out.printf("�迭 %d���� �ε����� ���� �� : ", i);
			int input = sc.nextInt();
			arr[i] = input; // �迭�� ������༭ �Էµ� ���ڸ� �־�α�

		}

		for (int i = 0; i < arr.length; i++) { // �迭�� �Էµ� ���ڸ� �����ϱ� ����
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("�� : " + sum);

	}// e.p7

	public void practice8() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("����: ");
			int num = sc.nextInt();

			int[] arr = new int[num];
			int input = 0;

			if (num % 2 == 1 && num >= 3) { // Ȧ���̸鼭 3�̻��ϋ�
				for (int i = 0; i < arr.length; i++) { // �迭 ����

					if (i <= arr.length / 2) {
						arr[i] = ++input;
					} else {
						arr[i] = --input;
					} // e.if

					System.out.print(arr[i] + " ");
				} // e.for

			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			break;
		}
	} // e.p8

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.println("ġŲ �̸��� �Է��ϼ���: ");
		String menu = sc.nextLine();

		String[] chicken = { "���", "�Ķ��̵�", "���ð���", "����ĺ�" };

		for (int i = 0; i < chicken.length; i++) {

			if (menu.equals(chicken[i])) {
				System.out.println(menu + "ġŲ��ް���.");
				return;
			}

		}
		System.out.println(menu + "ġŲ�� ���� �޴��Դϴ�.");

	} // e.p9

	public void practice10() { // s.p10

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}// e.p10

	public void practice11() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");

		} // e.for

		System.out.println();
		int min = arr[0]; // min ���� max ���� �񱳸� ���� �ʱⰪ 0�� �ƴ�, "0����"�� ���Ѵ�.
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}

		} // e.for
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
	} // e.p11

	public void practice12() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) { // �̰� �ϳ� ������ .. �� �ƿ�
			System.out.print(arr[i] + " ");
		}

	}

	public void practice13() {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ (-����) : ");
		String id = sc.nextLine(); // �ֹι�ȣ �Է� �ޱ�

		char[] num = new char[id.length()]; // �迭�� �ֱ�
		
		for (int i = 0; i < num.length; i++) {
			num[i] = id.charAt(i);
		}

		char[] copy = Arrays.copyOf(num, id.length());	// char[] copy = origin; (���� ����)
		// char[] copy = new char[num.length];
		
		for (int i = 8; i < copy.length; i++) {
			copy[i] = '*';
		}

		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}

	}

	public void practice14() {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;

				}
			}
		}
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

	public void practice15() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
			int input = sc.nextInt();

			sc.nextLine();
			//int[] insert = new int[input];
			String[] result = new String[input];

			for (int i = 1; i < result.length + 1; i++) {
				System.out.printf("%d���� ���ڿ� : ", i);
				result[i] = sc.nextLine();

			}
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char yn = sc.nextLine().charAt(0);

			if (yn == 'Y' || yn == 'y') {
				continue;
			} else if (yn == 'N' || yn == 'n') {
				
			}
			
			for(int i =1; i<result.length+1;i++) {
				//String[] copy = Arrays.copyOf(result, i<insert.length);
				
			}
			break;
		}
	}
	public void practice15A() {
		//1. ����ڿ��� �迭�� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		//2.����ڰ� �Է��� ����ŭ�� ũ���� �迭 ����
		String[] arr = new String[size];
		
		//3. �� �ε����� ����ϰ����ϴ� ���ڿ��� ����ڿ��� �Է¹��� �� �ش� �ε����� �� ����(�ʱ�ȭ)
		for(int i=0;i<arr.length;i++) {
			System.out.print((i + 1)+"��° ���ڿ�: ");
			arr[i] = sc.nextLine();
		}
		
		// �ݺ������� ����ڿ��� �� ���� �Է¹��� ���� ��� �Ŀ� y���� n���� �Ǻ��ϴ� �ݺ���
		while(true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N): ");
			char ch = sc.nextLine().charAt(0);
			
			// ����ڰ� �Է��� ���ڰ� y���� n���� �Ǻ�
			if(ch == 'y' || ch == 'Y') {	// �� ���� �Է��ϰڴٴ� �ǻ�
				
				// �߰��� � �� �Է��ϰ� ������ ���� �Է¹ޱ�
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				// �����迭�� ũ�� + addSize ��ŭ�� ���ο� �迭 ����� 
				String[] newArr = new String[arr.length + addSize];
				
				//newArr[0] = arr[0];
				//newArr[1] = arr[1];
				//newArr[2] = arr[2];	���� �迭�� �����ߴ� ���� �Ű� ���� �� �� �Ŀ��� �߰������� �Է¹��� �� ���
				//newArr[3] = ����ڿ��� �Է¹��� ��;
				//newArr[4] = ����ڿ��� �Է¹��� ��; 
				for(int i=0; i<newArr.length; i++) {
					
					if(i<=arr.length-1) {
						newArr[i] = arr[i];
					}else {
						System.out.print(i+1+"���ڿ�: ");
						newArr[i] = sc.nextLine();
					}
					
				}
			
					arr = newArr;
			}else {	// �� �̻� �Է����� �ʰڴٴ� �ǻ����---> �ݺ��� ���������Բ�
				
				break; 
			}
			
		}
		// ���������� arr�̶�� �迭�� ��� �� ���
		System.out.print(Arrays.toString(arr));
		
	}
	
	
	
	
	
}