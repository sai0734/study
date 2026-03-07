package Chap_08.Camera;

public abstract class Camera {
	public void takePicture() {
		System.out.println("사진을 촬영합니다.");
	}
	public void recordVideo() {
		System.out.println("동영상을 녹화합니다.");
	}
	// 추상 메소드로 상속받은 자식 클래스는 해당 메소드를 완성해야만 한다.
	public abstract void showMainFeature();
}
