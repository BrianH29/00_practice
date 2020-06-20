package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;
import com.hw1.model.vo.Person;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] stu = new Student[3]; // 3���� �л� ���� ����� �迭

		stu[0] = new Student("ȫ�浿", 20, 178.2, 70.2, 1, "�����ý��۰��а�");
		stu[1] = new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�");
		stu[2] = new Student("������", 23, 167.0, 45.0, 4, "������Ű��а�");

		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].info());
			System.out.println();

		} // e.for

		Employee[] emp = new Employee[10];

		int count = 0; // ��� ī��Ʈ �ϱ� ����

		while (true) {
			
			if (count<emp.length) {

				System.out.print("name: ");
				String name = sc.nextLine();

				System.out.print("age: ");
				int age = sc.nextInt();
				sc.nextLine();

				System.out.print("height: ");
				double height = sc.nextDouble();

				System.out.print("weight: ");
				double weight = sc.nextDouble();

				System.out.print("salary: ");
				int salary = sc.nextInt();
				sc.nextLine();

				System.out.print("department: ");
				String dept = sc.nextLine();

				emp[count++] = new Employee(name, age, height, weight, salary, dept);
				
	
					System.out.print("��� �߰� �Ͻðڽ��ϱ�?(Y/N): "); // yes or no
					char yn = sc.next().charAt(0);
					sc.nextLine();
					
					if (yn == 'Y' || yn == 'y') {
						
						continue;
					} else if (yn == 'N' || yn == 'n') {
						System.out.println("===��� ���� ���====");
						for(int i=0;i<count;i++) {
							System.out.println(emp[i].info());
					}
					
				
				
					
			}
			}//e.if
			break;
		}// e.while
	}	//e.main
}

				

		


	
