package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	
	// 최대 회원 수 10
	public static final int SIZE = 10;	
	
	// 현재 회원의 수 
	private int memberCount;	// 현재 회원 수 
	
	private Member[] mem = new Member[SIZE];  // 회원 객체 배열
	
	{
		mem[0] = new Member("user01", "pass01","김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5; 
	}
	
	public int getMemberCount() {	// 위 초기화 블럭 리턴 
		return memberCount;
	}
	
	public Member[] getMem() {		// 회원 객체 배열 리턴 
		
		return mem; 
	}
	
	public Member checkId(String userId) {	// 아이디로 검색된 결과를 담을 변수 초기화
		Member m = null;  // 전달 받은 회원의 아이디와 일치하는 회원 객체를 보관할 변수 
		for(int i=0;i<memberCount;i++) {
			if(userId.equals(mem[i].getuserId())) {
				m = mem[i];
				
			}
		}
			
		return m; 
	}

	public void insertMember(Member m) {
		
		mem[memberCount++] = m;			
	}//e.inserMember
	
	
	public Member[] searchMember(int menu, String search) {
		
		Member searchMember = null; // 검색된 회원 정보를 담을 변수 초기화
		
		for(int j=0; j<memberCount; j++) {	// 회원  들 중 
			
			if(menu == '1' && mem[j].getuserId().equals(search)) {
				searchMember = mem[j];
				
			} else if (menu == '2' && mem[j].getName().equals(search)) { 	// 메뉴 검색과 회원 수에 내용과 동일할때 
				searchMember = mem[j];
				
			} else if (menu =='3' && mem[j].getEmail().equals(search) {
				searchMember = mem[j];
				
			} else {
				
			}
			
		}//e.for
		
		
		return ; // 잠시 
	}
	
}
