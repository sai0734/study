package _01;

public class ParkingSpace {
	private int parkingTime;
	private Car car;

	// getter 및 setter 필요는 없지
	public int getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(int parkingTime) {
		this.parkingTime = parkingTime;
	}


	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public ParkingSpace(Car car) {
		this.car = car;
		this.parkingTime = (int)((Math.random()*1440) + 1);	
	}

}
