package 조건연산자;

import java.util.Scanner;

public class Ex01BigNum {

	public static void main(String[] args) {
		// 두 수를 입력 받아 두수의 차를 구하는데, 무조건 큰수에서 작은수 빼기.
		
		//1.입력받는 도구
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		//2. 큰수와 작은수 구분해서 연산하기.
		int num3 = num1>num2 ? num1-num2 : num2-num1;
		System.out.println("결과 : "+num3);
		
		// 홀수와 짝수 구분하기.
		System.out.print("입력 : ");
		int num4 = sc.nextInt();
		// 조건 : 2로 나눳을때 나머지가 0이면 짝수 /1이면 홀수
		System.out.println(num4%2==0?"짝수":"홀수");
		

	}

}
