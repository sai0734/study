package Chap_05;

// 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 만드시오

//조건
// 신발사이즈는 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

public class _Quiz_05 {
	public static void main(String[] args) {
		int[] sizeArray = new int[10];
		
		for (int i = 0 ; i < sizeArray.length ; i++) {
			sizeArray[i] = 250 + (i * 5);
			System.out.println("사이즈 " + sizeArray[i] + " (재고있습니다)");
		}
		
		for ( int size : sizeArray) {
			System.out.println("사이즈" + size + "재고있습니다");
		}
		
	}
}

