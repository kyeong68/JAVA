package dowhile문;

import java.util.Scanner;

public class Ex03Diet {

	public static void main(String[] args) {
		
		
		// 현재 몸무게를 담는 변수
		int pw;
		// 목표 몸무게를 담는 변수
		int gw;
		// 주차마다 뺀 몸무게를 담는 변수
		int wei;
		// 주차를 샐 수 있는 변수
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");	
		pw = sc.nextInt(); // 현재몸무게를 담는 변수설정
		
		System.out.print("목표 몸무게 : ");	
		gw = sc.nextInt(); //목표 몸무게 담는변수 설정

     		
		do {
		System.out.print(++num+ "주차 감량 몸무게 : ");
		wei =sc.nextInt();	//주차마다 뺀 몸무게
		
			
		pw= pw-wei;//현재몸무게-주차몸무게 뺀후 현재몸무게를 설정해준다
		
		} while(pw>=gw); 
		System.out.println(pw +"kg 달성! 축하합니다!");
		
		
		
	

		
		
		
		
	}

}
