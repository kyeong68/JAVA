package 대입연산자;

public class Ex00Basic {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = num1+3; // 13
		int num3 = 7;
		num1 = num3+10;
		System.out.println(num2);
		System.out.println(num1);
		
		int num4 = 14;
		
		num4=num4+3;
		num4=num4+3;
		num4=num4+3;
		num4=num4+3; //-> 개발자는 이것도 길다 느낌.
		System.out.println(num4);
		// 복합대입연산자.
		//num4=num4+3;
		num4+=3;
		
		num4*=3;
		

	}

}
