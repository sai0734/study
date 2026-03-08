package Chap_08;

import Chap_08.Camera.FactoryCam;
import Chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
	public static void main(String[] args) {
		// 데이터 추상화 (Data Abstraction) -> 보여줄건 보여주고 숨길건 숨기기 위해
		// abstract
		// 추상 클래스 (아직 완성되지 않은 클래스) -> 객체를 생성할 수 없다.
		// -> 추상 클래스를 상속받은 자식 클래스는 객체 생성 가능
		// 추상 메소드 (추상클래스 또는 인터페이스에서 사용 가능한 껍데기만 있는 메소드) -> 완성되지 않은 메소드
		// -> 추상 클래스를 상속받은 자식 클래스는 반드시 추상 메소드를 완성해야 한다.(오버라이딩)
		
//		Camera camera = new Camera(); -> 추상 클래스이기 때문에 객체를 만들지 못한다.
		
		FactoryCam factoryCam = new FactoryCam(); // Camera 클래스의 자식
		factoryCam.showMainFeature(); // 화재 감지

		SpeedCam speedCam = new SpeedCam(); // Camera 클래스의 자식
		speedCam.showMainFeature(); // 속도 측정, 번호 감지
		System.out.println(11);
		
	}
}
