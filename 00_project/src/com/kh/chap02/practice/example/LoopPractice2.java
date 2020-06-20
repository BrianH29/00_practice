package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice2 {

	Scanner sc = new Scanner(System.in);

	public void example1() { // s.e1

		while (true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {

					System.out.print(i + " ");
				}
				break;

			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�: ");

			}

		}

	} // e.e1

	public void example2() {

		while (true) { // s,while
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
			int input = sc.nextInt();

			if (input > 1) {
				for (int i = input; i >= 1; i--) { // s.for
					System.out.print(i + " ");
				} // e.for
				break;

			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���:");
			} // e.ifelse

		} // e.while

	} // e.e2

	public void example3() { // s.e3

		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num1; i++) {
			sum += i;
			
			if(i < num1) { // i�� ��� ���� num�� �̸��� �� ������ + �ٿ��� ��� 
				System.out.print(i + " + ");
				
			}else {	// �� i�� ��� ���� num���� ��ġ������ ���� = �ٿ��� �������� ���
				System.out.print(i + " = ");
			}

		}
		System.out.println(sum);

	} // e.e3

	/**
	 * �ǽ�����6. ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
	 *		        ��, 1 �̸��� ���ڰ� �Էµƴٸ� ��1�̻��� ���ڸ��� �Է����ּ��䡰�� ����ϼ���
	 */
	public void example4() { // s.e4

		while (true) {
			System.out.print("first number: ");
			int num1 = sc.nextInt();

			System.out.print("second number: ");
			int num2 = sc.nextInt();

			if (num1 >= 1 && num1 > num2 && num2 >= 1) {
				for (int i = num2; i <= num1; i++) { // s.for
					System.out.print(i + " ");
				} // e.for
				break;

			} else if (num1 >= 1 && num1 < num2 && num2 >= 1) {
				for (int i = num1; i <= num2; i++) { // s.for
					System.out.print(i + " ");
				} // e.for
				break;

			} else {
				System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
			}

		}

	} // e.e4
	
	/**
	 * �ǽ�����8. ����ڿ��� �Է¹��� ���� �� ����ϱ�
	 */

	public void example5() { // s.e5

		System.out.print("����: ");
		int dan = sc.nextInt();

		System.out.println("===" + dan + "��===");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
		}

	} // e.e5

	/**
	 * �ǽ�����9. ����ڰ� �Է��� ���� �� ���� 9�ܱ��� ����ϱ�
	 * 			(��, 2~9������ ���ڰ� �ƴ� ��� "2~9������ ���ڸ� �Է����ּ���." ���)
	 */
	public void example6() { // s.e6

		while (true) {

			System.out.print("����: ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {

				for (int i = dan; i <= 9; i++) { // s.for
					
					System.out.println("===" + i + "��===");
					
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d x %d = %d\n", i, j, (i * j));
					}

				} // e.for
				break;

			} else {
				System.out.println("2~9������ ���ڸ� �Է����ּ���");
			}
		}

	} // e.e6

	/**
	 * �ǽ�����11. ����ڿ��� ���� ���ڿ� ������ �Է¹޾�  ������ ������ 
	 * 			  ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
	 *			 (��, ��µǴ� ���ڴ� �� 10��)
	 */
	public void example7() {		//s.e7
		System.out.print("first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� : ");
		int num2 = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.print(num1 + " ");
			num1+=num2;
		}
		
	} 		// e.e7

	public void example8()	{
		
		while(true) {
			
		//1. ������ �Է¹ޱ� 
		System.out.print("������ : ");
		String op = sc.nextLine(); 
		
		// >> �ش� �����ڰ� "exit"�� ���  => "���α׷� �����մϴ�." ����� �ݺ��� ����������
		if(op.equals("exit")) {
			System.out.println("���α׷� �����մϴ�.");
			break;
		}
		
		//2. �ΰ��� ���� �Թޱ�
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		//>> �� ������ �Է��� ���ۿ� enter�� ���� ������ �ֱ� ������ ���� �����ڸ� �� ����ϱ� ���� �����ϰ� �̸� enter�� ���� ���ֱ� ����. 
		sc.nextLine();
		
		// >> �����ȣ��  / �̰� �׸��� �ι�° ������ 0�� ��� => "______" ��� �� �ݺ��� �ٽ� ����
		
		if(op.equals("/") && num2 == 0) {	//s.if
			System.out.println("0���� ������ �����ϴ�. �ٽ� �Է����ּ���.\n");
			continue;
		}		//e.if
		
		// 3. ���� ��� ���
			int result = 0;			// ��� ������ ��� ����� ����
			
			switch(op) {	//s.switch
			case "+" : result= num1 + num2; break;
			case "-" : result= num1 - num2; break;
			case "*" : result= num1 * num2; break;
 			case "/" : result= num1 / num2; break;
			case "%" : result= num1 % num2; break;
			// >> �����ȣ�� �߸��Է� ���� ��� => "______" ��� �� �ݺ��� �ٽ� ����
			default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n"); 
			continue;			// �ݺ��� �ٽ� ���� �ϱ� ���� �ؿ� ���� �����ϰ� �ٽ� ���� ����. 
			}	// e.switch 
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
			System.out.println();
				
			sc.nextLine();
		}
		
	}
	
	/**
	 * �ǽ�����12. ���� �� ���� ������(���ڿ��� �Է� �ް�) �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���.
	 *			 (��, �ش� ���α׷��� ������ �Է¿� "exit"��� ���� ���� ������ ���� �ݺ�)
	 *
	 *		 	  ù��° ��� : exit�� ������ "���α׷��� �����մϴ�."�� ����ϰ� �����մϴ�.
	 *
	 *			  �ι�° ��� : �����ڰ� ���� �������̸鼭 �� ��° ������ 0���� ������ 
	 *			 		   "0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���."�� ����ϸ�,
	 *
	 *			  ����° ��� : ���� �����ڰ� ���� �� "���� �������Դϴ�. �ٽ� �Է����ּ���."��� ���
	 *
	 *			  ���� �ι�°, ����° ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
	 */
	
	public void example8_A() {
		
		while(true ) {
			
		System.out.print("������(+, -, *, /, %) : ");
		String op = sc.nextLine();
		
		if(op.equals("exit")) {
			System.out.println("���α׷��� �����մϴ�."); 
				break;
		} 
			
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		if(op.equals("+")) {
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1+num2));
		} else if (op.equals("-")){
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1-num2));
		} else if(op.equals("*")) {
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1*num2));
		} else if(op.equals("/") && num1>0 && num2>0) {
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1/num2));
		} else if(op.equals("%")) {
			System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1%num2));
		} else if (op.equals("/") || num1<=0 || num2<=0 ) {
			System.out.println("0���� ���� �� �����ϴ�. �ٽ��Է����ּ���");
		} else {
			System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
		}
		break;
		
	}
}
	/**
	 * �ǽ�����6. ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
	 *		        ��, 1 �̸��� ���ڰ� �Էµƴٸ� ��1�̻��� ���ڸ��� �Է����ּ��䡰�� ����ϼ���
	 */
	public void example4_A() {		//s.e4A
	
		while(true) {
			
		System.out.print("first number: ");
		int num1 = sc.nextInt();

		System.out.print("second number: ");
		int num2 = sc.nextInt();
		
		if(num1>=1 && num2>=1) {
			
			int max = Math.max(num1, num2);		// �� �� �߿� ū���� �ǰ��ؼ� max �ִ� ����
			int min = Math.min(num1, num2);		// �� �� �߿� ���� ���� �ǰ��ؼ� min �ִ� ���� 
			
			for(int i=min; i<=max; i++) {			//s.for
				System.out.print(i + " ");
			}		// e.for
		
		break;
		}	else {
			System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
		}
		}
			
		
	}	// e.e4A
	
	public void example7_A() {		//s.e7A
		
		System.out.print("first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� : ");
		int num2 = sc.nextInt();
		
		int count=0;
		
		for(int i = num1; ; i+=num2) {
			System.out.print(i + " ");
		
			count++;
			
			if(count == 10) {
				break;
			}
			
		}
		
		
		
	}	// e.e7A
	
	public void example4_B() {			// s.e4B
		
		while(true) {
		
		System.out.print("first number: ");
		int num1 = sc.nextInt();

		System.out.print("second number: ");
		int num2 = sc.nextInt();
		
		if(num1>=1 && num2>=1) {
			
			int min = 0; // �� �� �߿��� ���� �� ����� ����
			int max = 0; // �� �� �߿��� ū �� ����� ��
			
			if(num1>num2) {
				max = num1;
				min = num2;
				
			} else {
				max = num2;
				min = num1;
			}
			
			break;
			
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
		}
		
		}
	}// e.e4B
	
	
}