package Exinterpace;

public interface ex01 {

	//소프트웨어적 인터페이스 특징 //인터페이스는 하드웨어에서왔다. 어떤제품을만들때 규격화 되어있다.
	
	// 클래스 필드(속성,변수) , 메소드
	
	// 인터페이스 필드 메소드로 구성되어있습니다.
	//필드(변수)의 특징
	
	
	// 상수만 가능 
	public static final int num1 =0;
	//생략 가능한 부분들이 있습니다!
	//final 생략가능 --> 상수만 작성 가능하다고 했습니다!
	
	//인터페이스에서 상수만 작성가능
	
	//클래스에서 접근제한자를 작성하지 않으면 default 
	// 인터페이스에서 접근제한자를 작성하지 않으면 public
	//public 도 생략가능 + static도 생략가능
	int num2 =0; //상수
   //num2 = 10; 상수라서 대입 불가!
	
	// 메소드의 특징
	//인터페이스 내 메소드는 추상메소드만 가능 합니다.("반드시" 구현되야한다)
	//1.7Ver 이후부터 이말은 틀리게 됨
	// 접근제한다 abstract 리턴타입 메소드명 (매개변수);
	public abstract void test1();
	
	// 메소드도 마찬가지로 생략가능한 키워드들이 있습니다.
	//public 생략가능
	// abstract 생략가능
	void test2();
	
	//jdk가 발전하면서 일반메소드도 사용가능해졌습니다!
	//default 메소드 등장
	default void  test3() {
	
	}
	
	//1.9 private 메소드등장 static 메소드 등장
	private void test4() {
		
	}
	static void test5() {
	
	
	

	}



}




