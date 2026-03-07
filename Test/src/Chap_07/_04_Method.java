package Chap_07;

public class _04_Method {
	public static void main(String[] args) {
		
		// BlackBox라는 Class를 이용하여 b1 이라는 객체를 생성
		BlackBox b1 = new BlackBox();
		
		// b1 이라는 객체 속 선언되있는 인스턴스 변수(필드값)을 지정
		b1.modelName = "까망이";
		b1.resolution = "까망이";
		b1.price = 200000;
		b1.color = "블랙";
		
		// Class 변수 "static boolean canAutoReport = false;" 을 이용한 "autoReport" 메소드 적용
		// 전달값과 반환값이 둘다 없는 메소드
		b1.autoReport(); // 지원 안됨
		BlackBox.canAutoReport = true; // Class 변수를 false -> true 로 재 선언
		b1.autoReport(); // 지원 됨
		
		// b1 객체의 insertMemoryCard 메소드 적용
		// 전달값만 있는 메소드
		b1.insertMemoryCard(256); // () 안에는 "int capacity" 값을 너어준다
		
		
		// b1 객체의 getVideoFileCount 메소드 적용
		// 전달값과 반환값 둘다 있는 메소드
		// 일반 영상 : 1
		int fileCount = b1.getVideoFileCount(1); // 일반 영상
		System.out.println("일반 영상 파일 수 : " + fileCount + "개");
		// 이벤트 영상 (충돌 감지) : 2
		fileCount = b1.getVideoFileCount(2); // 이벤트 영상
		System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
		
	}

}
