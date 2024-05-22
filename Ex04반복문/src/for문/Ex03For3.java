package for문;

import java.util.Scanner;

public class Ex03For3 {

	public static void main(String[] args) {
		
		// 두정수를 입력받고 
		// 작은수부터 큰수까지 1씩 증가하면서
		// sum이라는 변수에 누적시키기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
		
			
		sum += i;
		//System.out.println(i+ ":"+ sum);
		
		
		
	}
	
		System.out.println("종합 : "+ sum);
	}
	
}
