package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

public class LibraryMenu {

	//field
	private LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	//method
	public void mainMenu() {
		//이름,나이,성별을 키보드로 입력 받은 후 Member 객체 생성
		// LIbraryManager의 insertMember() 메소드에 전달
		
		while(true) {	// 무한 반복 실행 
			
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(m/f): ");
		char gender = sc.next().charAt(0);
		
		lm.insertMember(new Member(name, age, gender));
		
		System.out.println("====메뉴====");
		System.out.println("1. 마이페이지 ");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 ");
		System.out.println("4. 도서 대여하기 ");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("메뉴 선택: ");
		int menu = sc.nextInt(); 
		sc.nextLine();
		
		switch(menu) {
		case 1 : myInfo(); break;
		case 2 : selectAll(); break;
		case 3 : searchBook(); break;
		case 4 : rentBook(); break; 
		case 0 : System.out.println("exit program"); return;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력시켜주세요."); 
		
		} //e.switch
		
		} // e.loop
			
	}//e.mainMenu
	
	public void selectAll() {
		Book[] bList = lm.selectAll();
		for(int i=0; i<lm.selectAll().length;i++) {
			System.out.println(bList[i]);
		}
		
	}
	public void searchBook() {
		
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine(); 
		
		Book[] searchList = lm.searchBook(keyword);
		
		int count = 0;
		for(Book sl : searchList) {
			if(sl != null) {
				System.out.println(sl);
				count++;
			}
			
			if(count == 0) {
				System.out.println("검색된 책이 없습니다.");
			}
		}
		
	}
	public void rentBook() {
		selectAll();
		
		System.out.println("대여할 도서 번호 선택:");
		int num = sc.nextInt(); 
		
		
	}
}
