package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1,"ȫ�浿",19,'M',"416-450-6581","������ ���ǵ�");
		emp[2] = new Employee(2,"�踻��","������","����",20,'F',1000000,0.01,"011-895-6598","���� ����");
		
		System.out.println(emp[0].info());
		System.out.println(emp[1].info());
		System.out.println(emp[2].info());
		
		System.out.println("=============================================");
		
		emp[0] = new Employee(0, "�踻��", "������", "����", 30, 'M', 3000000, 0.2, "01055559999","���� ����");
		emp[1] = new Employee(1, "ȫ�浿","��ȹ��","����", 19, 'M',4000000,0.3,"01022223333", "���� ���");
		System.out.println(emp[0].info());
		System.out.println(emp[1].info());
		
		int e0 = (emp[0].getSalary() + (int)(emp[0].getSalary()*emp[0].getbonusPoint()))*12;
		int e1 = (emp[1].getSalary() + (int)(emp[1].getSalary()*emp[1].getbonusPoint()))*12;
		int e2 = (emp[2].getSalary() + (int)(emp[2].getSalary()*emp[2].getbonusPoint()))*12;

		System.out.printf("�踻���� ���� : %d��\n",e0);
		System.out.printf("ȫ�浿�� ���� : %d��\n",e1);
		System.out.printf("�踻���� ���� : %d��\n",e2);	
		System.out.println("=============================================");
		
		int sum = e0+e1+e2;
		System.out.println("�������� ���� ���:"+sum/3);
		
}
}

