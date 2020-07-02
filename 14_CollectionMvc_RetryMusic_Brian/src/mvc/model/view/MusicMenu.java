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
			System.out.println("1. �ű� �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. �� �����ϱ� ");
			System.out.println("0. ���α׷�����");
			System.out.println("�޴� ����: ");
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
			default : System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ� �̷����ּ���.");
			}//e.switch
		}//e.while
	}
	
	public void insertMusic() {
		
		System.out.println("====�� �߰�====");
		System.out.print(" ��� �Է�: " );
		String title = sc.nextLine(); 
		
		System.out.println("���� �Է�: ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title,artist); // ---> controller ������ list�� ����
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
		
		System.out.println("1. ������� �˻�");
		System.out.println("2. ���������� �˻�");
		System.out.println("3. ��� + ���������� �˻�");
		System.out.print("�޴�: ");
		int search = sc.nextInt();
		
		System.out.print("�˻��� Ű����:");
		String keyword = sc.nextLine();
		
		
	}

}










