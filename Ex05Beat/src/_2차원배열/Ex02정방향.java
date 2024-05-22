package _2차원배열;

public class Ex02정방향 {

	public static void main(String[] args) {

		// 1~25까지 정수를 5행5열을 이차원배열에 저장
		// 5행 5열의 이차원배열 만들기

		int[][] array = new int[5][5];

		int cnt = 1;

		// 1 ~ 25 정수를 입력하는 이중 for문
		for (int j = 0; j < array.length; j++) {// j : 행, i = 열
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = cnt++;

			}
		}
		// 0행값 저장 for문
//		for(int i = 0; i<array[0].length; i++);{
//			for(int i = 0; i < array[1].length;i++ ) {
//				array[0][i] = cnt++;
//			
//		
//		}
//		
//		//1행 값 저장for문
//		for(int i = 0; i < array[1].length;i++ ) {
//			array[1][i] = cnt++;
//		}
//		
//		//2행 값 저장for문
//		
//		for(int i = 0; i < array[1].length;i++ ) {
//			array[2][i] = cnt++;
//		}

		// 출력부
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {// 0행출력
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}
//		for(int i=0; i < array[0].length;i++) {//0행출력
//	   System.out.print(array[0][i]+"\t");
//}
//		System.out.println(); 
//
//
//	for(int i =0; i <array[1].length;i++) {//1행출력
//	System.out.print(array[1][1]+"\t");
//}
//	System.out.println();
//		
//		
//		
//		
//		
//			
////		// 0행
////	 array [0][0] =1;
////	 array [0][1] =2;
////	 array [0][2] =3;
////	 array [0][3] =4;
////	 array [0][4] =5;
//// 
//////	   1행
////	 array [1][0] =6;
////	 array [1][1] =7;
////	 array [1][2]=8;
////	 array [1][3]=9;
////	 array [1][4]=10;
// 
// 
//		
//		
//
//	}
//
//}
	}
}
