package 산술연산자;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 두개의 정수를 입력받아서 두수의 사칙연산 결과 출력하기.
		
		//1. 입력도구 가져오기.
		Scanner sc = new Scanner(System.in);
		//2. 사용자의 입력 받기.
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		//3. 연산결과 출력하기.
		System.out.println("더하기 결과 : "+(num1+num2));// + 
		System.out.println("빼기 결과 : "+(num1-num2)); //-
		System.out.println("곱하기 결과 : "+num1*num2); //*
		System.out.println("나누기 결과 : "+num1/num2);// /
		System.out.println("나머지 결과 : "+num1%num2);
		
	}

}
