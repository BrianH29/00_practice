package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// FileDao �ҷ�����
		FileDao fd = new FileDao();

		// �ݺ����� ���� �޴� ����
		while (true) {
			System.out.println("****My Note****");

			System.out.println("1. ��Ʈ ���� �����"); // fd.fileSave() ����
			System.out.println("2. ��Ʈ ���� "); // fd.fileOpen() ����
			System.out.println("3. ��Ʈ ��� �����ϱ�"); // fd.fileEdit() ����
			System.out.println("4. ������");
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : fd.fileSave(); break; 
			case 2 : fd.fileOpen(); break;
			case 3 : fd.fileEdit(); break; 
			case 4 : System.out.println("end program"); return; 
			default : System.out.println("�޴��� �ٽ� �������ּ���.");
			}

		}

	}

}
