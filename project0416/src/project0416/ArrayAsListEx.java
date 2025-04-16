package project0416;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {
	public static void main(String[] args) {
		List<String>list1 = Arrays.asList("이지금","이지은","이지동");
		for(String name : list1) {
			System.out.println(name);
		}
		// 고정된 객체들로 구성된 lst로 추가 삭제가 지원되지 않음
//		list1.add("아이유");
//		list1.remove(2);
//		list1.remove("오애순");
		
		// 자동 박싱 (int -> Integer)
		List<Integer>list2 = Arrays.asList(1,2,3);
		// 자동 언박싱 (Integer -> int)
		for(int val : list2) {
			System.out.println(val);
		}
		
	}
}
