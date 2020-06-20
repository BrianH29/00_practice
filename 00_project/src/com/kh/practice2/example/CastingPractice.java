package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1() { // start method1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : " );
		char ch = sc.next().charAt(0);
		
		//int num = ch;
		//System.out.println("A unicode : " + num);
		System.out.println(ch+ "unicode : " + (int)ch);    // 쌤 답
		
	}			// end method1
	
	
	public void method2() {   // start method1
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :  ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 :  ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 :  ");
		double math = sc.nextDouble();
		
		int sum =(int)( kor+eng+math);
		//int avg = (int)sum/3;
		int avg = sum/3;			// 쎔 답
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	
		
	}		// end metho2
	
	
	public void method3() { 	// start method3
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
				
		
		System.out.printf(" iNum1/iNum2 = %d\n", (iNum1/iNum2));
		
		int i_Num = (int)dNum;
		System.out.println("dNum = "+ i_Num );
		
		double result = (double)iNum2*dNum;			
		System.out.println("result = " + result);
		
		double d_Num = (double)iNum1;
		System.out.println("iNum1 = " + d_Num);
		
		double result1 = (double)iNum1/iNum2;
		System.out.println("result1 = " + result1);
		
		System.out.println("dNum = "+ dNum);
		
		int f_Num = (int)fNum;
		System.out.println("fNum = " + f_Num);
		
		int a = (int)(iNum1/fNum);
		System.out.println("iNum1/fNum = " + a);
		
		float b = (float)(iNum1/fNum);
		System.out.println("iNum1/fNum = " + b);
		
		double c = (double)(iNum1/fNum);
		System.out.println("iNum1/fNum = " + c);
		
		System.out.println(" ch = " + ch );
		
		int d = ch;
		System.out.println("ch = " + d);
		
		int e = ch;
		System.out.println("ch + iNum1 = " + (e+iNum1));	
		
		int f = ch+iNum1;	
		System.out.println("ch inum1 = "+ ((char)f));

		
		
		
	}		// end method3

	public void method4() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1/iNum2);
		System.out.println((int)dNum);
		System.out.println(iNum2*dNum);
		System.out.println((double)iNum1);
		System.out.println((double)iNum1/iNum2);
		System.out.println( dNum);
		System.out.println((int)fNum);
		System.out.println((int)(iNum1/fNum));
		System.out.println(iNum1/fNum);
		//System.out.println((double)iNum1/fNum);
		System.out.println(iNum1/(double)fNum);				// 쌤 답
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch + iNum1);
		System.out.println(ch + iNum1);		//문자가 자동으로 숫자로 바뀜 숫자랑 문자 더했을때
		int a = ch + iNum1;        
		System.out.println((char)a);
	
		//System.out.println((char)(ch + iNum1));	   쌤답
		
		
	}
	
	
	
}
