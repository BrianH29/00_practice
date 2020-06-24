package mvc.model.vo;

public class Book {
	
	//field
	private String title;	//도서명
	private String author; 	//저자명
	private String publisher; //출판사명
	
	//constructor
	public Book() {
		
	}
	
	//parameter
	public Book(String title, String author, String publisher) {
		
	}
	
	//set,get
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "도서명: " + title + ", 저자명: " + author + ", 출판사명: " + publisher;
	}
}






