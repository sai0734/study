package Chap_07;

public class _05_MethodOverLoding {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
		b1.record(true, true, 10);
		System.out.println("--------------------------");
		b1.record(true, false, 3);
		System.out.println("--------------------------");
		b1.record(false, false, 7);
		System.out.println("--------------------------");
		b1.record();
		
		// String
		String s = "BalckBox";
		System.out.println(s.indexOf("a"));
		
		
	}

}
