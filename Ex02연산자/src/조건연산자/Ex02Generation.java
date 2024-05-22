package 조건연산자;

import java.util.Scanner;

public class Ex02Generation {

	public static void main(String[] args) {
		//사용자의 입력을 받아서 10세미만은 어린이, 20세미만은 청소년,
		// 35세 미만은 청년, 그 이상은 중장년으로 출력하기.
		
		//1. 사용자의 입력받기.
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		String gen;
		
		gen = age < 10 ? "어린이":
			  age < 20 ? "청소년":
		      age < 30 ? "청년":"중장년";
		System.out.println(gen);
		
		
		//System.out.println(age<10?"어린이": age<20? "청소년": age<30? "청년":"중장년");

	}

}
