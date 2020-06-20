package com.kh.practice3.example;

import java.util.Scanner;

public class OperatorPractice {

public void practice1() {		// start p1
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수를 입력 :");
	int num = sc.nextInt();
	
	String result = (num >=0) ? ("양수이다") : ("양수가 아니다.");
	System.out.println(num + "은(는) " + result);
	
	// System.out.println(num>0 ? "양수다": "양수가 아니다");
	
}		// end p1
	
public void practice2() { 	// start p2
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수를 입력:");
	int num = sc.nextInt();
	
	// String result = (num<0) ? ("음수다") : (num == 0 ? "0이다" : "양수다");
	String result = (num > 0) ? ("양수이다") : (num == 0 ) ? ("0이다") : ("음수이다");
	System.out.println(num + "은(는)" + result);
	
	
}		// end p2

public void practice3() {  // start p3
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수를 입력 : ");
	int num = sc.nextInt();
	
	//String result = (num%2 !=1) ? ("짝수이다") : ("홀수이다");
	//String result = (num%2 == 1) ? ("홀수이다") : ("짝수이다");
	//String result = (num%2 !=0) ? ("홀수이다") : ("짝수이다");
	String result = (num%2 ==0) ? ("짝수이다") : ("홀수이다");
	System.out.println(num + "은(는)" + result);
	
	
}	// end p3

public void practice4() {		// start p4
	
	Scanner sc = new Scanner(System.in);
	System.out.print("인원 수 : ");
	int ppl = sc.nextInt();
	
	//sc.nextLine();
	
	System.out.print("사탕 개수 : ");
	int num = sc.nextInt();
	
	int each = (num/ppl);
	int left = (num%ppl);
	
	System.out.println("1인당 사탕 개수 : " + each);
	System.out.println("남는 사탕 개수 :  " + left);
	
	//System.out.println("1인당 사탕 개수 : " + (num / ppl));
	//System.out.println("남는 사탕 개수 :  " + (num % ppl));
	
			
}		// end p4

public void practice5() {		// start p5
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("이름 : ");
	String name = sc.nextLine();
	
	System.out.print("학년(숫자만) : "); 		// grade
	int cl = sc.nextInt();
	sc.nextLine();
	
	System.out.print("반(숫자만) : "); 		// nextInt 다음라인에 nextLIne이 오면 그사이에 nextLine 한번 더해서 변수에 남아있는 enter 제거
	int num1 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("번호(숫자만) : ");
	int num2 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("성별(M/F) : ");
	char gender = sc.nextLine().charAt(0);
	
	System.out.print("성적(소수점 아래 둘째 자리까지) : ");
	double score = sc.nextDouble();
	
	String sex = (gender == 'M') ? ("남학생") : ("여학생");
	
	//System.out.println();
	System.out.println(cl + "학년 " + num1 + "반 " + num2 + "번 " + name +" "+ sex + "의 " +"성적은 " + score +"이다.");
	// System.out.printf( "%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", cl, num1, num2,name,sex,score);
	
} // end p5

public void practice6() { 	// start p6
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("나이 : ");
	int age = sc.nextInt();
	sc.nextLine();
	
	//String result = (age <= 13) ? ("어린이") : (age>19) ? ("성인") : ("청소년");
	//String result = (age <= 13) ? ("어린이") : (age<=19) ? ("청소년") : ("성인");
	String result = (age <= 13) ? ("어린이") : (age >=13 && age<=19) ? ("청소년") : ("성인");
	System.out.println(result);
	
}		// end p6

public void practice7() {		// start p7
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("국어 : ");
	int kor = sc.nextInt();
	sc.nextLine();
	
	System.out.print("영어 : ");
	int eng = sc.nextInt();
	sc.nextLine();
	
	System.out.print("수학 : ");
	int math = sc.nextInt();
	sc.nextLine();
	
	int sum = (kor + eng + math);
	double avg = (sum/3.0);			// 3의로 나눠도 되지만 조금더 확실한 데이터 보관을 위해 3.0더블로 나누기.
	
	System.out.println("합계 : " + sum);
	System.out.println("평균 : " + avg);
	
	String result = (kor >=40 && eng >=40 && math >=40 && avg>=60) ? ("합격입니다.") : ("불합격입니다.");
	System.out.println(result);
	
}		// 	end p7

public void practice8() {		// star p8
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("주민번호 입력( - 포함) : ");
	char num = sc.next().charAt(7);
	
	String result = (num == '1' || num == '3') ? ("남자") : ("여자");
	System.out.println(result);
	
	//String str = sc.nextLine();
	
	//char pId = str.charAt(7);

	// String gender = (pId == '1' || pId == '3') ? "남자" :
	//						   (pId == '2' || pId == '4') ? "여자" : "잘못 입력하셨습니다";
	
	//System.out.println(gender);
	
	
}		// end p8

public void practice9() {	// start p9
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("첫번째 정수를 입력하겟요 : ");
	int num1 = sc.nextInt();
	
	System.out.print("두번째 정수를 입력하겟요 : ");
	int num2 = sc.nextInt();

	System.out.print("세번쨰 정수를 입력하겟요 : ");
	int num3 = sc.nextInt();
	
	boolean result = (num2 <= num3) || (num3 <= num1);
	//String result = (num1 >= num3 || num2 <= num3 ) ? ("true") : ("false");
	System.out.println(result);
	
}		// end p9

public void practice10() {			//  start p10
	
Scanner sc = new Scanner(System.in);
	
	System.out.print("입력1 : ");
	int num1 = sc.nextInt();
	//sc.nextLine();
	
	System.out.print("입력2 : ");
	int num2 = sc.nextInt();
	//sc.nextLine();
	
	System.out.print("입력3 : ");
	int num3 = sc.nextInt();
	//sc.nextLine();
	
	boolean result = num1 == num2 && num2 == num3;
	//String result = ( num1 == num2 && num2 == num3) ? ("true") : ("false");
	System.out.println(result);
	
}		// end p10





public void practice11() {		// start p11
	
Scanner sc = new Scanner(System.in);
	
	System.out.print("A사원의 연봉 : ");
	int A1 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("B사원의 연봉 : ");
	int B1 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("C사원의 연봉 : ");
	int C1 = sc.nextInt();
	sc.nextLine();
	
	double s1 = ((A1*0.4)+A1);			// A1*1.4
	double s2 = B1;
	double s3 = ((C1*0.15)+C1);			// C1*1.15
	

	String result1 = (s1>=3000 || s1<=3000) ? ("3000 이상"):("3000 미만");
	String result2 = (s2>=3000 || s2<=3000) ? ("3000 이상"):("3000 미만");
	String result3 = (s3>=3000 || s3<=3000) ? ("3000 이상"):("3000 미만");
	
	System.out.println("A사원의 인센티브포함 연봉: " + s1 + " "+ result1);
	System.out.println("B사원의 인센티브포함 연봉: " + s2 +" " + result2);
	System.out.println("C사원의 인센티브포함 연봉: " + s3 + " "+ result3);
	
	
}		// end p11

}
