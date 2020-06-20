package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	
	// �ִ� ȸ�� �� 10
	public static final int SIZE = 10;	
	
	// ���� ȸ���� �� 
	private int memberCount;	// ���� ȸ�� �� 
	
	private Member[] mem = new Member[SIZE];  // ȸ�� ��ü �迭
	
	{
		mem[0] = new Member("user01", "pass01","������", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "�̼���", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "������", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "�����ҹ�", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "�Ż��Ӵ�", 45, 'F', "shin@naver.com");
		memberCount = 5; 
	}
	
	public int getMemberCount() {	// �� �ʱ�ȭ ���� ���� 
		return memberCount;
	}
	
	public Member[] getMem() {		// ȸ�� ��ü �迭 ���� 
		
		return mem; 
	}
	
	public Member checkId(String userId) {	// ���̵�� �˻��� ����� ���� ���� �ʱ�ȭ
		Member m = null; 
		for(int i=0;i<memberCount;i++) {
			if(userId.equals(mem[i].getuserId())) {
				m = mem[i];
				
			}
		}
			
		return m; 
	}

	public int insertMember(String userId, String userPwd, String name, int age, char gender, String email) {
		
		int result = 0;
		if(memberCount<mem.length) {
			mem[memberCount++] = new Member(userId, userPwd, name, age, gender, email);
			result = 1;
		} else {
			result = 0;
		}
		
		return result;
			
	}//e.inserMember
	
	
}