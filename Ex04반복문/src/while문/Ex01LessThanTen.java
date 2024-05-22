package while문;

import java.util.Scanner;

public class Ex01LessThanTen {

	public static void main(String[] args) {
		// 사용자가 10보다 큰 수를 입력하면 종료.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		while(num<10) {
			System.out.print("정수입력 : ");
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
		
		// 방법1
//		int num = 0
//		while(num<=10) {
//			System.out.println("정수입력 : ");
//			num = sc.nextInt();
//		}
		
		// 방법2
		
//		while(true) {
//			System.out.print("정수입력 : ");
//		num = sc.nextInt();
//			if(num>10) {
//			  break;
//			}
//			
//		}
//			
//		System.out.println("종료되었습니다.");
		
		
	
		
		
		
	}

}
