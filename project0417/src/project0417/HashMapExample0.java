package project0417;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample0 {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		//같은 키값을 저장할 경우, 마지막 값으로 대체 
		System.out.println("총 Entry 수: " + map.size()); // 3
		
		//객체 찾기		
		System.out.println("\t홍길동 : " + map.get("홍길동")); // 마지막 저장한 95로 저장되는 것을 확인 가능
		System.out.println();
		
		//객체를 하나씩 처리 (Key의 값들을 집합으로 반환 )
		Set<String> keySet = map.keySet(); // Key들의 집합 -> keySet 변수에 저장함
		// 반복자 이용
		System.out.println("-----------반복자 이용 ---------");	
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) { // 다음 항목이 있을 때까지 반복 
		  String key = keyIterator.next();
		  Integer value = map.get(key);
		  System.out.println("\t" + key + " : " + value);
		}
		
		System.out.println();
		System.out.println("-----------향상된 for문 ---------");	
		// 향상된 for문 이용
		for(String key : keySet) {
			  Integer value = map.get(key);
			  System.out.println("\t" + key + " : " + value);
		}
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size()); // 2
		System.out.println();


		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("-----------향상된 for문 ---------");	
		for( Map.Entry<String, Integer> entry : entrySet ) {
			System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("-----------반복자 이용 ---------");	
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
		  Map.Entry<String, Integer> entry = entryIterator.next();
		  String key = entry.getKey();
		  Integer value = entry.getValue();
		  System.out.println("\t" + key + " : " + value);
		}
		
		System.out.println();
		

		
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}

