package project0416;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		// Java는 동일한 문자열로 판단되므로 한번만 저장됨
		// String에서 문자열이 같으면 hashCode(), equals() true로 리턴
		// 동등객체로 판단될 시 중복 저장되지 않음
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		int size = set.size();
		System.out.println("총 객체수 : " + size); //4
		// 반복자 생성 : 전체 객체를 대상으로 한번씩 반복해서 가져올 수 있도록 해줌
		Iterator<String> iterator = set.iterator();
		// 꺼내올 항목이 있다면
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		// 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체수 : " + set.size());
		// 향상된 for문을 이용해서 출력 가능
		for(String element : set) {
			System.out.println("\t" + element);
		}
		// 모든 객체를 제거하고 비움
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
