package com.kh.hw.run.view;

import java.util.Scanner;
import com.kh.hw.run.controller.*; 

public class Menu {
	
	public void displaymenu() {		// s.displaymenu
		
		Scanner sc = new Scanner(System.in);
		
		Function a = new Function();
		
		while (true) {		// s.repeat
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			int input = sc.nextInt();
			
			switch(input) {
			case 1 : a.calculator(); break;
			case 2 : a.totalCalculator(); break;
			case 3 : a.printProfile(); break;
			case 4 : a.printScore(); break;
			case 5 : a.printStarNumer(); break;
			case 6 : a.sumRandom(); break;
			case 7 : a.exceptGugu(); break;
			case 8 : a.diceGame(); break;
			case 9 : System.out.println("���α׷� ����"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ� "); 
			
			return;
			}
			break; 
			
			
			
			
		}		// e.repeat
		

		
		
		
	}		// e.displaymenu

}