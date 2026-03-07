package Chap_03;

public class _Quiz_03 {
	public static void main(String[] args) {
		// "891207-1183721" 의 경우 891207-1 까지 출력
		
		String id = "891207-1183721";
		System.out.println(id.substring(id.indexOf("8"), id.indexOf("18")));
		id = "931212-2386318";
		System.out.println(id.substring(0, 8));
		System.out.println(id.substring(0, id.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지

	}

}
