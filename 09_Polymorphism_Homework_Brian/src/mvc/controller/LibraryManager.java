package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {

	//field
	private Member mem = null;	// null로 명시최기화
	private Book[] bList = new Book[5]; // 크기 5 할당
	
	//초기화 블록을 이용하여 샘플 데이터 초기화
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvn", true);
		bList[1] = new AniBook("한번 더 해요 ", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "Japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석의 날 따라해봐", "최현석", "소금책", true);
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
