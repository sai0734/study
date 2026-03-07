package Practice;

public class Array {
	
	public static void main(String[] args) {
		
		int[] speed = {100, 200, 300, 400};
		
		for ( int speed1 = 0 ; speed1 < speed.length ; speed1++) {
			System.out.print(speed[speed1] + ",");
		}			
		System.out.println("");
		System.out.println("------------------------------#1");
		
		for (int speed2 : speed) {
			System.out.print(speed2);
			System.out.print(",");
		}
		System.out.println("");
		System.out.println("------------------------------#2");
		
		String[][] car = {
				{"a1", "a2", "a3"},
				{"b1", "b2", "b3"},
				{"c1", "c2", "c3"},
				{"d1", "d2", "d3"},
		};
		
		for (int car1 = 0 ; car1 < car.length ; car1++) {
			for ( int car2 = 0 ; car2 < car[car1].length ; car2++) {
				System.out.print(car[car1][car2] + ",");
			}
			System.out.println("");			
		}
		
		System.out.println("------------------------------#3");
		
		for (String[] car3 : car) {
			for (String car4 : car3) {
				System.out.print(car4);
				System.out.print(",");
			}
			System.out.println("");
		}
		System.out.println("------------------------------#4");
	
		
	}

}
