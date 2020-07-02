package mvc.model;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.controller.BookManager;
import mvc.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();

	public BookMenu() {

	}

	public void mainMenu() {

		while (true) {
			System.out.println("\n===���� ���� ���α׷�===");
			System.out.println("1. �� ���� �߰�"); 	// insertBook()
			System.out.println("2. ���� ����"); 	// deleteBook()
			System.out.println("3. ���� �˻� ���");  // searchBook()
			System.out.println("4. ��ü ���"); 	// selectList()
			System.out.println("0. ������"); 		// ���α׷� ���� �� ����
			System.out.print("�޴� ��ȣ ����: ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertBook();
				break;
			case 2:
				deleteBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				selectList();
				break;
			case 0:
				System.out.println("exit program");
				return;
			default:
				System.out.println("�޴� �ٽ� ���� ���ּ���:");
				break;
			}	
		}
	}

	public void insertBook() {
		System.out.print("���� ���� :");
		String title = sc.nextLine();
		
		System.out.print("���� �帣 (1:�ι� / 2:�ڿ����� /3:�Ƿ�/ 4:��Ÿ) : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� ����:");
		String author = sc.nextLine(); 
		
		Book book = new Book(title, category, author); 
		bm.insertBook(book); 
		System.out.print("\n�߰� �Ϸ�");
		
	}

	public void deleteBook() {
		selectList(); 

		System.out.println("������ȣ:");
		int bNo = sc.nextInt();
		int result = bm.deleteBook(bNo);
		
		if(result == 1) {
			System.out.println("���������� ����");
		}else {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		}
			
	}

	public void searchBook() {

		System.out.println("���� ���� : ");
		String title = sc.nextLine();
		ArrayList<Book> searchList = bm.searchBook(title);
		
		if(searchList.isEmpty()) {
			System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
		}else {
			//for(Book bk : searchList) {
				//System.out.println(bk);
			
			for(int i=0; i<searchList.size();i++) {
				System.out.println(searchList.get(i));
			}
		}
	}

	public void selectList() {
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("��������� �������� �ʽ��ϴ�.");
		} else {
			for(Book bk1 : bookList) {
				System.out.println(bk1);
			}
		}
			
	}
}
