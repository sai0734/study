package ParkingSystem;

public class Parking {
	
	private int fee;
	private int parkingTime;
	private int tenParkingTime;
	private Car car;

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(int parkingTime) {
		this.parkingTime = parkingTime;
	}

	public int getTenParkingTime() {
		return tenParkingTime;
	}

	public void setTenParkingTime(int tenParkingTime) {
		this.tenParkingTime = tenParkingTime;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	// 생성자
	public Parking() {
		// parkingTime
		this.parkingTime = (int)((Math.random() * 1440)+1);
		this.tenParkingTime = (parkingTime + 9) / 10; // 10분 단위로 끈은 값
	}
	
	// 주차비 계산 메소드 ㄱㄱ
	public int parkingfee(Car car) {
		
		// 차종류에 따른 주차비 계산
		if (car.getCarKind().equals("승용차")) {
			fee = tenParkingTime * 70;
		} else if (car.getCarKind().equals("경차")) {
			fee = tenParkingTime * 50;
		} else {
			fee = tenParkingTime * 30;
		}
		
		// 일일 최대요금 20000원 제한
		if (fee > 20000) {
			fee = 20000;
		}
		return fee;
	}
	

}
