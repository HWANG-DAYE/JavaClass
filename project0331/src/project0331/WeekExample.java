package project0331;
import java.util.Calendar;
public class WeekExample {
	public static void main(String[] args) {
		//Week �뿴嫄� ���엯 蹂��닔 �꽑�뼵
		Week today = null;
 
		//Calendar �뼸湲�
		Calendar cal = Calendar.getInstance();
		
		//�삤�뒛�쓽 �슂�씪 �뼸湲�(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1:�씪 2:�썡 3:�솕 4:�닔 5:紐� 6:湲� 7:�넗

		//�닽�옄瑜� �뿴嫄� �긽�닔濡� 蹂��솚�빐�꽌 蹂��닔�뿉 ���엯
		switch(week) {
			case 1: today = Week.SUNDAY ; break;
			case 2: today = Week.MONDAY ; break;
			case 3: today = Week.TUESDAY ; break;
			case 4: today = Week.WEDNESDAY ; break;
			case 5: today = Week.THURSDAY ; break;
			case 6: today = Week.FRIDAY ; break;
			case 7: today = Week.SATURDAY ; break;
		}
		System.out.println("�삤�뒛 �슂�씪 : " + today);
		//�뿴嫄� ���엯 蹂��닔瑜� �궗�슜
		if(today == Week.SUNDAY) {
			System.out.println("�씪�슂�씪");
		} else {
			System.out.println("�뿴�떖�엳 �옄諛붾�� 怨듬��빀�땲�떎.");
		}
	}
}