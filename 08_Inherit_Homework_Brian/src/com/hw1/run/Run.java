package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;
import com.hw1.model.vo.Person;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] stu = new Student[3]; // 3명의 학색 정보 기록할 배열

		stu[0] = new Student("홍길동", 20, 178.2, 70.2, 1, "정보시스템공학과");
		stu[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		stu[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		for (Student s : stu) {
			System.out.println(s.info());
			System.out.println();

		} // e.for

		Employee[] emp = new Employee[10];
		
		emp[0] = new Employee("박보검", 28, 180.3, 72.0, 10000000, "영업부");
		emp[1] = new Employee("강동원", 40, 182.0, 76.0, 2000000, "기획부");
		
		int count = 2; // 사원 카운트 할 것 
		

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
				
				System.out.println("계속 추가하시겠습니까?(Y/N)");
				char yn = sc.next().charAt(0);
				sc.nextLine();
				
				if(yn == 'y' || yn=='Y') {
					continue; 
				} else if (yn == 'n' || yn=='N') {
					for(int i=0;i<count;i++ ) {
						System.out.println(emp[i].info());
					}
				}
				break; 
			}//e.if
		}//e.loop
		
	}//e.main
}

		
			
			
			
		


	

