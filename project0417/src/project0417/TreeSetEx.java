package project0417;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(Integer.valueOf(87));
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		Integer score = null;

		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);

		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");

		score = scores.lower(95);
		System.out.println("95점 아래 점수: " + score);

		score = scores.higher(Integer.valueOf(95));
		System.out.println("95점 위의 점수: " + score + "\n");

		score = scores.floor(95);
		System.out.println("95점 이거나 바로 아래 점수: " + score);

		score = scores.ceiling(85);
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");
		
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			// 객체의 값만 읽어올뿐 제거되지는 않음 제거하고 싶다면 iterator.remove 호출 필요
			score = iterator.next();
			System.out.println(score + "(남은 객체 수: " +scores.size() + ")");
		}
		
	}
}
