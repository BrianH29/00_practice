package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() { // start p1

		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("�߸� �Է��ϼ̽��ϴ�.");
			return;

		} // end for

	} // end p1

	public void practice2() { // start p2

		while (true) { // start while
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				} // end for
				break;

			} else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.\n");

			} // end if
		} // end while

	} // end p2

	public void practice3() { // start p3

		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� :");
		int input = sc.nextInt();

		if (input >= 1) {

			for (int i = input; i >= 1; i--) { // s.for
				System.out.print(i + " ");
			} // e.for

		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}

	} // end p3

	public void practice4() { // s.p4
		while (true) {

			System.out.print("1 �̻��� ���ڸ� �Է��ϼ���:");
			int input = sc.nextInt();

			if (input >= 1) {
				for (int i = input; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;

			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.�ٽ� �Է����ּ���.");
			}

		}

	} // e.p4

	public void practice5() { // s.p5

		System.out.print("������ �Է��ϼ��� :");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1����" + num + "������ ��:" + sum);
	} // e.p5

	public void practice6() { // s.p6

		System.out.print("ù ���� ���� : ");
		int num1 = sc.nextInt();

		System.out.print("�� ���� ���� : ");
		int num2 = sc.nextInt();

		if (num1 >= 1 && num2 >= 1 && num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}

		} else if (num1 >= 1 && num2 >= 1 && num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
		}

	} // e.p6

	public void practice6a() { // s.6a
		System.out.print("ù ��° ���� : ");
		int input1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int input2 = sc.nextInt();
		int abs = Math.abs(input1 - input2);
		int sum = 0;

		if (input1 >= 1 && input2 >= 1 && input1 < input2) {
			for (int i = 0; i <= abs; i++) {
				sum = input1 + i;
				System.out.print(sum + " ");
			}
		} else if (input1 >= 1 && input2 >= 1 && input1 > input2) {
			for (int i = 0; i <= abs; i++) {
				sum = input2 + i;
				System.out.print(sum + " ");
			}
		} else {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
		}

	} // e.6a

	public void practice7() { // s.p7

		while (true) {

			System.out.print("ù ���� ���� : ");
			int num1 = sc.nextInt();

			System.out.print("�� ���� ���� : ");
			int num2 = sc.nextInt();

			if (num1 >= 1 && num2 >= 1 && num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}

				break;

			} else if (num1 >= 1 && num2 >= 1 && num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}

				break;

			} else {
				System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
			}

		}

	} // e.p7

	public void practice8() { // s.p8

		System.out.print("���� �Է��ϼ��� : ");
		int dan = sc.nextInt();

		System.out.println("===" + dan + "��===");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
		}

	} // e.p8

	public void practice9() { // s.p9

		System.out.print("���� �Է��ϼ��� : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int j = dan; j <= 9; j++) {
				System.out.println("===" + j + "��===");
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d\n", j, i, (j * i));
				}
			}
		} else {
			System.out.println("�ٸ� ���� �Է��ϼ���.");
		}
	} // e.p9

	public void practice10() { // s.p10

		while (true) {
			System.out.print("���� �Է��ϼ��� : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				for (int j = dan; j <= 9; j++) {
					System.out.println("===" + j + "��===");
					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d x %d = %d\n", j, i, (j * i));
					}
				}
				break;
				
			} else {
				System.out.println("�ٸ� ���� �Է��ϼ���.");
			}
		}

	} // e.p10
	
	public void practice11() {		//s.p11
		
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		System.out.print("���� : ");
		int gap = sc.nextInt();
		
		for(int i = 1;i<=10;i++) {
			System.out.print(num + " ");
			num +=gap;
		}
		
	}		//e.p11
	
	
	
}