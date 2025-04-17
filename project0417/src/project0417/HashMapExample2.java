package project0417;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		System.out.println(map.size());

		// 1. key 집합으로 구현
		Set<Student> keyset = map.keySet();
		Iterator<Student> iterator = keyset.iterator();
		System.out.println("-----------반복자 이용-----------");
		while(iterator.hasNext()) {
			Student k = iterator.next();
			Integer v = map.get(k);
			System.out.println("이름 : " + k.getName());
			System.out.println("학번 : " + k.getSno());
			System.out.println("점수 : " + v);
		}
		System.out.println("-----------향상된 for문 이용-----------");
		for(Student s : keyset) {
			System.out.println(s);
			System.out.println("점수 : " + map.get(s));
		}
		
		// 2. Map.Entry<K, V> 집합으로 구현
		Set<Map.Entry<Student, Integer>> entryset = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> miterator = entryset.iterator();
		System.out.println("-----------반복자 이용-----------");
		while(miterator.hasNext()) {
			Map.Entry<Student, Integer> entry = miterator.next();
			System.out.println(entry.getKey());
			System.out.println("점수 : " + entry.getValue());
		}
		System.out.println("-----------향상된 for문 이용-----------");
		for(Map.Entry<Student, Integer> entry : entryset) {
			System.out.println(entry.getKey());
			System.out.println("점수 : " + entry.getValue());
		}
		
		
		

	}
}
