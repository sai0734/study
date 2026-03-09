package Chap_09.coffee;

public class CoffeeByNickname {
	public String nickname;

	public CoffeeByNickname(String nickname) {
		super();
		this.nickname = nickname;
	}
	
	public void ready() {
		System.out.println("커피 준비 완료 : " + nickname);
	}

}
