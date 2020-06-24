package mvc.model.vo;

public class Member {
	
	//field
	private String name;	//회원명
	private int age;		//회원나이
	private char gender; 	//성별
	private int couponCount; //요리학원쿠폰개수 = 0 

	//constructor
	public Member() {
		
	}
	
	//parameter
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//set,get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender; 
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "회원성함: " + name + ", 나이: " + age + ", 성별: " + gender; 
	}
}







