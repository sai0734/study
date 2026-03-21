package Chap_13;

import java.util.Scanner;

public class _01_Input {
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		
		String name = sc.next();
		System.out.println("혈액형을 입력하세요");
		String bloodType = sc.next();
		
		System.out.println("입력하신 정부는 다음과 같습니다.");
		System.out.println("이름은 : " + name);
		System.out.println("혈액형은 : " + bloodType);
	}
}
