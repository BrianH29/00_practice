package com.kh.hw.run.controller;

import java.util.Scanner;

public class Function {

	Scanner sc = new Scanner(System.in);

	public void calculator() { // s.cal

		System.out.print("ù���� ���� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι��� ���� : ");
		int num2 = sc.nextInt();

		sc.nextLine();

		System.out.print("������ : ");
		String op = sc.nextLine();

		if (op.equals("/") && num2 == 0) {
			System.out.printf("0���� ������ �����ϴ�.\n %d %s %d = 0\n", num1, op, num2);
			return;
		}

		int result = 0;

		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 * num2;
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
		}
		System.out.printf("%d %s %d = %d", num1, op, num2, result);

	} // e.cal

	public void totalCalculator() { // s.total

		System.out.print("ù���� ���� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι��� ���� : ");
		int num2 = sc.nextInt();

		if (num1 >= 0 && num2 >= 0) { // s.if
			int max = Math.max(num1, num2);
			int min = Math.min(num1, num2);

			int sum = 0; //

			for (int i = min; i <= max; i++) { // s.for
				sum += i;
			} // e.for
			System.out.printf("%d���� %d������ �� :%d\n", min, max, sum);

		} // e.if

	} // e.total

	public void printProfile() { // s.pp
		System.out.print("name : ");
		String name = sc.nextLine();

		System.out.print("age : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("gender : ");
		String gender = sc.nextLine();

		System.out.print("personality :");
		String per = sc.nextLine();

		System.out.printf(" name: %s\n age: %d\n gender: %s\n personality: %s\n", name, age, gender, per);

	} // e.pp

	public void printScore() { // s.score
		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("�г� : ");
		int grade = sc.nextInt();

		System.out.print("�� : ");
		int cl = sc.nextInt();

		System.out.print("�� : ");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.print("���� (M/F) : ");
		char gender = sc.next().charAt(0);

		System.out.print("���� : ");
		double score = sc.nextDouble();

		String gender1 = null;

		if (gender == 'M' || gender == 'm') {
			gender1 = "���л�";
		} else if (gender == 'F' || gender == 'f') {
			gender1 = "���л�";	
		}

		String result = null;

		if (score >= 90.0) { // s.if
			result = "A";
		} else if (score >= 80.0) {
			result = "B";
		} else if (score >= 70.0) {
			result = "C";
		} else if (score >= 60.0) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.1f�̰� %s����Դϴ�", grade, cl, num, gender1, name, score, result);

	} // e.score

	public void printStarNumer() { // s.star

		System.out.print("���� : "); // ���� �� �ޱ�
		int num = sc.nextInt();

		if (num >= 0) { // ����϶�

			for (int i = 1; i <= num; i++) { // �� ��� ��
				for (int j = 1; j < i; j++) { // �� ��� ��
					// System.out.print(i);
					System.out.print("��");
				} // e.��
				System.out.println(i);
			} // e.��

		}

	} // e.star

	public void sumRandom() { // s.random

		int random = (int) (Math.random() * 100 + 1);

		int sum = 0;
		sum = +random;

		System.out.println(sum);

	} // e.random

	public void exceptGugu() { // s.gu

		System.out.print("���� : "); // ���� �� �ޱ�
		int gugu = sc.nextInt();

		if (gugu >= 0) { // ����϶� �� �ޱ�
			for (int i = 1; i <= 9; i++) { // ������ �ޱ�
				System.out.printf("%d x %d = %d\n", gugu, i, (gugu * i));
			}

		} // e.if

	} // e.gu

	public void diceGame() {

		while (true) {

			int random1 = (int) (Math.random() * 6 + 1);
			int random2 = (int) (Math.random() * 6 + 1);

			int sum = random1 + random2;

			System.out.print("�ֻ��� �ΰ��� ���� ���纸����.(1~12) : ");
			int input = sc.nextInt();

			if (input == sum) {		// �����϶�
				System.out.printf("�����Դϴ�.\n �ֻ����� �� : %d\n ", sum);
				sc.nextLine();
				
				System.out.print("����Ͻðڽ��ϱ� (Y/N) : ");
				char yn = sc.next().charAt(0); 
			
				if (yn == 'Y' || yn == 'y') {
					continue;
				} else if (yn == 'N' || yn == 'n') {
					System.out.println("�����մϴ�.");
				}
				break;
				
			} else if (input != sum) {		// Ʋ������ 
				System.out.println("Ʋ�Ƚ��ϴ�.");
				continue;
			}
		}
	}

}
