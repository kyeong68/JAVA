package Ex_abstract;

public class Weapon_main {

	public static void main(String[] args) {
		
		Sword s = new Sword();
		s.attack();
		s.stab();
		
		
		
		
		System.out.println("==============");
		
		Spear sp =new Spear();
		sp.attack();
		sp.stab();
		
		
		//추상클래스의 특징 
		//객체를 생성할수 없습니다.
		// 설계와 구현 파트를 분리시키는 역할 
		//Weapon w =new Weapon();
		
		
		
		
		
		
		
	}

}
