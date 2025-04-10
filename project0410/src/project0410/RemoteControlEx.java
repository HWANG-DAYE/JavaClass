package project0410;

public class RemoteControlEx {
	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl() {
//			public void MyFunc() {System.out.println("내가 만든 함수 ㅎㅎ");}
//			@Override
//			public void turnOn() {System.out.println("전원 on");}
//			@Override
//			public void turnOff() {System.out.println("전원 off");}
//			@Override
//			public void setVolume(int volume) {System.out.println("볼륨조절");}
//		};
//		
//		rc.turnOff();
//		rc.turnOn();
//		rc.setVolume(5);
//		
//		RemoteControl rc2 = new RemoteControleImpl();
//		rc2.turnOff();
//		rc2.turnOn();
//		rc2.setVolume(2);
//		
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
