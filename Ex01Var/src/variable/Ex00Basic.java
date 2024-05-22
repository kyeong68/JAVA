package variable;

public class Ex00Basic {

	public static void main(String[] args) {
		// // -> 주석 : 메모목적. (컴퓨터는 알아먹지 못함)
		
		// 변수
		// 1. 변수 선언
		// 데이터타입 변수명;
		int age;
		
		// 2. 변수에 값을 할당.
		// 변수명 = 할당할 값;
		age = 50;
		
		//int age; -> 변수는 중복으로 선언할 수 없다!
		
		// 3. 변수를 선언하고 동시에 값을 할당하기.(초기화)
		
		int age2 = 60;
		
		// 상수
		
		// 정의 : 한번 초기화하면 변하지 않는 수다.
		
		// 1. 상수의 선언
		// final 데이터타입 변수명;
		final int WIDO;
		
		// 2. 상수의 값 할당
		// 변수명 = 할당할 값;
		WIDO=127;
		
		// 3. 상수를 선언하고 동시에 값을 할당하기.(초기화)
		//final 데이터타입 변수명 = 값;
		final int G_DO = 500;
		
	}

}
