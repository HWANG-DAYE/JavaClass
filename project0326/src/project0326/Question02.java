package project0326;

public class Question02 {
	public static void main(String[] args) {
	char ch = 'A';
	
	char lowerCase = (ch>='A' && ch<='Z') ? ((char)(ch+32)) : ch;
	
	System.out.println("ch:"+ch);
	System.out.println("ch to lowerCase:"+lowerCase);
	}
}
