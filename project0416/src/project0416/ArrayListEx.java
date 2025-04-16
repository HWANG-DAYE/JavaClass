package project0416;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		// String 객체 저장
		List<String> list = new ArrayList<String>();
		// ArrayList에 객체를 추가하면 인덱스 0부터 차례대로 저장됨
		list.add("Java");	// 0-Java
		list.add("JDBC");	// 1-JDBC
		list.add("Servlet/JSP");	// 2-Servlet/JSP
		list.add(2, "Database");	// 해당 인덱스에 추가되므로, 뒤에 인덱스부터 모두 1씩 밀려남
		list.add("iBATIS");

		int size = list.size();	// 저장된 총 객체수를 얻을 수 있음
		System.out.println("총 객체 수 : " + size);
		System.out.println();

		String skill = list.get(2);	// 인덱스 2번에 저장된 객체 얻기
		System.out.println("2 : " + skill);
		System.out.println();

		for (int i = 0; i < size; i++) {	// 저장된 객체수만큼 반복
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		list.remove(2);	// 인덱스 2번 객체 삭제, 뒤에 인덱스부터 앞으로 1씩 당겨짐
		list.remove(2);	// 인덱스 2번 객체 삭제, 뒤에 인덱스부터 앞으로 1씩 당겨짐
		list.remove("iBATIS");

		// 향상된 for문 이용 가능, list에서 하나씩 꺼내와서
		// String s에 저장됨 - 인덱스를 사용하지 않아도 되는 경우에 주로 사용(값만 필요)
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();

	}
}
