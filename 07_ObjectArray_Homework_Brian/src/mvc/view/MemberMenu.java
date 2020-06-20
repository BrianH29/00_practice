package mvc.view;

import mvc.model.vo.Member;
import java.util.Scanner;

import mvc.controller.MemberController;

public class MemberMenu {
	// ��ü ���� + �Է°� ���ɳ� ����
	private MemberController mc = new MemberController();
	Member mm = new Member();
	
	
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {

			System.out.println("\n===ȸ�� ���� �޴� ===");

			System.out.println("1.�ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ����: ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertMember();
				break;
			case 2:
//				searchMember();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 9:
				System.out.println("���α׷� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}// e.switch
			
		} // e.loop

	}// e.mainMenu

	/**
	 * �޴�1. ȸ�� ���� �Է� �ޱ�
	 */
	public void insertMember() {

		if(mc.getMemberCount() == MemberController.SIZE) {
			System.out.println("���ѵ� ȸ������ �ʰ��߽��ϴ�.");
		}
		
		
		while(true) {
			
		System.out.println("\n===�ű� ȸ�� ���===");
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		
		Member overlap = mc.checkId(userId);
		if(overlap != null) {
			System.out.println("������ ���̵� �����մϴ�. ȸ����� ����\n" + mc.checkId(userId));
			continue;
		}

		System.out.print("��й�ȣ : ");
		String userPwd = sc.nextLine();

		System.out.print("�̸�: ");
		String name = sc.nextLine();

		System.out.print("����: ");
		int age = sc.nextInt();

		System.out.print("����: ");
		char gender = sc.next().charAt(0);
		sc.nextLine();

		System.out.print("�̸���: ");
		String email = sc.nextLine();

		int result = mc.insertMember(userId, userPwd, name, age, gender, email);
		if (result == 1) {
			System.out.println("ȸ������ ���ϵ帳�ϴ�.");
			break;
		}

		
		}

	} // e.insertMember

//	public void searchMember
	{

	}

}