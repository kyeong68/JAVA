package 다중For문;

import java.util.Scanner;

public class EX02구구단2 {

	public static void main(String[] args) {
	
		
	
//	      for(int j = 2; j <= 9; j++) {
//	          
//	          System.out.print(j+"단 : ");
//	          for (int i = 1; i <= 9; i++) {
//	             System.out.print(j + "*" + i + "=" + (j * i) + " ");
//	          }
//	          System.out.println();
//	          
//	          
//	       }
	       
	       // 2단
//	       for (int i = 1; i <= 9; i++) {
//	          System.out.print(2 + "*" + i + "=" + (2 * i) + " ");
//	       }
//	       System.out.println();
//	       
//	       for (int i = 1; i <= 9; i++) {
//	          System.out.print(3 + "*" + i + "=" + (3 * i) + " ");
//	       }
//	       System.out.println();
//	       
//	       for (int i = 1; i <= 9; i++) {
//	          System.out.print(4 + "*" + i + "=" + (4 * i) + " ");
//	       }
//	       System.out.println();

		
		//구구단 2단 ~9단까지.
		// 출력은 좌에서 우로/ printIn을 만나면개행.
	// byte shout int long	
	
//	int dan=2;	
		
	for(int j=1;j<11;j++){
		for(int i=2;i<10;i++) {//for문은 )안에 구분은 ;를사용해준다
	 System.out.print(i+"*"+j+"="+(i)*j);
		System.out.print(" ");
	//	dan++;
	
	//디버그활용방법:변수에 체크,브레이크번호->벌레모양실행후 ->스위치실행
	//->확인후 오른쪽 위쪽 커피콩모양누르면 다시 복구됨
		}
		System.out.println();
		}
//	for(int i=0;i<11;i++) {//for문은 )안에 구분은 ;를사용해준다
//	System.out.print(i+2+"*2="+(i+2)*1);
//	System.out.print("\t ");
//		dan++;
//
//	}
//	System.out.println();
//	for(int i=0;i<11;i++) {//for문은 )안에 구분은 ;를사용해준다
//	System.out.print(i+2+"*2="+(i+2)*2);//(i+2)*2는 결과문
//	System.out.print("\t ");
////		dan++;
//	}
//	System.out.println();
//	for(int i=0;i<11;i++) {//for문은 )안에 구분은 ;를사용해준다
//		System.out.print(i+2+"*3="+(i+2)*3);//(i+2)*2는 결과문
//		System.out.print("\t ");
//}
 
	}
}