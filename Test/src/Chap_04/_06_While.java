package Chap_04;

public class _06_While {
	public static void main(String[] args) {
		// 반복문 While
		//while (조건) {
		// 명확한 횟수가 정해지지 않았을때
		
		// 수영장에서 수영을 하는 모습
		int distence = 25; // 전체거리 25m
		int move = 0; // 현재 이동 거리
		while (move < distence) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
			System.out.println("발차기를 계속 합니다");
			System.out.println("현재 이동 거리는 " + move);
			move += 3; // 3미터 이동
		}
		System.out.println("도착하였습니다.");
		
		// 무한 루프
		int distence1 = 25; // 전체거리 25m
		int move1 = 0; // 현재 이동 거리
		while (move1 < distence1) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
			System.out.println("발차기를 계속 합니다");
			System.out.println("현재 이동 거리는 " + move1);
			// move += 3; -> 탈출 방법이 없으면 무한 루프에 빠진다
	}
		System.out.println("도착하였습니다.");

}
}
