package project0417;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		Member m = new Member("홍길동", 30);
		System.out.println(m.hashCode());
		
		Member m2 = new Member("홍길동", 30);
		System.out.println(m2.hashCode());
		
		set.add(m);
		
		// 나이와 이름이 동일하므로 인스턴스가 다르더라도
		// hashCode(), equals() true 값을 리턴하므로
		// 동등객체로 판단하여 중복 저장되지 않음
		set.add(new Member("홍길동", 30));
		System.out.println("총 객체수 : " + set.size());
	}
}
