package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice2 {

	Scanner sc = new Scanner(System.in);

	public void example1() { // s.e1

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {

					System.out.print(i + " ");
				}
				break;

			} else {
				System.out.println("잘못입력하셨습니다: ");

			}

		}

	} // e.e1

	public void example2() {

		while (true) { // s,while
			System.out.print("1이상의 숫자를 입력하세요: ");
			int input = sc.nextInt();

			if (input > 1) {
				for (int i = input; i >= 1; i--) { // s.for
					System.out.print(i + " ");
				} // e.for
				break;

			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요:");
			} // e.ifelse

		} // e.while

	} // e.e2

	public void example3() { // s.e3

		System.out.print("정수를 하나 입력하세요 : ");
		int num1 = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num1; i++) {
			sum += i;
			
			if(i < num1) { // i에 담긴 값이 num값 미만일 때 까지는 + 붙여서 출력 
				System.out.print(i + " + ");
				
			}else {	// 단 i에 담긴 값이 num값과 일치해지는 순간 = 붙여서 마지막에 출력
				System.out.print(i + " = ");
			}

		}
		System.out.println(sum);

	} // e.e3

	/**
	 * 실습문제6. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	 *		        단, 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요
	 */
	public void example4() { // s.e4

		while (true) {
			System.out.print("first number: ");
			int num1 = sc.nextInt();

			System.out.print("second number: ");
			int num2 = sc.nextInt();

			if (num1 >= 1 && num1 > num2 && num2 >= 1) {
				for (int i = num2; i <= num1; i++) { // s.for
					System.out.print(i + " ");
				} // e.for
				break;

			} else if (num1 >= 1 && num1 < num2 && num2 >= 1) {
				for (int i = num1; i <= num2; i++) { // s.for
					System.out.print(i + " ");
				} // e.for
				break;

			} else {
				System.out.println("1이상의 숫자만을 입력해주세요.");
			}

		}

	} // e.e4
	
	/**
	 * 실습문제8. 사용자에게 입력받은 숫자 단 출력하기
	 */

	public void example5() { // s.e5

		System.out.print("숫자: ");
		int dan = sc.nextInt();

		System.out.println("===" + dan + "단===");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
		}

	} // e.e5

	/**
	 * 실습문제9. 사용자가 입력한 숫자 단 부터 9단까지 출력하기
	 * 			(단, 2~9사이의 숫자가 아닌 경우 "2~9사이의 숫자만 입력해주세요." 출력)
	 */
	public void example6() { // s.e6

		while (true) {

			System.out.print("숫자: ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {

				for (int i = dan; i <= 9; i++) { // s.for
					
					System.out.println("===" + i + "단===");
					
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d x %d = %d\n", i, j, (i * j));
					}

				} // e.for
				break;

			} else {
				System.out.println("2~9사이의 숫자만 입력해주세요");
			}
		}

	} // e.e6

	/**
	 * 실습문제11. 사용자에게 시작 숫자와 공차를 입력받아  일정한 값으로 
	 * 			  숫자가 커지거나 작아지는 프로그램을 구현하세요.
	 *			 (단, 출력되는 숫자는 총 10개)
	 */
	public void example7() {		//s.e7
		System.out.print("first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.print(num1 + " ");
			num1+=num2;
		}
		
	} 		// e.e7

	public void example8()	{
		
		while(true) {
			
		//1. 연산자 입력받기 
		System.out.print("연산자 : ");
		String op = sc.nextLine(); 
		
		// >> 해당 연산자가 "exit"일 경우  => "프로그램 종료합니다." 출력후 반복문 빠져나가기
		if(op.equals("exit")) {
			System.out.println("프로그램 종료합니다.");
			break;
		}
		
		//2. 두개의 정수 입받기
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		//>> 위 연산자 입력후 버퍼에 enter가 남아 있을수 있기 때문에 다음 연산자를 잘 출력하기 위해 안전하게 미리 enter를 제가 해주기 위해. 
		sc.nextLine();
		
		// >> 연산기호가  / 이고 그리고 두번째 정수가 0일 경우 => "______" 출력 후 반복문 다시 실행
		
		if(op.equals("/") && num2 == 0) {	//s.if
			System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.\n");
			continue;
		}		//e.if
		
		// 3. 연산 결과 출력
			int result = 0;			// 산술 연산한 결과 기록할 변수
			
			switch(op) {	//s.switch
			case "+" : result= num1 + num2; break;
			case "-" : result= num1 - num2; break;
			case "*" : result= num1 * num2; break;
 			case "/" : result= num1 / num2; break;
			case "%" : result= num1 % num2; break;
			// >> 연산기호가 잘못입력 됐을 경우 => "______" 출력 수 반복문 다시 실행
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요.\n"); 
			continue;			// 반복문 다시 실행 하기 위해 밑에 다음 무시하고 다시 위로 시작. 
			}	// e.switch 
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
			System.out.println();
				
			sc.nextLine();
		}
		
	}
	
	/**
	 * 실습문제12. 정수 두 개와 연산자(문자열로 입력 받고) 입력된 연산자에 따라 알맞은 결과를 출력하세요.
	 *			 (단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 들어올 때까지 무한 반복)
	 *
	 *		 	  첫번째 경우 : exit가 들어오면 "프로그램을 종료합니다."를 출력하고 종료합니다.
	 *
	 *			  두번째 경우 : 연산자가 만약 나누기이면서 두 번째 정수가 0으로 들어오면 
	 *			 		   "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력하며,
	 *
	 *			  세번째 경우 : 없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력해주세요."라고 출력
	 *
	 *			  위의 두번째, 세번째 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
	 */
	
	public void example8_A() {
		
		while(true ) {
			
		System.out.print("연산자(+, -, *, /, %) : ");
		String op = sc.nextLine();
		
		if(op.equals("exit")) {
			System.out.println("프로그램을 종료합니다."); 
				break;
		} 
			
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		if(op.equals("+")) {
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1+num2));
		} else if (op.equals("-")){
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1-num2));
		} else if(op.equals("*")) {
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1*num2));
		} else if(op.equals("/") && num1>0 && num2>0) {
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1/num2));
		} else if(op.equals("%")) {
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1%num2));
		} else if (op.equals("/") || num1<=0 || num2<=0 ) {
			System.out.println("0으로 나눌 수 없습니다. 다시입력해주세요");
		} else {
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");
		}
		break;
		
	}
}
	/**
	 * 실습문제6. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	 *		        단, 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요
	 */
	public void example4_A() {		//s.e4A
	
		while(true) {
			
		System.out.print("first number: ");
		int num1 = sc.nextInt();

		System.out.print("second number: ");
		int num2 = sc.nextInt();
		
		if(num1>=1 && num2>=1) {
			
			int max = Math.max(num1, num2);		// 두 수 중에 큰것을 판결해서 max 넣는 과정
			int min = Math.min(num1, num2);		// 두 수 중에 작은 것을 판결해서 min 넣는 과정 
			
			for(int i=min; i<=max; i++) {			//s.for
				System.out.print(i + " ");
			}		// e.for
		
		break;
		}	else {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
		}
			
		
	}	// e.e4A
	
	public void example7_A() {		//s.e7A
		
		System.out.print("first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		int count=0;
		
		for(int i = num1; ; i+=num2) {
			System.out.print(i + " ");
		
			count++;
			
			if(count == 10) {
				break;
			}
			
		}
		
		
		
	}	// e.e7A
	
	public void example4_B() {			// s.e4B
		
		while(true) {
		
		System.out.print("first number: ");
		int num1 = sc.nextInt();

		System.out.print("second number: ");
		int num2 = sc.nextInt();
		
		if(num1>=1 && num2>=1) {
			
			int min = 0; // 두 수 중에서 작은 수 기록할 공간
			int max = 0; // 두 수 중에서 큰 수 기록할 공
			
			if(num1>num2) {
				max = num1;
				min = num2;
				
			} else {
				max = num2;
				min = num1;
			}
			
			break;
			
		} else {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
		
		}
	}// e.e4B
	
	
}