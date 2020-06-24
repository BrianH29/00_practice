package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{
		list[0] = new Book("�ڹ��� ����", "���ӽ� ����", "����", new Date(2018-1900, 4-1, 15), 20000);
		list[1] = new Book("�����е� �����Ҳ�����", "������", "KH", new Date(2019-1900, 6-1, 15), 30000);
		list[2] = new Book("API�� ����", "������", "KH", new Date(2017-1900, 2-1, 13), 15000);
		list[3] = new Book("����� ���α׷���", "������", "���е���", new Date(2016-1900, 8-1, 30), 10000);
	} 	// �ʱ�ȭ ��� { } �̴�. 
	
	public BookController() {}
	
	// 1. ���� ��ü ��� ��� �޼ҵ�
	public void printAll() {
		for(Book lists : list) {
			System.out.println(lists); 
		}
		
		
	}	//e.printAll
	
	
	
	// 2. ���� �߰� ��� �޼ҵ�
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. �Ű������� ���޹��� newPrice��  ==>      String --> int�� ��ȯ �۾�
		int price = Integer.parseInt(newPrice);
		
		
		// --------------------------------------------------------
		// 2. �Ű������� ���޹��� newDate��   ==>       String --> Date�� ��ȯ �۾�
		//	  '-'�� �����ڷ� StringTokenizer�� �̿��Ͽ� ���ڿ� �и� �� ���� ��,��,�� �� Date�� ����
		
		
		StringTokenizer stn = new StringTokenizer(newDate, "-");
		int year = Integer.parseInt(stn.nextToken());
		int month = Integer.parseInt(stn.nextToken());
		int day = Integer.parseInt(stn.nextToken());
		
		Date date = new Date(year-1900, month-1, day);
		
		// ------------------------------------------------------
		// 3. ������ ���޹��� ����� ������ ��ȯ�۾��� ���� price�� date���� ������
		//	  �Ű����� �����ڸ� ���� ������ �� 4�� �ε����� ����
		list[4] = new Book(newTitle, newAuthor, newPublisher, date, price);
		
	
	}
	
	
	// 3. ���� �Ⱓ�� ��� ��� �޼ҵ�
	public void printBookPublishDate() {
		// ������ ������ �Ⱓ�� ���
		// "xxxx�� xx�� xx�� �Ⱓ" �� ���� �������� ���
		
		// SimpleDateFormat�� �̿��Ͽ� ���
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String newDate1 = sdf.format(list[4].getPublishDate());
		System.out.println(newDate1);
	
		
		
	}
	
	
	// 4. ���� �˻� ��� �޼ҵ�
	public void searchBook(String searchTitle) {
		
		// ���� ����Ʈ�� ��ü������ ��ȸ�ϸ鼭 (for�� �̿�)
		// ���޹��� �˻����� ������!! ������ ���
		
		for(Book lists : list) {
			if(lists.getTitle().contains(searchTitle)) {
				System.out.println(lists);
			}
		}
		
	
		
	}
	
	
	

}
