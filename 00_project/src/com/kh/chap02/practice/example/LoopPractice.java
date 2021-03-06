package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() { // start p1

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("잘못 입력하셨습니다.");
			return;

		} // end for

	} // end p1

	public void practice2() { // start p2

		while (true) { // start while
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				} // end for
				break;

			} else {
				System.out.print("잘못 입력하셨습니다. 다시입력해주세요.\n");

			} // end if
		} // end while

	} // end p2

	public void practice3() { // start p3

		System.out.print("1 이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();

		if (input >= 1) {

			for (int i = input; i >= 1; i--) { // s.for
				System.out.print(i + " ");
			} // e.for

		} else {
			System.out.println("잘못입력하셨습니다.");
		}

	} // end p3

	public void practice4() { // s.p4
		while (true) {

			System.out.print("1 이상의 숫자를 입력하세요:");
			int input = sc.nextInt();

			if (input >= 1) {
				for (int i = input; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;

			} else {
				System.out.println("잘못입력하셨습니다.다시 입력해주세요.");
			}

		}

	} // e.p4

	public void practice5() { // s.p5

		System.out.print("정수를 입력하세요 :");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터" + num + "까지의 합:" + sum);
	} // e.p5

	public void practice6() { // s.p6

		System.out.print("첫 번쨰 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번쨰 숫자 : ");
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
			System.out.println("1 이상의 숫자를 입력하세요.");
		}

	} // e.p6

	public void practice6a() { // s.6a
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
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
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}

	} // e.6a

	public void practice7() { // s.p7

		while (true) {

			System.out.print("첫 번쨰 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번쨰 숫자 : ");
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
				System.out.println("1 이상의 숫자를 입력하세요.");
			}

		}

	} // e.p7

	public void practice8() { // s.p8

		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();

		System.out.println("===" + dan + "단===");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
		}

	} // e.p8

	public void practice9() { // s.p9

		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int j = dan; j <= 9; j++) {
				System.out.println("===" + j + "단===");
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d\n", j, i, (j * i));
				}
			}
		} else {
			System.out.println("다른 값을 입력하세요.");
		}
	} // e.p9

	public void practice10() { // s.p10

		while (true) {
			System.out.print("단을 입력하세요 : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				for (int j = dan; j <= 9; j++) {
					System.out.println("===" + j + "단===");
					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d x %d = %d\n", j, i, (j * i));
					}
				}
				break;
				
			} else {
				System.out.println("다른 값을 입력하세요.");
			}
		}

	} // e.p10
	
	public void practice11() {		//s.p11
		
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int gap = sc.nextInt();
		
		for(int i = 1;i<=10;i++) {
			System.out.print(num + " ");
			num +=gap;
		}
		
	}		//e.p11
	
	
	
}
