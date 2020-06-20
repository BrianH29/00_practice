package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {  


	public void method1() { // start method1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :  ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.next().charAt(0);
		//char gender = sc.nextLine().charAt(0); // >> nextLine을 안 쓰면 위에 sc.nextLine(); 필요 없음 
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.print(" 키 " + height +"인 " + age + "살 " + gender+ "자 " + name + "님 반갑습니다 ^^" );
			
		
	} 				// end method1
	
	
	public void method2() { 			// start method2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하시오 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("뺴기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
	}			// end method2
	
	
	
	public void method3() {				// start method3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double length = sc.nextDouble();
		
		System.out.println("면적 : " + (width*length));
		System.out.println("둘래 : " + (width+length)*2);
		
		
	}			// end method3	
	
	public void method4() { 				// start method4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		System.out.println("첫 번쨰 문자 : " + fruit.charAt(0));
		System.out.println("두 번쨰 문자 : " + fruit.charAt(1));
		System.out.println("세 번쨰 문자 : " + fruit.charAt(2));
		
	}				// end method4
	
	
	
	public void method5() {     // 		start method5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String a = sc.nextLine();
		
		char first = a.charAt(0);
		char second = a.charAt(1);
		char third = a.charAt(2);
		
		System.out.println("첫 : " + first);
		System.out.println("첫 : " + second);
		System.out.println("첫 : " + third);
		
	}				// end method5
	
}

	
	
	