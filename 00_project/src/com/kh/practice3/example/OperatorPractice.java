package com.kh.practice3.example;

import java.util.Scanner;

public class OperatorPractice {

public void practice1() {		// start p1
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("������ �Է� :");
	int num = sc.nextInt();
	
	String result = (num >=0) ? ("����̴�") : ("����� �ƴϴ�.");
	System.out.println(num + "��(��) " + result);
	
	// System.out.println(num>0 ? "�����": "����� �ƴϴ�");
	
}		// end p1
	
public void practice2() { 	// start p2
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("������ �Է�:");
	int num = sc.nextInt();
	
	// String result = (num<0) ? ("������") : (num == 0 ? "0�̴�" : "�����");
	String result = (num > 0) ? ("����̴�") : (num == 0 ) ? ("0�̴�") : ("�����̴�");
	System.out.println(num + "��(��)" + result);
	
	
}		// end p2

public void practice3() {  // start p3
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("������ �Է� : ");
	int num = sc.nextInt();
	
	//String result = (num%2 !=1) ? ("¦���̴�") : ("Ȧ���̴�");
	//String result = (num%2 == 1) ? ("Ȧ���̴�") : ("¦���̴�");
	//String result = (num%2 !=0) ? ("Ȧ���̴�") : ("¦���̴�");
	String result = (num%2 ==0) ? ("¦���̴�") : ("Ȧ���̴�");
	System.out.println(num + "��(��)" + result);
	
	
}	// end p3

public void practice4() {		// start p4
	
	Scanner sc = new Scanner(System.in);
	System.out.print("�ο� �� : ");
	int ppl = sc.nextInt();
	
	//sc.nextLine();
	
	System.out.print("���� ���� : ");
	int num = sc.nextInt();
	
	int each = (num/ppl);
	int left = (num%ppl);
	
	System.out.println("1�δ� ���� ���� : " + each);
	System.out.println("���� ���� ���� :  " + left);
	
	//System.out.println("1�δ� ���� ���� : " + (num / ppl));
	//System.out.println("���� ���� ���� :  " + (num % ppl));
	
			
}		// end p4

public void practice5() {		// start p5
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�̸� : ");
	String name = sc.nextLine();
	
	System.out.print("�г�(���ڸ�) : "); 		// grade
	int cl = sc.nextInt();
	sc.nextLine();
	
	System.out.print("��(���ڸ�) : "); 		// nextInt �������ο� nextLIne�� ���� �׻��̿� nextLine �ѹ� ���ؼ� ������ �����ִ� enter ����
	int num1 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("��ȣ(���ڸ�) : ");
	int num2 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("����(M/F) : ");
	char gender = sc.nextLine().charAt(0);
	
	System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
	double score = sc.nextDouble();
	
	String sex = (gender == 'M') ? ("���л�") : ("���л�");
	
	//System.out.println();
	System.out.println(cl + "�г� " + num1 + "�� " + num2 + "�� " + name +" "+ sex + "�� " +"������ " + score +"�̴�.");
	// System.out.printf( "%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", cl, num1, num2,name,sex,score);
	
} // end p5

public void practice6() { 	// start p6
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	int age = sc.nextInt();
	sc.nextLine();
	
	//String result = (age <= 13) ? ("���") : (age>19) ? ("����") : ("û�ҳ�");
	//String result = (age <= 13) ? ("���") : (age<=19) ? ("û�ҳ�") : ("����");
	String result = (age <= 13) ? ("���") : (age >=13 && age<=19) ? ("û�ҳ�") : ("����");
	System.out.println(result);
	
}		// end p6

public void practice7() {		// start p7
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	int kor = sc.nextInt();
	sc.nextLine();
	
	System.out.print("���� : ");
	int eng = sc.nextInt();
	sc.nextLine();
	
	System.out.print("���� : ");
	int math = sc.nextInt();
	sc.nextLine();
	
	int sum = (kor + eng + math);
	double avg = (sum/3.0);			// 3�Ƿ� ������ ������ ���ݴ� Ȯ���� ������ ������ ���� 3.0������ ������.
	
	System.out.println("�հ� : " + sum);
	System.out.println("��� : " + avg);
	
	String result = (kor >=40 && eng >=40 && math >=40 && avg>=60) ? ("�հ��Դϴ�.") : ("���հ��Դϴ�.");
	System.out.println(result);
	
}		// 	end p7

public void practice8() {		// star p8
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�ֹι�ȣ �Է�( - ����) : ");
	char num = sc.next().charAt(7);
	
	String result = (num == '1' || num == '3') ? ("����") : ("����");
	System.out.println(result);
	
	//String str = sc.nextLine();
	
	//char pId = str.charAt(7);

	// String gender = (pId == '1' || pId == '3') ? "����" :
	//						   (pId == '2' || pId == '4') ? "����" : "�߸� �Է��ϼ̽��ϴ�";
	
	//System.out.println(gender);
	
	
}		// end p8

public void practice9() {	// start p9
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("ù��° ������ �Է��ϰٿ� : ");
	int num1 = sc.nextInt();
	
	System.out.print("�ι�° ������ �Է��ϰٿ� : ");
	int num2 = sc.nextInt();

	System.out.print("������ ������ �Է��ϰٿ� : ");
	int num3 = sc.nextInt();
	
	boolean result = (num2 <= num3) || (num3 <= num1);
	//String result = (num1 >= num3 || num2 <= num3 ) ? ("true") : ("false");
	System.out.println(result);
	
}		// end p9

public void practice10() {			//  start p10
	
Scanner sc = new Scanner(System.in);
	
	System.out.print("�Է�1 : ");
	int num1 = sc.nextInt();
	//sc.nextLine();
	
	System.out.print("�Է�2 : ");
	int num2 = sc.nextInt();
	//sc.nextLine();
	
	System.out.print("�Է�3 : ");
	int num3 = sc.nextInt();
	//sc.nextLine();
	
	boolean result = num1 == num2 && num2 == num3;
	//String result = ( num1 == num2 && num2 == num3) ? ("true") : ("false");
	System.out.println(result);
	
}		// end p10





public void practice11() {		// start p11
	
Scanner sc = new Scanner(System.in);
	
	System.out.print("A����� ���� : ");
	int A1 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("B����� ���� : ");
	int B1 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("C����� ���� : ");
	int C1 = sc.nextInt();
	sc.nextLine();
	
	double s1 = ((A1*0.4)+A1);			// A1*1.4
	double s2 = B1;
	double s3 = ((C1*0.15)+C1);			// C1*1.15
	

	String result1 = (s1>=3000 || s1<=3000) ? ("3000 �̻�"):("3000 �̸�");
	String result2 = (s2>=3000 || s2<=3000) ? ("3000 �̻�"):("3000 �̸�");
	String result3 = (s3>=3000 || s3<=3000) ? ("3000 �̻�"):("3000 �̸�");
	
	System.out.println("A����� �μ�Ƽ������ ����: " + s1 + " "+ result1);
	System.out.println("B����� �μ�Ƽ������ ����: " + s2 +" " + result2);
	System.out.println("C����� �μ�Ƽ������ ����: " + s3 + " "+ result3);
	
	
}		// end p11

}