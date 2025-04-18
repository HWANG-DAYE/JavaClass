package project0418;

public class Student {
	private String name;
	private int grade;
	private int ban;
	private int num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getBan() {
		return ban;
	}
	
	public Student() {
		super();
	}
	
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Student(String name, int grade, int ban, int num) {
		super();
		this.name = name;
		this.grade = grade;
		this.ban = ban;
		this.num = num;
	}
	@Override
	public String toString() {
		return grade + "학년" + ban + "반" + num + "번" + name;
	}
	
}
