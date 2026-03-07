package Chap_04;

public class _11_Continue {
	public static void main(String[] args) {
		// continue
		
		// 치킨 주문 손님중에 노쇼 손님이 있다고 가정
		// For
		
		int max = 20; // 최대 치킨 판매 수량
		int sold = 0; // 현재 치킨 판매 수량
		int noShow = 17; // 노쇼 손님은 7번
		for (int i = 1; i <= 50;i++) {
			System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다");
			
			// 손님이 없다면? (noShow)
			if (i == noShow) {
				System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 팝니다");
				continue;
			}
			
			sold++; // 판매처리
			if (max == sold) {
				System.out.println("닭이 오링났네");
				break;
			}
			
		}
		System.out.println("영업 끝");
		
		System.out.println("------------------------------");
		
		// While 문
		int index = 1; // 손님 번호
		sold = 0;
		while (index <= 50) {
			System.out.println(index + "번 손님 주문하신 치킨 나왔습니다");
			
			// 손님이 없다면 (noShow)
			if (index == noShow) {
				System.out.println("손님이 없네?");
				index++; // 이게 없으면 밑의 문장이 수행되지 않기 떄문에 아래의 index++이 실행을 안한다
				continue;
			}
			sold++; // 판매처리
			if (max == sold) {
				System.out.println("닭이 오링났네?");
				break;
			}
			index++;
			}
			System.out.println("영업 끝");
	}

}
