package dowhile문;

import java.util.Scanner;

public class Ex02InputNum {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		// do-while 문을 사용해서
		// 0을 입력하기 전까지 계속해서 숫자 입력받기
		// 만약에 0을 입력하면 "프로그램 종료 출력"

		int num;
		
		do {
			
			System.out.print(">");
			num = sc.nextInt();
			
	}while(num != 0);
		System.out.println("프로그램 종료!");
		
		
	}
}

