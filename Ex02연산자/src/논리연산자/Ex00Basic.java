package 논리연산자;

public class Ex00Basic {

	public static void main(String[] args) {
		// 논리연산자의 결과값은 언제나 true/false -> boolean
		// 종류 : !, ||, &&, ^
		
		// !(not의 의미를 가짐.) : 앞선 값의 반대되는 값을 나타내고 싶을때 사용.
		boolean check = true;
		System.out.println(!check);
		
		// && (and의 의미) 곱연산을 의미함 ('그리고'의 뜻)
		System.out.println(10>3 && 5>2); //true (t/t)
		System.out.println(10>3 && 5<2); //flase (t/f)
		
		//|| (OR의 의미) 합연산을 의미(~또는, ~이거나)
		System.out.println(10>3 || 5>2); //true (t/t)
		System.out.println(10>3 || 5<2); //true (t/f)
		System.out.println(10<3 || 5<2); // flase (f/f)
		//노란줄 -> deadcode(사용되지 않는 죽은 코드다)
		
		// ^ (XOR의 의미) 두개가 서로 다를때 true.
		System.out.println(10<3 ^ 5>2); //(f/t) -> true
		
		// 비트 논리 연산
		// 종류 : ~ , | , & , ^
		// 비트논리연산 : 각 비트를 비교하는 연산자.
		
		// ~ (not의 의미) 모든 비트를 역으로 돌린다.
		int num1 =10; // 00000000 00000000 00000000 00001010
		System.out.println(~num1); // Java는 2의 보수형태로 음수를 표현한다.
		// 11111111 11111111 11111111 11110101 -> -11
		
		// | (or의 의미) 모든 비트를 or 한다.
		// a = 10 / b = 12
		// a = 1010 / b = 1100
		int a=10;
		int b=12;
		System.out.println(a|b); // 각 비트르 or 결과는 14
		
		// & (and의 의미) 모든 비트를 and 한다.
		// a = 1010 / b = 1100
		// 결과 => 1000 (8)
		System.out.println(a&b);
		
		// ^(XOR)
		// 서로 다르면 1
		// a = 1010 / b = 1100
		// 결과 => 0110 -> 6
		System.out.println(a^b);
		
		
		
	}

}
