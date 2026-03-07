package Chap_03;

public class _03_StringCompare {
	public static void main(String[] args) {
		// 문자열 비교
		String s1 = "Java";
		String s2 = "Python";
		
		System.out.println(s1.equals(s2)); // .equals() 를 사용하여 문자열 내용이 같으면 true, 다르면 false
		
		// .equalsIgnoreCase() 를 사용하여 대소문자 구분 없이 문자열 내용이 같은지 여부 체크 
		System.out.println(s2.equalsIgnoreCase("python"));
		
		// 문자열 비교 심화
		s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
 		s2 = "1234";
		System.out.println(s1.equals(s2)); // (true) 내용을 비교
		System.out.println(s1 == s2); // (true) 참조하는곳을 비교 -> 똑같은 곳을 참고하기에 true
		
		
		s1 = new String("1234");
		s2 = new String("1234");
		System.out.println(s1.equals(s2)); // (true)
		System.out.println(s1 == s2); // (false)
		// 이러한 이유로 Java에서 문자열의 내용을 비교할때는 == 가 아니라 .equals 를 사용한다
		
		
}
}
