package Chap_07.camera;

// SpeedCam is a Camera. (IS-A 관계)
public class SpeedCam extends Camera { // 자식 클래스

	public SpeedCam() {
		this.name = "과속단속 카메라";
	}
	
	public void takePicture() {
		// 사진 촬영
		super.takePicture();
		checkSpeed();
		recognizeLicensePlate();
	}
	
	public void checkSpeed() {
		// 속도 체크
		System.out.println("속도를 측정합니다");
	}
	
	public void recognizeLicensePlate() {
		// 번호 인식
		System.out.println("차량 번호를 인식합니다");
	}
	
	@Override // annotation(주석) -> 없어도 동작하는데 문제는 없
		public void showMainFeature() {
		System.out.println(this.name + "의 주요기능 : 속도측정, 번호 인식");
		}
}
