package project0326;

public class String01 {
	public static void main(String[] args) {
		String str1 = "�Ź�ö";
		String str2 = "�Ź�ö";
		
		if(str1==str2) {
			System.out.println("str1�� str2�� ���� ��ü�� ����");
		}
		else {
			System.out.println("str1�� str2�� �ٸ� ��ü�� ����");
		}
		
		String str3 = new String("�Ź�ö");
		String str4 = new String("�Ź�ö");
		
		if(str3==str4) {
			System.out.println("str3�� str4�� ���� ��ü�� ����");
		}
		else {
			System.out.println("str3�� str4�� �ٸ� ��ü�� ����");
		}
		if (str3.equals(str4)) {
			System.out.println("str3�� str4�� ���� ���ڿ� �Դϴ�.");
		}
	}
}
