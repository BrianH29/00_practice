package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int alert = sc.nextInt();
		
		String input = null;
		
		switch(alert) {
		case 1: input ="입력"; break;
		case 2: input = "수정"; break;
		case 3: input = "조회"; break;
		case 4: input = "삭재"; break;
		case 9: System.out.println("프로그램이 종료됩니다."); return;
		}
		System.out.println(input + " 메뉴입니다.");
		
	}

	public void practice2() {		// start p2
	
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >=0 && input%2==0) {
			System.out.println("짝수다");
		} else if  (input %2 ==1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력하세요");
		}
		
	} 	// end p2
	
	public void practice3() {		// start p3
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		double avg = (sum / 3.0);
		
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("국어 : " + kor );
			System.out.println("영어: " + eng );
			System.out.println("수학 : " + math );
			System.out.println("합계 : " + sum );
			System.out.println("평균 : " + avg );
			System.out.println("축하합니다, 합격입니다.");
			} else {
				System.out.println("불합격입니다.");
				return;
			}
		}		// end p3
		
	public void practice4() {		// start p4
		
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2: System.out.println(month + "월은 겨울입니다."); break;
		case 3:
		case 4:
		case 5: System.out.println(month + "월은 봄입니다."); break;
		case 6:
		case 7:
		case 8: System.out.println(month + "월은 여름입니다."); break;
		case 9:
		case 10:
		case 11:System.out.println(month + "월은 봄입니다."); break;
		default: System.out.println("잘못입력하셨습니다.");
		return;
		}
			
	}		// end p4
	
	public void practice5() {
		System.out.print("아이디 :  ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		if(id.equals("BrianH") && pwd.equals("12345")) {
			System.out.println("로그인 성공 ");
		} else if (id.equals("BrianH")){
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (pwd.equals("12345")) {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}
		
}
