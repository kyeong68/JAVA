package 산술연산자;

public class Ex01 {

	public static void main(String[] args) {
		// 변수 num이 942면 900을 출력하는 코드를 작성하시오.
		// 1. 형변환 이용해서.
		int num = 942;
		int num2 = num/100;
		System.out.println(num2*100);
		
		// 2. 나머지연산자 이용.
		int num3 = 999;
		int num4 = num3%100; // <- 99
		System.out.println(num3-num4);
		

	}

}
