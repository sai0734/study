package ParkingSystem;

import java.util.Scanner;

/*
 * 1.주차장 시스템에 어서오세요.   안내문구 시작
 * 2.차고지 세개에 있는 자동차를 선택하면 해당차량이 주차요금을 알수있습니다. 라는 문구후 
 *   차고번호를 골라주세요. 
 *   1.차넘버1  2.차넘버2 3.차넘버3
 * 3. 차량 번호 선택시  
 *   - 해당차량의 차종은 무엇이며 주차시간이 몇분이나와 예상 금액은 얼마가 나옵니다. 
 * 4. 다시 2번다시 돌아감.
 * 5.혹시 2번에서 입력값이 exit라는 값을 하면 시스템 종료하겠습니다. 라는 문구 발생 후 시스템 종료.
 */

public class Main {
	public static void main(String[] args) {
		
		//모든클래스는 Object 상속을 함  Object toString() 
		//System.out.println(obj)  => obj.toString()
		
		//Exception => 최상위 오브젝트 
		//NullPointException => null인애를 메소드를 호출하게 되면 에러   
		
		// 차고지 갯수
		int carindex;
		carindex = 3;

		// scanner 객체 생성
		Scanner scanner = new Scanner(System.in);

		// Car 클래스타입의 cars 객체 3개 생성
		Car[] cars = new Car[carindex];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		
		// Parking 객체 생성
		Parking parking = new Parking();
	
		// 시작문구
		System.out.println("\"주차장 시스템에 어서오세요\"");

		// 반복 시작
		while (true) {
			System.out.println("원하시는 차고번호를 골라주세요");
			System.out.println("차고지를 선택하면 해당 차량의 주차요금을 알 수 있습니다.");
			System.out.println("----------------------------------------");
			
			// 근데 이러면 시스템이 켜질때마다 차량 정보가 달라지는데...?
			for (int i = 0 ; i < carindex ; i++) {
			System.out.print(
					i+1 + ".차번호 : " + cars[i].getCarNum() + ", ");
			}
			
			System.out.println("");

			// 차고지 번호를 입력받음
			String parkingNum = scanner.nextLine();
			
			parkingNum = parkingNum.toUpperCase(); // 소문자를 대문자로 바꿔준데
			//parkingNum = parkingNum.toLowerCase(); // 대 -> 소
				
			// 조건문으로 차고지 번호에 따른 정보 출력
			try {
			
				if (parkingNum.equals("EXIT")) { // 소문자일때 오류 섞여있어도 오류
					System.out.println("시스템을 종료하겠습니다.");
					break;
				} else if (Integer.parseInt(parkingNum) <= carindex) { // 영어 입력하면 오류가 뜬다.
					System.out.println(parkingNum + "번 차고지");
					System.out.println("차 번호는 : " + cars[Integer.parseInt(parkingNum)-1].getCarNum());
					System.out.println("차 종류는 : " + cars[Integer.parseInt(parkingNum)-1].getCarKind());
					System.out.println("주차시간은 : " + parking.getParkingTime() + "분");
					System.out.println("주차요금은 : " + parking.parkingfee(cars[Integer.parseInt(parkingNum)-1]) + "원 입니다.");
					System.out.println("----------------------------------------");
				} else { // 차고지 번호가 아닌 값을 입력 시 오류 출력
					System.out.println("\"잘못 입력하셨습니다.\"");
				}
			} catch( NumberFormatException e) {
				System.out.println("숫자가 아닌 문자를 입력하셨습니다.");
			} 
		}

	}
	
}
