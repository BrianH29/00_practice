package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {  


	public void method1() { // start method1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� :  ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		//sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.next().charAt(0);
		//char gender = sc.nextLine().charAt(0); // >> nextLine�� �� ���� ���� sc.nextLine(); �ʿ� ���� 
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.print(" Ű " + height +"�� " + age + "�� " + gender+ "�� " + name + "�� �ݰ����ϴ� ^^" );
			
		
	} 				// end method1
	
	
	public void method2() { 			// start method2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��Ͻÿ� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��Ͻÿ� : ");
		int num2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ �� ��� : " + (num1 / num2));
	}			// end method2
	
	
	
	public void method3() {				// start method3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		
		System.out.print("���� : ");
		double length = sc.nextDouble();
		
		System.out.println("���� : " + (width*length));
		System.out.println("�ѷ� : " + (width+length)*2);
		
		
	}			// end method3	
	
	public void method4() { 				// start method4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String fruit = sc.nextLine();
		
		System.out.println("ù ���� ���� : " + fruit.charAt(0));
		System.out.println("�� ���� ���� : " + fruit.charAt(1));
		System.out.println("�� ���� ���� : " + fruit.charAt(2));
		
	}				// end method4
	
	
	
	public void method5() {     // 		start method5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String a = sc.nextLine();
		
		char first = a.charAt(0);
		char second = a.charAt(1);
		char third = a.charAt(2);
		
		System.out.println("ù : " + first);
		System.out.println("ù : " + second);
		System.out.println("ù : " + third);
		
	}				// end method5
	
}

	
	
	