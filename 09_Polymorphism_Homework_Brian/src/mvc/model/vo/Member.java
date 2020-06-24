package mvc.model.vo;

public class Member {
	
	//field
	private String name;	//ȸ����
	private int age;		//ȸ������
	private char gender; 	//����
	private int couponCount; //�丮�п��������� = 0 

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
		return "ȸ������: " + name + ", ����: " + age + ", ����: " + gender; 
	}
}







