package Chap_08.Camera;

import Chap_08.detecter.Detectable;
import Chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
	private Detectable detector; // 인터페이스 변수
	private Reportable reporter; // 인터페이스 변수
	
	// Getter Setter
	public Detectable getDetector() {
		return detector;
	}

	public void setDetector(Detectable detector) {
		this.detector = detector;
	}

	public Reportable getReporter() {
		return reporter;
	}

	public void setReporter(Reportable reporter) {
		this.reporter = reporter;
	}

	@Override
	// 추상 클래스 Camera의 추상 메소드
	public void showMainFeature() {
		System.out.println("화재 감지");	
	}

	// 인터페이스 Detectable의 추상 메소드
	@Override
	public void report() {
		detector.detect();
	}

	@Override
	// 인터페이스 Reportable의 추상 메소드
	public void detect() {
		reporter.report();
	}
	

	
}
