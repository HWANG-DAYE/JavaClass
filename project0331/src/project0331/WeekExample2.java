package project0331;

import java.util.Calendar;

public class WeekExample2 {
	public static void main(String[] args) {
		//Week ���� Ÿ�� ���� ����
		Week today = null;
		
		//Calendar  ���
		Calendar cal = Calendar.getInstance();
		
		//������ ���� ���(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1:�� 2:��..
		
		//���ڸ� ���� ����� ��ȯ�ؼ� ������ ����
		Week[] arr = {null,Week.SUNDAY, Week.MONDAY, Week.TUESDAY, Week.WEDNESDAY,
					  Week.THURSDAY, Week.FRIDAY, Week.SATURDAY};
		System.out.println("���� ���� : " + arr[week]);
		
		if(arr[week] == Week.SUNDAY) {
			System.out.println("�Ͽ���");
		} else {
			System.out.println("������ �ڹ� ���θ� ���� �ʳ׿�..");
		}
	}
}
