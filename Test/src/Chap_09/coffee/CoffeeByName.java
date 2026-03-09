package Chap_09.coffee;

public class CoffeeByName {
	// Object는 조상이라 Integer, Double, String, Class ...
	public Object name;

	public CoffeeByName(Object name) {
		super();
		this.name = name;
	}
	
	public void ready() {
		System.out.println("커피 준비 완료 : " + name);
	}
	
}
