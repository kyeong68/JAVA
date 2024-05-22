package for문;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		// 정수 2개를 입력받기.base/ n    =?  base^n
		
		Scanner scan = new Scanner(System.in);
		System.out.print("base : ");
		int base =scan.nextInt();
		
		System.out.print("n : ");
		int n =scan.nextInt();
		
		int result=1;
		for(int i=0;i<n;i++) {
			result*=base;
					
		
	}
System.out.println("result : "+result);
}
}
