package Chap_06;

public class _07_VariableScope {

	public static void methodA() {
		int number = 3;
		System.out.println(number);
	}	

	public static void main(String[] args) {
		int result = 1;
//		System.out.println(result);
		for ( int i = 0 ; i < 5 ; i++) {
			System.out.println(i);
			}
//		System.out.println(i); -> 여기서 변수 i는 위 for문의 지역변수이기에 못가져온다
		}
}