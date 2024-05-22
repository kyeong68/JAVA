package while문; // 누적합

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 정지조건 : 사용자가 -1 입력할때.
		// 동작조건 : -1이 아님
		// 결과 : 누적합 
		
		// 방법 1
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
//		while(true) {
//			System.out.println("숫자입력 : ");
//			int input = sc.nextInt();
//			sum+=input;
//			System.out.println("누적결과 : "+sum);
//			
//			if(input==-1) {
//				System.out.println("종료되었습니다.");
//			break;
//			
//			}
//		}
//	}
//	}
		
		int input=0;
		while(input!=-1) {
			System.out.println("숫자입력 : ");
			input = sc.nextInt();
			sum=sum+input; //sum=-input
			System.out.println("누적결과 :"+sum);
		}			
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
			
			
			
			
		
		
		
		
			
			
		}

		
		
		
		
		
	}


