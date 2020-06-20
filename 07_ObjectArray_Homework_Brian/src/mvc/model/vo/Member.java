package mvc.model.vo;

public class Member {
	
	//1.�ʵ�
	private String userId;
	private String userPwd;
	private String name;
	private int age;
	private char gender;
	private String email;
	
	//2.������
	public Member() {
		
	}
	
	//3.�޼ҵ������
	public Member(String userId, String userPwd, String name, int age, char gender, String email) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	//4.setter - ���� 
	public void setuserId(String userId) {
		this.userId = userId;
	}
	public void setuserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//5.getter - ��ȸ 
	public String getuserId() {
		return userId;
	}
	public String getuserPwd()	{
		return userPwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender()	{
		return gender;
	}
	public String getEmail() {
		return email;
	}
	
	//6.info
	public String info() {
		return "���̵� :" + userId +",��й�ȣ :" +userPwd+", �̸�:"+name+ ", ����:"+age+", ����:"+gender+", �̸���:"+email;
	}

}
