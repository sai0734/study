package Chap_01;

public class _05_VariableNaming {
	public static void main(String[] args) {
		// 변수 이름 짓는 법
		// 1. 저장할 값에 어울리는 이름
		// 2. 밑줄(_) , 문자(abc), 숫자(123), 사용 가능 (공백 사용 불가)
		// 3. 밑줄 또는 문자로 시작 가능
		// 4. 한 단어 또는 2개 이상 단어의 연속
		// 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외) 카멜법
		// 6. 예약어 사용 불가 (Public, static, void, int, double, float, ...)
		// 7. 숫자로 시작해서는 안된다. (7up => 이건 안됨, top10 => 이건 됨)
		// 8. 특수문자는 '_' 또는 '$'만 사용 가능하다 (up_down, letter#)
		
		// 입국 신고서 (여행)
		String nationality = "대한민구"; // 국적
		String firstName = "현성"; // 이름
		String lastName = "김"; // 성
		String dateOfBirth = "2001-12-31"; // 생년월일
		String residentialAddress = "무슨 호텔"; // 체류지
		String purposeOfVisit = "관광"; // 입국목적
		String flightNo = "KE657"; // 항공 편명
		String _flightNo = "KE657"; // 밑줄 시작
		String flight_no_2 = "KE657"; // 밑줄과 숫자 포함
		// String -flightNo = "KE657"; => 이 경우 -로 시작하면 안되서 오류가 난다
		
		int accompany = 2; // 동반 가족 수
		int lenghtOfStay = 5; // 체류 기간
		
		String item1 = "시계";
		String item2 = "가방";
		// String 3item = "전자제품"; => 변수명이 숫자로 시작하면 오류가 난다
		
		// 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)
		int i = 0;
		String s = "";
		String str = "";
		
		// 절대 변하지 않는 상수는 대문자로 적는다
		// 상수의 경우 변수타입 앞에 final을 붙여준다
		final String CODE = "KR";
		// CODE = "US"; => 안됨
		System.out.println(CODE);
		
		double v = 30.123;
		int g = (int)v;
		System.out.println(g);
		
		
		
		
	}

}
