package 다중For문;

import java.util.Scanner;

public class Ex04Star2 {

	public static void main(String[] args) {
		
		// 공백 0-> 4까지 1씩 증가
		// 별 5 -> 1까지 1씩 감소

		for(int j = 1; j<=5; j++) {
			for(int i =0; i<5; i++) { //공백 4개 출력해주는 for문
				System.out.print(" ");
			}
			for(int i=5; i>=5; j-- ) {//별 5개 출력해주는 for문
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

		
	//------------------------------------------------	
//		
//		//1행 for문
//		for(int i =1; i<1; i++) { //공백 0개 출력해주는 for문
//		System.out.print(" ");
//		}
//		for(int i=5; i>=1; i-- ) {//별 5개 출력해주는 for문
//			System.out.print("*");
//		}
//		System.out.println();
//	//----------------------------------------------	
////		//2행 for문
//		for(int i =1; i<2; i++) { //공백 1개 출력해주는 for문
//			System.out.print(" ");
//			}
//			for(int i=5; i>=2; i-- ) {//별 4개 출력해주는 for문
//				System.out.print("*");
//			}
//			System.out.println();
//			//----------------------------------
//	//3행 for문	
//			for(int i =1; i<3; i++) { //공백 2개 출력해주는 for문
//			System.out.print(" ");
//				}
//			for(int i=5; i>=3; i-- ) {//별 3개 출력해주는 for문
//				System.out.print("*");
//				}
//				System.out.println();	
////------------------------------------------
//		//4행 for문	
//				for(int i =1; i<4; i++) { //공백 3개 출력해주는 for문
//					System.out.print(" ");
//						}
//					for(int i=5; i>=4; i-- ) {//별 4개 출력해주는 for문
//						System.out.print("*");
//						}
//						System.out.println();	
////--------------------------------------------------	
//	//5행 for문
//						
//			for(int i =1; i<5; i++) { //공백 4개 출력해주는 for문
//			System.out.print(" ");
//					}
//			for(int i=5; i>=5; i-- ) {//별 5개 출력해주는 for문
//			System.out.print("*");
//			}
//			System.out.println();	
//			
//	//-----------------------------------------
//			
//		
//		
//			
//		
//			}
//			
//}
		//1행
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

//				2행
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
	

		
//		//3행
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//	    System.out.print("*");
//	    System.out.println();

//	//4행
//	System.out.print("");
//	System.out.print("");
//	System.out.print("");
//	System.out.print("*");
//	System.out.print("*");
//	System.out.println();
	//5행
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print("*");
//	System.out.println();


