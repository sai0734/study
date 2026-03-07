package Chap_04;

public class _10_Break {
	public static void main(String[] args) {
		// Break
		// 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
		// 손님이 50명 대기
		
		// For 문
		int max = 20;
		for (int i = 1; i <= 50; i++) {
			System.out.println("치킨이 " + i + "마리 팔렸습니다");
			if (max == i) {
				System.out.println("닭이 오링입니다");
				break;
			}
			
		}
		System.out.println("치킨이 다 팔렸습니다");
		
		System.out.println("--------------------------------------");
		
		// While 문
		int index = 1; // 손님 대기번호
		while (index <= 50) {
			System.out.println(index + "번 손님 치킨나왔습니다");
			if (index == max) {
				System.out.println("금일 재료가 모두 소진되었습니다");
				break;
			}
			index++;
		} 
		System.out.println("치킨 다팔았다");
	}

}