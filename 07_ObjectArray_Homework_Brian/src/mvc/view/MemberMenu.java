package mvc.view;

import mvc.model.vo.Member;
import java.util.Scanner;

import mvc.controller.MemberController;

public class MemberMenu {
	// 객체 생성 + 입력값 스케너 생성
	private MemberController mc = new MemberController();
	Member mm = new Member();

	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {

			System.out.println("\n===회원 관리 메뉴 ===");

			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택: ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 9:
				System.out.println("프로그램 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}// e.switch

		} // e.loop

	}// e.mainMenu

	/**
	 * 메뉴1. 회원 정보 입력 받기
	 */
	public void insertMember() {

		int memberCount = mc.getMemberCount();

		if (memberCount >= MemberController.SIZE) {
			System.out.println("회원 수를 초과했습니다.");
			return;

			System.out.println("\n===신규 회원 등록===");
			System.out.print("아이디 : ");
			String userId = sc.nextLine();

			member m = mc.checkId(userId);

			if (m != null) {
				System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			} else {

				System.out.print("비밀번호 : ");
				String userPwd = sc.nextLine();

				System.out.print("이름: ");
				String name = sc.nextLine();

				System.out.print("나이: ");
				int age = sc.nextInt();

				System.out.print("성별: ");
				char gender = sc.next().charAt(0);
				sc.nextLine();

				System.out.print("이메일: ");
				String email = sc.nextLine();

				Member newMem = new Member(userId, userPwd, name, age, gender, email);
				mc.insertMember(newMem);
				
				}

			}
		}

	} // e.insertMember

	public void searchMember() { // s.searchMemeber

		while (true) {
			System.out.println("=====회원 정보 검색======");

			System.out.print("1. 아이디로 검색하기");
			System.out.print("2. 이름으로 검색하기");
			System.out.print("3. 이메일로 검색하기");
			System.out.print("9. 이전 메뉴로");

			System.out.print("메뉴 선택");
			sc.nextInt();

		}

	}// e.searchMember

}
