package unit_conversion_calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		UnitConvesion converter = new UnitConvesion();
		History history = new History();
		Number Num = new Number();
		
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("| 1.단위 변환 | 2.이전 결과 | 3.종료 |");
			System.out.println("---------------------------------");
			System.out.print("메뉴 선택 : ");
			String menu = scanner.nextLine();
			
			if(menu.equals("1")) {
				System.out.println("------------------------------------------");
				System.out.println("| 1.달러 | 2.엔 | 3.인치 | 4. 파운드 | 5. 평 |");
				System.out.println("------------------------------------------");
				System.out.print("단위 선택 : ");
				String unit = scanner.nextLine();
				
				// 아래 if문을 추가하지 않았을 때 : 
				// 예를 들어 7을 입력하면 바로 else로 가서 걸러주는게 아니라 값 입력까지 받고 "잘못된 단위 선택입니다."가 출력됨
				// if문을 추가하면 값 입력 받기 전 출력
				if (!(unit.equals("1") || unit.equals("2") || unit.equals("3") || unit.equals("4") || unit.equals("5"))) {
					System.out.println("잘못된 단위 선택입니다.");
                    continue;
				}
				
				System.out.print("값 입력 : ");
				String input = scanner.nextLine();
				
				// 입력 값이 숫자인지 아닌지 판별
				if (!Num.isNumber(input)) {
                    System.out.println("잘못된 입력 값입니다.");
                    continue;
                }
				
				// 시간 지연
				System.out.println("결과를 계산 중입니다.");
				Thread.sleep(1000);
				
				// sting타입인 input을 double로 바꿔줌
				double value = Double.parseDouble(input);
				
				String result = "";
				// 결과 값은 소수점 둘째 자리까지 반올림 : Math.round() 사용
				if(unit.equals("1")) {
					result = value + "$ -> " + Math.round(converter.Won_d(value) * 100) / 100.0 + " 원";
				} else if(unit.equals("2")) {
					result = value + "￥ -> " + Math.round(converter.Won_y(value) * 100) / 100.0 + " 원";
				} else if(unit.equals("3")) {
					result = value + "inch -> " + Math.round(converter.Cm(value) * 100) / 100.0 + " cm";
				} else if(unit.equals("4")) {
					result = value + "lb -> " + Math.round(converter.Kg(value) * 100) / 100.0 + " kg";
				} else if(unit.equals("5")) {
					result = value + "평 -> " + Math.round(converter.Meter(value) * 100) / 100.0 + " m2";
				} else {
					System.out.println("잘못된 단위 선택입니다.");
                    continue;
				}
				
				System.out.println("결과 : " + result + "입니다.");
				history.save(result);
			
		// 2번 선택했을 때 이전 결과 전부 불러오기		
		} else if (menu.equals("2")) {
			history.printAll();
				
		// 3번 선택했을 때 종료
		} else if (menu.equals("3")) {
            System.out.println("종료합니다.");
            break;
            
		} else {
            System.out.println("올바른 메뉴를 입력하세요.");
        }
    }

    scanner.close();
}
}
