package _01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LocalParkingSystem {
	public static void main(String[] args) throws InterruptedException {
		int fee;

		Scanner scanner = new Scanner(System.in);

		// 5*5 주차장에 차량들이 생성됨
		Parking seoul = new Parking();

	
		// 반복문구 시작
		while (true) {
		
			// 시작문구
			System.out.println("\"서울 주차장 시스템에 어서오세요\"");

			System.out.println("원하시는 차고의 행과 열을 골라주세요");
			System.out.println("차고지를 선택하면 해당 차량의 주차요금을 알 수 있습니다.");
			System.out.println("----------------------------------------------------");

			for (int i = 0; i < seoul.parkings.length; i++) {
				System.out.print((i + 1) + " 행| ");
				for (int j = 0; j < seoul.parkings[i].length; j++) {
					System.out.print((j + 1) + "열 " + "차종 : " + seoul.parkings[i][j].getCar().getCarKind() + ", 차번호 : "
							+ seoul.parkings[i][j].getCar().getCarNum() + " ");
				}
				System.out.println();
			}

			System.out.println("----------------------------------------------------");
			try {
				// 차고지 입력받기
				System.out.println("행 입력 : ");
				int a = Integer.parseInt(scanner.nextLine());
				System.out.println("열 입력 : ");
				int b = Integer.parseInt(scanner.nextLine());
				
				if (a == -1 || b == -1) {
					System.out.println("시스템을 종료합니다.");
					break;
				}

				if (a > 0 && a <= 5 && b > 0 && b <= 5) {
					ParkingSpace selectSpace = seoul.parkings[a - 1][b - 1];

					// 주차비용 계산
					int parkingTime = (selectSpace.getParkingTime() + 9) / 10;

					if (selectSpace.getCar().getCarKind().equals("승 용 차")) {
						fee = parkingTime * 700;
					} else if (selectSpace.getCar().getCarKind().equals("경   차")) {
						fee = parkingTime * 500;
					} else {
						fee = parkingTime * 300;
					}

					// 일일 최대요금 50000원 제한
					if (fee > 50000) {
						fee = 50000;
					}

					// 차량정보 출력
					System.out.println("선택하신 " + a + "행 " + b + "열의 차량 정보입니다.");
					System.out.println("차량번호 : " + selectSpace.getCar().getCarNum());
					System.out.println("차종 : " + selectSpace.getCar().getCarKind());
					System.out.println("주차시간 : " + selectSpace.getParkingTime() + "분");
					System.out.println("주차비용 : " + fee + "원");
					Thread.sleep(2000);

				} else {
					System.out.println("잘못 입력하셨습니다. 1~5 사이의 숫자를 입력해 주세요.");
					Thread.sleep(2000);
				}

			} catch (NumberFormatException e) {
				System.out.println("숫자를 적어주세요");
				Thread.sleep(2000);
			}

		}
	}
}
