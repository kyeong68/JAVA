package oop;
// class : 객체를 만들기위한 설계도이자 분류.

public class Restaurant {
	// 속성과 행위.
	// 속성: 변수: 필드 
	// 필드 전역변수(feild : 객체의 상태나 속성을 나타냄. 
	//          class의 중괄호안. 메서드 밖에서 정의함.)
	String adress; 
	String brand;
	int numBurger;
	int money;
	int numMember;
	int phonNumber;
	int cost;
	
	// 메서드 : 객체의 행동을 담당함.
	public void takeOrder(String burgerName) {
		System.out.println("주문받은 햄버거 =" + burgerName);
	}
	
	
	public int request() {
		return 5000;
	}
	
	public void calculate (int pay) {
		System.out.println("원 지불받았습니다.");
		money = money+pay;
	}
	
	
	
	
	
	
	
	
	
	

}
