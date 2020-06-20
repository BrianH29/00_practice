package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {
	public static void main(String[] args) {

		Product p1 = new Product();
		p1.setProductId("ssgnot9");
		p1.setProductName("GalaxyNote9");
		p1.setProductArea("경기도 수원");
		p1.setPrice(960000);
		p1.setTax(10.0);

		Product p2 = new Product();
		p2.setProductId("lgxnote5");
		p2.setProductName("LG스마트폰5");
		p2.setProductArea("경기도 평택");
		p2.setPrice(780000);
		p2.setTax(0.7);
		
		Product p3 = new Product();
		p3.setProductId("ktsnoe5");
		p3.setProductName("KT스마트폰5");
		p3.setProductArea("서울시 강남");
		p3.setPrice(250000);
		p3.setTax(0.3);
		
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("==============================");
		
		p1.setPrice(p1.getPrice() + 240000);
		p1.setTax(0.05);
		p2.setPrice(p2.getPrice() + 420000);
		p2.setTax(0.05);
		p3.setPrice(p3.getPrice() + 950000);
		p3.setTax(0.05);
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("==============================");
		
		int total1 = p1.getPrice() + (int)(p1.getPrice() * p1.getTax());
		int total2 = p2.getPrice() + (int)(p2.getPrice() * p2.getTax());
		int total3 = p3.getPrice() + (int)(p3.getPrice() * p3.getTax());
		
		System.out.println("상품명: " + p1.getProductName());
		System.out.println("부가세 포함가격 : " + total1 + "원" );
		
		System.out.println("상품명: " + p2.getProductName());
		System.out.println("부가세 포함가격 : " + total2 + "원" );
		
		System.out.println("상품명: " + p3.getProductName());
		System.out.println("부가세 포함가격 : " + total3 + "원" );
		
	}

}
