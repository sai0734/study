package Chap_03;

public class _01_String1 {
	public static void main(String[] args) {
		String s= "I like Java and Python and C.";
		System.out.println(s);
		
		// 문자열의 길이
		System.out.println(s.length()); // .lenght() 를 이용하여 문자의 갯수를 알 수 있다 (29)
		
		// 대소문자 변환
		
		System.out.println(s.toUpperCase()); // .toUpperCase() 를 이용하여 문자를 모두 대문자로 바꿀 수 있다
		System.out.println(s.toLowerCase()); // .toLowerCase() 를 이용하여 문자를 모두 소문자로 바꿀 수 있다
		
		// 포함 관계
		System.out.println(s.contains("Java")); // .contains() 괄호안의 단어가 포함되면 true, 미포함이면 false (true)
		System.out.println(s.contains("C#")); // (false)
		
		System.out.println(s.indexOf("Java")); // .indexOf() 괄호안의 단어의 위치를 알려준다 ->컴퓨터에서 첫 위치는 0 (7)
		System.out.println(s.indexOf("C#")); // 괄호안의 문자가 포함되지 않는다면 (-1)로 출력
		System.out.println(s.indexOf("and")); // 처음 일치하는 위치의 정보 (12)
		System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치 정보 (23)
		System.out.println(s.startsWith("I like")); // 괄호안의 문자열로 시작하면 true 아니면 false (true)
		System.out.println(s.endsWith(".")); // 괄호안의 문자열로 끝나면 true 아니면 false (true)
	}

}
