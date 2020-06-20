package mvc.model.vo;

public class Member {
	
	//1.필드
	private String userId;
	private String userPwd;
	private String name;
	private int age;
	private char gender;
	private String email;
	
	//2.생성자
	public Member() {
		
	}
	
	//3.메소드생성자
	public Member(String userId, String userPwd, String name, int age, char gender, String email) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	//4.setter - 수정 
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

	//5.getter - 조회 
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
		return "아이디 :" + userId +",비밀번호 :" +userPwd+", 이름:"+name+ ", 나이:"+age+", 성별:"+gender+", 이메일:"+email;
	}

}
