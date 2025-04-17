package project0417;

import java.util.Objects;

public class Student {
	private int sno;
	private String name;
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	// equals 메소드 재정의
	public boolean equals(Object obj) {
		// 학생타입인지 확인 
		if(obj instanceof Student) {
			// Object -> Student타입으로 강제 타입 변환 
			Student s = (Student) obj;
			// 학번이랑 이름이 같은지를 반환 
			return sno==s.sno && name.equals(s.name);
		}
		return false;
		 
	}

	// 해시코드는 학번이므로 학번을 리턴하도록 
	public int hashCode() {
		return Objects.hash(name, sno);
	}

	@Override
	public String toString() {
		return "이름 : " + name + "\n학번 : " + sno;
	}

}



