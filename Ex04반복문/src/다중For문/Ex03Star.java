package 다중For문;

import java.util.Scanner;

public class Ex03Star {

	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
//		........(사용자의 입력한 숫자만큼)

		Scanner scan = new Scanner(System.in);

//		System.out.print("행 개수 : ");
//		int num = scan.nextInt();
//		
//		for(int i=0;i<num;i++) {
//	System.out.print("*");
//		}

		System.out.print("행 개수");
		int num = scan.nextInt();

		for (int j = 0; j < num; j++) {// 별을 num 갯수만큼 아래로 내리기(세로)
			for (int i = 0; i< j+1; i++) {//별을 가로옆으로 늘리기 
			  System.out.print("*");
		    }

		System.out.println();
	   }
		
		

	}
}
