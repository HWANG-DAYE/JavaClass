package project0414;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Member 타입인지 확인
		if(obj instanceof Member) {
			// 강제 타입 변환
			Member m = (Member)obj;
			// id필드값이 동일하다면 true
			// id.equals(m.id) -> String에서 재정의한 equals 메소드
			if(id.equals(m.id)) {
				return true;
			}
		}
		// 그 외의 나머지 모든 경우는 false 리턴
		return false;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
