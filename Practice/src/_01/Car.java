package _01;

public class Car {
	private String carKind;
	private String carNum;
	
	// 인스턴스 변수의 Getter 및 Setter -> 근데 사실 생성자에서 정해주기에 쓸모 없긴 함
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

	// car class의 생성자
	public Car() {
		// carKind
		carKind = String.valueOf(((int)((Math.random() * 3)+1)));
		
		if (carKind.equals("1")) {
			this.carKind = "경   차";
		} else if (carKind.equals("2")) {
			this.carKind = "장애인차";
		} else {
			this.carKind = "승 용 차";
		}
		
		// carNum
		String firstCarNum;
		String secondCarNum;
		String lastCarNum;
		
		// firstCarNum
		int firstCarNum_01 = (int)((Math.random() * 999)+1);
		
		if (firstCarNum_01 < 10) {
			firstCarNum = "00" + firstCarNum_01;
		} else if (firstCarNum_01 > 10 && firstCarNum_01 < 100) {
			firstCarNum = "0" + firstCarNum_01;
		} else {
			firstCarNum = String.valueOf(firstCarNum_01);
		}
		
		// SecondCarNum
		String[] word = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "타", "카", "타", "파", "하"};
		secondCarNum = word[((int)(Math.random()*13))];
		
		// lastNum
		int lastCarNum_01 = ((int)((Math.random() * 9999)+1));
		
		if (lastCarNum_01 < 10) {
			lastCarNum = "000" + lastCarNum_01;
		} else if (lastCarNum_01 > 10 && lastCarNum_01 < 100) {
			lastCarNum = "00" + lastCarNum_01;
		} else if (lastCarNum_01 > 100 && lastCarNum_01 < 1000) {
			lastCarNum = "0" + lastCarNum_01;
		} else {
			lastCarNum = String.valueOf(lastCarNum_01);
		}
		
		carNum = firstCarNum + secondCarNum + lastCarNum;
		
	}

}
