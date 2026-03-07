package Chap_06;

// 증명서 -> 나코딩, 891207-1183721, 010-4579-1078
// 수정후 -> 나**, 891207-1******, 010-4578-****
// 개인정보를 비공개로 전환하는 메소드 작성
// 하나의 메소드에서 모든 동작 처리
// 각 정보는 아래 위치로부터 비공개 적용
// 이름 : 2번째 글자
// 주민등록번호 : 9번째 글자
// 전화번호 : 10번째 글차

public class _Quiz_06 {
	
	public static String getHiddenData(String data , int index) {
		String hiddenData = data.substring(0, index); // 나코딩 -> 나 만 출력한다는 뜻
		
		for ( int i = 0 ; i < data.length() - index ; i++) {
			hiddenData += "*";
		}
		return hiddenData;
		
	}

	public static void main(String[] args) {
		String name = "나코딩";
		String id = "891207-1183721";
		String phone = "010-4579-1078";
					
		System.out.println("증명서");
		System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보 , 비공개 시작 위치
		System.out.println("주민등록번호 : " + getHiddenData(id, 8));
		System.out.println("전화번호 : " + getHiddenData(phone, 9));
		

	}

}
