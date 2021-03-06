package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {

		int[] arr = new int[10]; // 10인 정수 배열

		for (int i = 0; i < arr.length; i++) { // i=0 ~ 배열 길이 , i증가
			// Arrays.sort(arr);
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}// e.p1

	public void practice2() {

		int[] arr1 = new int[10]; // 10인 정수형 배열

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 10 - i;
			System.out.print(arr1[i] + " ");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : "); // 입력
		int num = sc.nextInt(); // num = 배열길이

		int[] arr = new int[num]; // 배열 생성

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 1씩 증가
			System.out.print(arr[i] + " ");

		}

	}

	public void practice4() {

		String[] fruit = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.print(fruit[1]);

	} // e.p4

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char str1 = sc.nextLine().charAt(0);

		char[] search = new char[str.length()];
		int sum = 0;

		for (int i = 0; i < search.length; i++) {
			search[i] = str.charAt(i);
			if (search[i] == str1) {
				sum += 1;

			}
		} // e.for
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) :", str, str1);
		for (int i = 0; i < search.length; i++) {
			if (search[i] == str1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.printf("%c의 개수 : %d", str1, sum);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		String[] day = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		System.out.print("0~6 사이 숫자 입력: ");
		int num = sc.nextInt();

		if (num <= 6) {
			System.out.print(day[num]);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

	}

	public void practice7() { // s.p7
		Scanner sc = new Scanner(System.in);

		System.out.print("정수: "); // 정수 입력 받기
		int num = sc.nextInt();
		sc.nextLine();

		int[] arr = new int[num]; // 입력 받은 정수를 배열길이로 선언

		for (int i = 0; i < arr.length; i++) { // 배열길이 되로 입력받기
			System.out.printf("배열 %d번쨰 인덱스에 넣을 값 : ", i);
			int input = sc.nextInt();
			arr[i] = input; // 배열을 만들어줘서 입력된 숫자를 넣어두기

		}

		for (int i = 0; i < arr.length; i++) { // 배열에 입력된 숫자를 나열하기 위해
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합 : " + sum);

	}// e.p7

	public void practice8() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수: ");
			int num = sc.nextInt();

			int[] arr = new int[num];
			int input = 0;

			if (num % 2 == 1 && num >= 3) { // 홀수이면서 3이상일떄
				for (int i = 0; i < arr.length; i++) { // 배열 선언

					if (i <= arr.length / 2) {
						arr[i] = ++input;
					} else {
						arr[i] = --input;
					} // e.if

					System.out.print(arr[i] + " ");
				} // e.for

			} else {
				System.out.println("다시 입력하세요.");
				continue;
			}
			break;
		}
	} // e.p8

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력하세요: ");
		String menu = sc.nextLine();

		String[] chicken = { "양념", "후라이드", "마늘간장", "허니컴보" };

		for (int i = 0; i < chicken.length; i++) {

			if (menu.equals(chicken[i])) {
				System.out.println(menu + "치킨배달가능.");
				return;
			}

		}
		System.out.println(menu + "치킨은 없는 메뉴입니다.");

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
		int min = arr[0]; // min 값과 max 값의 비교를 위해 초기값 0이 아닌, "0번방"과 비교한다.
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}

		} // e.for
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
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
		for (int i = 0; i < arr.length; i++) { // 이거 하나 떄문에 .. 쩝 아오
			System.out.print(arr[i] + " ");
		}

	}

	public void practice13() {

		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 (-포함) : ");
		String id = sc.nextLine(); // 주민번호 입력 받기

		char[] num = new char[id.length()]; // 배열로 넣기
		
		for (int i = 0; i < num.length; i++) {
			num[i] = id.charAt(i);
		}

		char[] copy = Arrays.copyOf(num, id.length());	// char[] copy = origin; (얕은 복사)
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
			System.out.print("배열의 크기를 입력하세요 : ");
			int input = sc.nextInt();

			sc.nextLine();
			//int[] insert = new int[input];
			String[] result = new String[input];

			for (int i = 1; i < result.length + 1; i++) {
				System.out.printf("%d번쨰 문자열 : ", i);
				result[i] = sc.nextLine();

			}
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
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
		//1. 사용자에게 배열의 길이 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		//2.사용자가 입력한 수만큼의 크기인 배열 생성
		String[] arr = new String[size];
		
		//3. 각 인덱스별 기록하고자하는 문자열을 사용자에게 입력받은 후 해당 인덱스에 값 대입(초기화)
		for(int i=0;i<arr.length;i++) {
			System.out.print((i + 1)+"번째 문자열: ");
			arr[i] = sc.nextLine();
		}
		
		// 반복적으로 사용자에게 더 값을 입력받을 건지 물어본 후에 y인지 n인지 판별하는 반복문
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
			char ch = sc.nextLine().charAt(0);
			
			// 사용자가 입력한 문자가 y인지 n인지 판별
			if(ch == 'y' || ch == 'Y') {	// 더 값을 입력하겠다는 의사
				
				// 추가로 몇개 더 입력하고 싶은지 개수 입력받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				// 기존배열의 크기 + addSize 만큼의 새로운 배열 만들기 
				String[] newArr = new String[arr.length + addSize];
				
				//newArr[0] = arr[0];
				//newArr[1] = arr[1];
				//newArr[2] = arr[2];	기존 배열에 존재했던 값을 옮겨 담은 후 그 후에는 추가적으로 입력받은 값 기록
				//newArr[3] = 사용자에게 입력받은 값;
				//newArr[4] = 사용자에게 입력받은 값; 
				for(int i=0; i<newArr.length; i++) {
					
					if(i<=arr.length-1) {
						newArr[i] = arr[i];
					}else {
						System.out.print(i+1+"문자열: ");
						newArr[i] = sc.nextLine();
					}
					
				}
			
					arr = newArr;
			}else {	// 더 이상 입력하지 않겠다는 의사밝힘---> 반복문 빠져나가게끔
				
				break; 
			}
			
		}
		// 최종적으로 arr이라는 배열에 담긴 값 출력
		System.out.print(Arrays.toString(arr));
		
	}
	
	
	
	
	
}