package _01;

public class Parking {

	// 5*5 주차장을 선언
	ParkingSpace[][] parkings = new ParkingSpace[5][5];
	
	// 생성자 -> for문으로 ParkingSystem에 객체를 생성
	public Parking() {
	for (int i = 0; i < parkings.length; i++) {
		for (int j = 0; j < parkings[i].length; j++) {
			parkings[i][j] = new ParkingSpace(new Car());
			}
		}
	}
}
