//3. for ���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ����ϴ� �ڵ带 �ۼ��غ�����.

package project0325;

public class Question01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 3; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("3�� ����� ������ : " + sum + "�Դϴ�.");
		
	}
}
