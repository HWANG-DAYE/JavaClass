package project0416;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i)); // 특정 위치에 삽입하므로 뒤쪽 인덱스들은 추가할 때마다 1씩 증가하는 시간이 필요
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime-startTime) + " ns");
		
		// 앞 뒤 링크 정보만 변경하면 됨
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime-startTime) + " ns");
	}
	// 앞뒤 링크 정보만 변경하면 되는 LinkedList 실행 속도가 더 빠른 것을 확인 가능
}
