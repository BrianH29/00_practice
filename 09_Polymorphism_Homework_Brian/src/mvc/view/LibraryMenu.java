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
		//�̸�,����,������ Ű����� �Է� ���� �� Member ��ü ����
		// LIbraryManager�� insertMember() �޼ҵ忡 ����
		
		while(true) {	// ���� �ݺ� ���� 
			
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(m/f): ");
		char gender = sc.next().charAt(0);
		
		lm.insertMember(new Member(name, age, gender));
		
		System.out.println("====�޴�====");
		System.out.println("1. ���������� ");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� �˻� ");
		System.out.println("4. ���� �뿩�ϱ� ");
		System.out.println("0. ���α׷� �����ϱ�");
		System.out.println("�޴� ����: ");
		int menu = sc.nextInt(); 
		sc.nextLine();
		
		switch(menu) {
		case 1 : myInfo(); break;
		case 2 : selectAll(); break;
		case 3 : searchBook(); break;
		case 4 : rentBook(); break; 
		case 0 : System.out.println("exit program"); return;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է½����ּ���."); 
		
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
		
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine(); 
		
		Book[] searchList = lm.searchBook(keyword);
		
		int count = 0;
		for(Book sl : searchList) {
			if(sl != null) {
				System.out.println(sl);
				count++;
			}
			
			if(count == 0) {
				System.out.println("�˻��� å�� �����ϴ�.");
			}
		}
		
	}
	public void rentBook() {
		selectAll();
		
		System.out.println("�뿩�� ���� ��ȣ ����:");
		int num = sc.nextInt(); 
		
		
	}
}
