package for문;

import java.util.Scanner;

public class Ex02For2 {

	public static void main(String[] args) {

		// 두 정수를 입력받아서
		// 작은수부터 큰수까지 1씩 증가하는 프로그램

		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");

			}
		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");

			}

		}

	}
}
