package ParkingSystem;

public class Car {
	
	// 전역 변수 선언
	private String carKind;
	private String carNum;

	
	
	// 전역 변수의 Getter & Setter
	public String getCarKind() {
		return carKind;
	}



	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}



	public String getCarNum() {
		return carNum;
	}



	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}



	// 생성자
	public Car() {
		
		// carKind 
		carKind = String.valueOf(((int)((Math.random() * 3)+1)));
		
		if (carKind.equals("1")) {
			this.carKind = "승용차";
		} else if (carKind.equals("2")) {
			this.carKind = "경차";
		} else {
			this.carKind = "장애인차";
		}
		
		// carNum
		String firstCarNum;
		String secondCarNum;
		String lastCarNum;
		
		int firstCarNum_01 = ((int)((Math.random() * 999) + 1));
		String[] word = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "타", "카", "타", "타", "하"};
		int lastCarNum_01 = (int)((Math.random() * 9999) + 1);
		
		if (firstCarNum_01 < 100 && firstCarNum_01 >= 10) {
			firstCarNum = "0" + firstCarNum_01;
		} else if ( firstCarNum_01 < 10) {
			firstCarNum = "00" + firstCarNum_01;
		} else {
			firstCarNum = String.valueOf(firstCarNum_01);
		}
		
		secondCarNum = word[(int)((Math.random() * 14))];
		
		if (lastCarNum_01 < 1000 && lastCarNum_01 >= 100) {
			lastCarNum = "0" + lastCarNum_01;
		} else if ( lastCarNum_01 < 100 && lastCarNum_01 >= 10) {
			lastCarNum = "00" + lastCarNum_01;
		} else if ( firstCarNum_01 < 10) {
			lastCarNum = "000" + lastCarNum_01;
		} else {
			lastCarNum = String.valueOf(lastCarNum_01);
		}
		
		carNum = firstCarNum + secondCarNum + lastCarNum;
		
//		System.out.println("차 종류는 : " + carKind);
//		System.out.println("차 번호는 : " + carNum);

	}
	
}
