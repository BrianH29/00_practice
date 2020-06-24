package mvc.model.vo;

public class CookBook extends Book{

	//field
	private boolean coupon;	// �丮�п���������
	
	//constructor
	public CookBook() {
		
	}
	
	//parameter
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title,author,publisher);
		this.coupon = coupon;
	}
	
	//set get
	public boolean getCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", �丮�п���������:" + coupon; 
	}
}
