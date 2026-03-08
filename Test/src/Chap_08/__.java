package Chap_08;

import Chap_07.camera.Camera;

public class __ {
	public static void main(String[] args) {
		Camera camera = new Camera();
		Camera camera_01;
		
		camera.name = "안녕";
		
		System.out.println(camera.name);
		camera.takePicture();
		
		camera.takePicture("친구", 3);
		
//		camera_01.name = "안녕2";
		camera_01 = new Camera();
		System.out.println(camera_01.name);
		
		
				
				
		
	}

}
