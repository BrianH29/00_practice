package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {

	//field
	private Member mem = null;	// null�� ����ֱ�ȭ
	private Book[] bList = new Book[5]; // ũ�� 5 �Ҵ�
	
	//�ʱ�ȭ ����� �̿��Ͽ� ���� ������ �ʱ�ȭ
	{
		bList[0] = new CookBook("�������� ����", "������", "tvn", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ� ", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "Japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("�������� �� �����غ�", "������", "�ұ�å", true);
	}
	
	// method
	public void insertMember(Member mem) {
		Member mem = new Member(name, age)
	}
	public Member myinfo() {
		return ;
	}
	
	public Book[] selectAll() {
		return;
	}
	public Book[] searchBook() {
		return;
	}
	public int rentBook(int index) {
		return;
	}
	
	
	
}
