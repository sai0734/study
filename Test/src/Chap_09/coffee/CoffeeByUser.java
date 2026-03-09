package Chap_09.coffee;

import Chap_09.user.User;

public class CoffeeByUser<T extends User> { // User라는 클래스를 상속하는 T 즉 원하는 형태의 객체만 받도록 처리(어렵다)
	public T user;

	public CoffeeByUser(T user) {
		super();
		this.user = user;
	}
	
	public void ready() {
		System.out.println("커피 준비 완료 : " + user.name);
		user.addPoint();
		
	}
}
