package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
	public static void main(String[] args) {

		Student[] stu = new Student[10];

		Scanner sc = new Scanner(System.in);
		
		int count = 0;	// 학생 수 카운트

		// 1. 학생들 정보 받기
		while (true) {
			for (int i = 0; i < stu.length; i++) {
				System.out.print("학년 : ");
				int grade = sc.nextInt();

				System.out.print("반 : ");
				int classroom = sc.nextInt();
				sc.nextLine();

				System.out.print("이름 : ");
				String name = sc.nextLine();

				System.out.print("국어점수 : ");
				int kor = sc.nextInt();

				System.out.print("영어점수 : ");
				int eng = sc.nextInt();

				System.out.print("수학점수 : ");
				int math = sc.nextInt();


				stu[count] = new Student(grade, classroom, name, kor, eng, math);
				count++;
				
				if(count == 10) {
					break; 
				}

				System.out.print("계속 추가하시겠습니다까?(Y/N) : ");
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
