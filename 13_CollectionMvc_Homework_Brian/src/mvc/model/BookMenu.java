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
			System.out.println("\n===도서 관리 프로그램===");
			System.out.println("1. 새 도서 추가"); 	// insertBook()
			System.out.println("2. 도서 삭제"); 	// deleteBook()
			System.out.println("3. 도서 검색 출력");  // searchBook()
			System.out.println("4. 전체 출력"); 	// selectList()
			System.out.println("0. 끝내기"); 		// 프로그램 종료 후 리턴
			System.out.print("메뉴 번호 선택: ");
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
				System.out.println("메뉴 다시 선택 해주세요:");
				break;
			}	
		}
	}

	public void insertBook() {
		System.out.print("도서 제목 :");
		String title = sc.nextLine();
		
		System.out.print("도서 장르 (1:인문 / 2:자연과학 /3:의료/ 4:기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 저자:");
		String author = sc.nextLine(); 
		
		Book book = new Book(title, category, author); 
		bm.insertBook(book); 
		System.out.print("\n추가 완료");
		
	}

	public void deleteBook() {
		selectList(); 

		System.out.println("도서번호:");
		int bNo = sc.nextInt();
		int result = bm.deleteBook(bNo);
		
		if(result == 1) {
			System.out.println("성공적으로 삭제");
		}else {
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}
			
	}

	public void searchBook() {

		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		ArrayList<Book> searchList = bm.searchBook(title);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
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
			System.out.println("도서목록이 존재하지 않습니다.");
		} else {
			for(Book bk1 : bookList) {
				System.out.println(bk1);
			}
		}
			
	}
}
