package Chap_08.detecter;

public class FireDetector implements Detectable {
	@Override
	public void detect() {
		System.out.println("일반성능으로 화재를 감지합니다.");
	}

}
