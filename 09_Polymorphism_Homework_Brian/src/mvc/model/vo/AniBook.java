package mvc.model.vo;

public class AniBook extends Book {

	//field
	private int accessAge;	// 제한나이
	
	//constructor
	public AniBook() {
		
	}
	
	//parameter
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title,author,publisher);
		this.accessAge = accessAge;
	}
	
	//set,get
	public int getAccessAge() {
		return accessAge;
	}
	
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 제한나이: " + accessAge; 
	}
	
}
