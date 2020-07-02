package mvc.model.view;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.controller.MusicController;
import mvc.model.vo.Music;

public class MusicMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	
	/**
	 * first main page for selection
	 */
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 신규 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("6. 곡 정렬하기 ");
			System.out.println("0. 프로그램종료");
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt(); 
			sc.nextLine(); 
			
			System.out.println();
			
			switch(menu) {
			case 1 :  insertMusic(); break;
			case 2 :  selectList(); break;
			case 3 :  searchMusic(); break;
			case 4 :  deleteMusic(); break;
			case 5 :  updateMusic(); break;
			case 6 :  sortMusic(); break; 
			case 0 : System.out.println("end of program"); return; 
			default : System.out.println("잘못 입력하셧습니다. 다시 이렵해주세요.");
			}//e.switch
		}//e.while
	}
	
	public void insertMusic() {
		
		System.out.println("====곡 추가====");
		System.out.print(" 곡명 입력: " );
		String title = sc.nextLine(); 
		
		System.out.println("가수 입력: ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title,artist); // ---> controller 보내서 list에 저장
		System.out.println("saved"); // --> check function
		
	}
	
	public void selectList() {
		System.out.println("==== List ====");
		
		ArrayList<Music> list = mc.selectList();
		
		if(list.isEmpty()) {
			System.out.println("no list found");
		} else {
			for(Music sl : list) {
				System.out.println(sl);
			}
		} //e.if
		
 		
	}//e.selectList
	
	public void searchMusic() {
		System.out.println("=== Search List ===");
		
		System.out.println("1. 곡명으로 검색");
		System.out.println("2. 가수명으로 검색");
		System.out.println("3. 곡명 + 가수명으로 검색");
		System.out.print("메뉴: ");
		int search = sc.nextInt();
		
		System.out.print("검색할 키워드:");
		String keyword = sc.nextLine();
		
		
	}

}










