package Chap_07;

import Chap_07.camera.Camera;
import Chap_07.camera.FactoryCam;
import Chap_07.camera.SpeedCam;

public class _14_Polymorphism {
	public static void main(String[] args) {
		// 다향성
		
		// class Person : 사람
		// class Student extends Person : 학생 (학생은 사람이다. Student is a person)
		// class Teaacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)
		
		Camera camera = new Camera();
		Camera factoryCam = new FactoryCam();
		Camera speedCam = new SpeedCam();
		
		camera.showMainFeature();
		factoryCam.showMainFeature();
		speedCam.showMainFeature();
		
		System.out.println("-------------------");
		
		Camera[] cameras = new Camera[3];
		cameras[0] = new Camera();
		cameras[1] = new FactoryCam();
		cameras[2] = new SpeedCam();
		
		for (Camera cam : cameras) {
			cam.showMainFeature();
		}
		
		System.out.println("-------------------");
		
//		factoryCam.detectFire();  // 부모 클래스인 Camera로 만들어진 객체이기 떄문에
//		speedCam.checkSpeed();    // 원래 자신이 가지고 있던 메소드는 적용이 안됬다.
//		speedCam.recongnizeLicensePlate();
		
		if (camera instanceof Camera) {
			System.out.println("카메라 입니다");
		}
		
		if (factoryCam instanceof Camera) {
			System.out.println("카메라 입니다");
		}
		
		// instanceof 를 통해서 해당 객체가 해당 클래스의 객체인지 확인한다.
		if (factoryCam instanceof FactoryCam) {
//			factoryCam.detectFire(); // 형변환을 해줘야 한다.
			((FactoryCam)factoryCam).detectFire();
		}
		
		if (speedCam instanceof SpeedCam) {
			((SpeedCam) speedCam).checkSpeed();
			((SpeedCam) speedCam).recognizeLicensePlate();;
		}
		
	}

}
