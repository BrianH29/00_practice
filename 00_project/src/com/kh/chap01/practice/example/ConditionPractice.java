package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int alert = sc.nextInt();
		
		String input = null;
		
		switch(alert) {
		case 1: input ="�Է�"; break;
		case 2: input = "����"; break;
		case 3: input = "��ȸ"; break;
		case 4: input = "����"; break;
		case 9: System.out.println("���α׷��� ����˴ϴ�."); return;
		}
		System.out.println(input + " �޴��Դϴ�.");
		
	}

	public void practice2() {		// start p2
	
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if(input >=0 && input%2==0) {
			System.out.println("¦����");
		} else if  (input %2 ==1) {
			System.out.println("Ȧ����");
		} else {
			System.out.println("����� �Է��ϼ���");
		}
		
	} 	// end p2
	
	public void practice3() {		// start p3
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		double avg = (sum / 3.0);
		
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("���� : " + kor );
			System.out.println("����: " + eng );
			System.out.println("���� : " + math );
			System.out.println("�հ� : " + sum );
			System.out.println("��� : " + avg );
			System.out.println("�����մϴ�, �հ��Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
				return;
			}
		}		// end p3
		
	public void practice4() {		// start p4
		
		System.out.print("���� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2: System.out.println(month + "���� �ܿ��Դϴ�."); break;
		case 3:
		case 4:
		case 5: System.out.println(month + "���� ���Դϴ�."); break;
		case 6:
		case 7:
		case 8: System.out.println(month + "���� �����Դϴ�."); break;
		case 9:
		case 10:
		case 11:System.out.println(month + "���� ���Դϴ�."); break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
		return;
		}
			
	}		// end p4
	
	public void practice5() {
		System.out.print("���̵� :  ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pwd = sc.nextLine();
		
		if(id.equals("BrianH") && pwd.equals("12345")) {
			System.out.println("�α��� ���� ");
		} else if (id.equals("BrianH")){
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else if (pwd.equals("12345")) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		
	}
		
}