package project0417;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx03 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("puess");
		treeSet.add("cherry");
		
		System.out.println("[c~f 사이의 단어 검색]");
		
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}
