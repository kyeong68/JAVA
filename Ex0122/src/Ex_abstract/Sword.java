package Ex_abstract;

public class Sword extends Weapon {

	@Override
	public void stab() {
	System.out.println("검으로 찌르기");
	}

	@Override
	public void attack() {
	System.out.println("검으로 공격하기");
	}//재정의

	//오버라이딩 (다같으면되고안에 내용만다르면된다)/
	//조건 : 1. 부모클래스에 존재하는 메소드(상속관계)
	// 2. 메소드 이름 같아야합니다.
	// 3. 매개변수 개수,타입 : 둘다같아야한다
	// 4. 리턴타입 같아야합니다.
	
	
	
	
	
	
}
