package while문;

import java.util.Scanner;

public class Ex03OddEvencont {

	public static void main(String[] args) {
		// 입력된 숫자가 홀수와 짝수가 몇개 입력되었는지 출력하기.
		// -1을 입력하면 종류

		// 1. 사용자 입력받기
		Scanner sc = new Scanner(System.in);
		int odCnt = 0;
		int evCnt = 0;

		
		while(true) {
			System.out.println("숫자입력 : ");
			int num = sc.nextInt();

			//2. 입력한 값이 짝수인지 홀수인지 파악하고 카운트 올리기.
			if(num%2==0) {	 //짝수일떄
				evCnt++; // evCnt=evCnt+1; / evCnt+=1;
			}else {
				odCnt++;
			}
			// 3. 종료 조건 잡아주기.
			if(num==-1) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("짝수개수 : "+evCnt);
				System.out.println("홀수개수 : "+odCnt);

			}
		}


	}
}
