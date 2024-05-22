package Ex_abstract;

public abstract class Weapon {//-> 추상클래스

	//-> 추상클래스의 생김새     
	//class 앞에 abstract가 작성
	// 추상클래스가 되는 이유 2가지
	// 1. 하나 이상의 추상메소드를 가지고 있는 경우
	//2. class 앞에 abstract 라고 작성 하는경우에는 -(추상메소드가 없어도 됩니다)
	
	
	//추상클래스는 추상메소드가 아닌 일반메소드가 있다
	
	
		//Weapon클래스 역할 : 검, 도끼 창 등 무기들의 기능들을 상속받을 수 있도록
		// 기능(메서드)를 작성해 놓은 클래스

		//기능 (메소드) 2가지만 설계 
		
		public abstract void stab();
		
		
		
		
		{//-> 추상메소드
			
			// 찌르기 기능(메소드) 구현
			//메소드 만드는 방법 : 접근제한자, 리턴타입, 메소드명(매개변수)
			
//			System.out.println("찌르기");
			
			
			
			
		}
		
		//2
		public abstract void attack();
		//추상메소드의 생김새 : BODY ({})가 생략
		//뒤에 세미콜론(;)으로 마무리
		// return 타입 앞에 abstract 라는 키워드를 사용
		
		//추상메소드의 역할(가장중요함)
		//상속받은 하위클래스(자식클래스) ""반드시"" 구현해야하는 메소드
		
		//INTERFACE ->추상메소드
		
		
		
		
		
		
		
		
		
		
		


}
