package Practice;

import java.util.Scanner;

public class 로또 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			System.out.print((int)(Math.random() * 46 + 1));
			System.out.print(",");
			
		}
		System.out.println();
		
		
	}
}
