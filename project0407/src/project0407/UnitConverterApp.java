package project0407;

	import java.util.Scanner;

	public class UnitConverterApp {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String history = "";  // 결과 이력 저장용 문자열

	        while (true) {
	            System.out.println("\n=== 단위 변환 계산기 ===");
	            System.out.println("1. 값 변환");
	            System.out.println("2. 이전 결과 확인");
	            System.out.println("3. 종료");
	            System.out.print("번호를 선택하세요: ");
	            String menuInput = scanner.nextLine();

	            if (menuInput.equals("1")) {
	                System.out.println("1. 달러 → 원");
	                System.out.println("2. 평 → 제곱미터");
	                System.out.println("3. 인치 → 센티미터");
	                System.out.println("4. 파운드 → 킬로그램");
	                System.out.print("단위를 선택하세요: ");
	                String unitInput = scanner.nextLine();

	                System.out.print("변환할 값을 입력하세요: ");
	                String valueInput = scanner.nextLine();

	                // 숫자인지 직접 확인
	                boolean isNumeric = true;
	                for (int i = 0; i < valueInput.length(); i++) {
	                    char c = valueInput.charAt(i);
	                    if (!Character.isDigit(c) && c != '.') {
	                        isNumeric = false;
	                        break;
	                    }
	                }

	                if (!isNumeric || valueInput.equals("")) {
	                    System.out.println("잘못된 입력 값입니다.");
	                    continue;
	                }

	                double value = Double.parseDouble(valueInput);
	                if (value < 0) {
	                    System.out.println("음수는 자동으로 절대값으로 변환됩니다.");
	                    value = Math.abs(value);
	                }

	                // 시간 딜레이 효과
	                System.out.println("결과를 계산 중입니다. 잠시만 기다려주세요...");
	                try {
	                    Thread.sleep(1000);  // 1초 대기
	                } catch (InterruptedException e) {
	                    // 예외 발생 시 무시
	                }

	                String result = "";

	                switch (unitInput) {
	                    case "1":
	                        result = value + " 달러 → " + (value * 1350) + " 원";
	                        break;
	                    case "2":
	                        result = value + " 평 → " + (value * 3.3) + " 제곱미터";
	                        break;
	                    case "3":
	                        result = value + " 인치 → " + (value * 2.54) + " 센티미터";
	                        break;
	                    case "4":
	                        result = value + " 파운드 → " + (value * 0.453592) + " 킬로그램";
	                        break;
	                    default:
	                        System.out.println("올바른 번호를 선택하세요.");
	                        continue;
	                }

	                System.out.println("결과: " + result + "입니다.");
	                history += result + "입니다.\n";

	            } else if (menuInput.equals("2")) {
	                System.out.println("=== 이전 결과 이력 ===");
	                if (history.equals("")) {
	                    System.out.println("저장된 결과가 없습니다.");
	                } else {
	                    System.out.println(history);
	                }

	            } else if (menuInput.equals("3")) {
	                System.out.println("프로그램을 종료합니다.");
	                break;

	            } else {
	                System.out.println("올바른 메뉴 번호를 입력하세요.");
	            }
	        }

	        scanner.close();
	    }
	}

