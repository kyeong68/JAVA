package for문;

import java.util.Scanner;

public class Ex002For문예제2 {

	public static void main(String[] args) {
		
//	1.사용자 결과물 출력하기.
//		예제2)1+2+3+4+5~100결과를 출력
//		1-2+3-4+5 ~ -100결과출력
		
		
		
		
		
		
//		for(초기값;for문이동작하기위한 조건;초기값으로지정한변수가 몇씩증가할것인지){
//	}
		int sum=0;	
		for(int i=1;i<101;i++) {
		 sum=i;//sum+=i
		}
	System.out.println(sum);
	
	//2. 1-2+3-4+5 ..........+99-100
	
	int sum2=0;
	for(int i=1;i<101;i++) {
		if(i%2==0) {//짝수인경우
		sum2 -=i;
		}else {//홀수인경우
		sum2+=i;
		}
	}
		System.out.println(sum2);		
				
		//3. (77*1)+(76*2)+(75*3)+....+(1*77)
		int cnt = 1;//count 함수사용
		int sum3 = 0;
		for(int i=77;i>0;i--) {
			sum3+=(i*cnt);//sum3=sum3(i*cnt)
			cnt++;//cnt=cnt=1->cnt+=1;			

	}
System.out.println(sum3);
}
}
