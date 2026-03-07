package Chap_07;

public class _03_ClassVariables {
	public static void main(String[] args) {
		
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		System.out.println(b1.modelName);
		
		BlackBox b2 = new BlackBox();
		b2.modelName = "하양이";
		System.out.println(b2.modelName);
		
		// 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
		System.out.println(" - 개발 전 - ");
		// 객체명.Class변수명 으로 Class변수를 불러왔지만 이거보다 아래와 같이 부르는게 정석이다
		System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);	
		System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);	
		// Class변수의 경우 Class명.Class변수명 으로 불러온다
		System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
		
		// 기능 개발
		BlackBox.canAutoReport = true;
		System.out.println(" - 개발 후 - ");
		System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);	
		System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);	
		// Class변수의 경우 Class명.Class변수명 으로 불러온다
		System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
		

		
		
	}

}
