package project0409;

public class Member {
	private String member;
	private String id;
	private String pwd;
	private String name;
	private String phone;
	
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Member(String member, String id, String pwd, String phone) {
		super();
		this.member = member;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
	}
	
	
	
}
