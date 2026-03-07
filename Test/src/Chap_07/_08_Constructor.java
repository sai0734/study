package Chap_07;

public class _08_Constructor {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox("하양이", "UHD", 300000, "화이트");
		System.out.println(b1.modelName);
		System.out.println(b1.resolution);
		System.out.println(b1.price);
		System.out.println(b1.color);
		
		System.out.println("------------------------------------------");
		
		BlackBox b2 = new BlackBox();
	}

}
