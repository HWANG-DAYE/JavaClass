package project0417;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Object는 최소 조상으로 어떠한 객체도 매개변수로 가능
	public boolean equals(Object obj) {
		// Member 타입인지 확인
		if(obj instanceof Member) {
			// Object -> Member로 강제 타입 변환
			Member member = (Member) obj;
			// 이름과 나이가 동일하다면 true 리턴
			return member.name.equals(name) && (member.age==age) ;
		} else {
			return false;
		}
	}
	public int hashCode() {
		// 같은 문자열이면 hashCode가 같도록 메소드 재정의됨
		return name.hashCode() + age;
	}
}
