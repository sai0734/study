package Chap_07;

public class _02_InstanceVriables {
	public static void main(String[] args) {
		
		// BlackBox라는 Class르 통해 b1이라는 객체를 생성
		BlackBox b1 = new BlackBox();
		
		// b1 객체의 인스턴스 변수(필드값)을 선언
		b1.modelName = "까망이";
		b1.resolution = "FHD";
		b1.price = 200000;
		b1.color = "블랙";
		
		System.out.println(b1.modelName);
		System.out.println(b1.resolution);
		System.out.println(b1.price);
		System.out.println(b1.color);
		
		System.out.println("------------------------------");
		
		// 새로운 BlackBox인 b2를 생성
		BlackBox b2;
		b2 = new BlackBox();
		
		// b2 객체의 인스턴스 변수(필드값)을 선어
		b2.modelName = "하양이";
		b2.resolution = "UHD";
		b2.price = 300000;
		b2.color = "화이트";
		
		System.out.println(b2.modelName);
		System.out.println(b2.resolution);
		System.out.println(b2.price);
		System.out.println(b2.color);
		
		
		
	}

}
