package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
	public static void main(String[] args) {

		Student[] stu = new Student[10];

		Scanner sc = new Scanner(System.in);
		
		int count = 0;	// �л� �� ī��Ʈ

		// 1. �л��� ���� �ޱ�
		while (true) {
			for (int i = 0; i < stu.length; i++) {
				System.out.print("�г� : ");
				int grade = sc.nextInt();

				System.out.print("�� : ");
				int classroom = sc.nextInt();
				sc.nextLine();

				System.out.print("�̸� : ");
				String name = sc.nextLine();

				System.out.print("�������� : ");
				int kor = sc.nextInt();

				System.out.print("�������� : ");
				int eng = sc.nextInt();

				System.out.print("�������� : ");
				int math = sc.nextInt();


				stu[count] = new Student(grade, classroom, name, kor, eng, math);
				count++;
				
				if(count == 10) {
					break; 
				}

				System.out.print("��� �߰��Ͻðڽ��ϴٱ�?(Y/N) : ");
				char yn = sc.next().charAt(0);

				if (yn == 'y' || yn == 'Y') {
					continue;
				} else if (yn == 'N' || yn == 'n') {
					break;
				}
					
				

			} // e.for

			for (int i = 0; i < count; i++) {
				System.out.println(stu[i].info());


			}
			break;	
		} // e.while

	}

}