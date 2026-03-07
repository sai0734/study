package Practice;

//주차장요금 계산기 만들기

//차량 종류 선택
//1. 승용차 : 10분당 700원 
//2. 경차 : 10분당 500원
//3. 장애인차 : 10분당 300원

//예상 주차시간 입력
//10분 단위로 입력받음

//일일 최대금액 20000원 으로 설정

//최종안내문구 출력
//고객님의 예상금액은 **차량으로 얼마일 것으로 예상됩니다

import java.util.Scanner;

public class Shin_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String car = "0";
		int fee = 0;

		while (car.equals("0")) {
			// 시작 문구
			System.out.println("차량의 종류를 선택해 주세요\n1.승용차, 2.경차, 3.장애인차");

			// 차량의 종류를 입력받아 식별하기
			String inPut = scanner.nextLine();

			if (inPut.equals("1")) {
				car = "승용차";
				break;
			} else if (inPut.equals("2")) {
				car = "경차";
				break;
			} else if (inPut.equals("3")) {
				car = "장애인차";
				break;
			} else {
				System.out.println("잘못 입력하셨습니다");
			}
		}

		while (fee == 0) {
			// 주차 예상시간을 입력받는 문구
			System.out.println("주차 예상 시간을 적어주세요");
			// 차량 종류에 때란 주차 예상시간을 받아 금액 계산하기
			int minute = scanner.nextInt();
			int tenMinute;
			tenMinute = ((minute + 9) / 10) * 10;

			if (car.equals("경차")) {
				fee = 50 * tenMinute;
				break;
			} else if (car.equals("장애인차")) {
				fee = 30 * tenMinute;
				break;
			} else if (car.equals("승용차")) {
				fee = 70 * tenMinute;
				break;
			} else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
		if (fee > 20000) {
			fee = 20000;
		}

		// 최종 문구
		System.out.println("당신의 차량은 \'" + car + "\' 이며 \'주차 예상 요금은\' " + fee + "원 입니다");
	}
}
