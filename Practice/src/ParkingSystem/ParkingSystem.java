package ParkingSystem;

public class ParkingSystem {
	private Parking[] parkings;
	private String name = "부천공영주차장";
	private int income = 0;
	
	public ParkingSystem ( int num ) {
		parkings = new Parking[num];
		
		for(int i = 0; i< parkings.length;i++) {
			parkings[i] = new Parking();
		}
		
		System.out.println(name+"시스템에 어서오세요.");
	}
	
	/*있어야 되는 메소드
	 * 1. 여유 공간조회 
	 * 2. 현재 있는 차량의 요금조회
	 * 3. 차량 제거 메소드 
	 *  - 차량제거시 해당차량의 수익 출력
	 *  4.시스템금일 최종 수익 출력
	 */
	
	
	
}
