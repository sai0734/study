package Chap_09.coffee;

public class CoffeeByNumber {
	public int waitingNumber;

	public CoffeeByNumber(int watingNumber) {
		super();
		this.waitingNumber = watingNumber;
	}
	
	public void ready() {
		System.out.println("커피 준비 완료 : " + waitingNumber);
		
	}
	
	

}
