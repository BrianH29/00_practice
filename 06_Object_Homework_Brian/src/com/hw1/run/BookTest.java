package com.hw1.run;

import com.hw1.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		System.out.println(b1.info());
		
		Book b2 = new Book();
		b2.setTitle("자바의정석");
		b2.setPrice(200000);
		b2.setDiscountRate(0.2);
		b2.setAuthor("윤상섭");
		
		System.out.println(b2.info());
		System.out.println("======================");
		
		b2.setTitle("C언어");
		b2.setPrice(300000);
		b2.setDiscountRate(0.1);
		b2.setAuthor("홍길동");
		
		System.out.println(b2.info());
		System.out.println("======================");
		
		int total = b2.getPrice() - (int)(b2.getPrice()*b2.getDiscountRate());
		
		System.out.println("도서명 : " + b2.getTitle());
		System.out.println("할인된 가격 : " + total);
	}
}
