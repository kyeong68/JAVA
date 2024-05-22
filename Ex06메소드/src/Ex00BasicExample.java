import javax.annotation.processing.SupportedSourceVersion;

public class Ex00BasicExample {

	public static void main(String[] args) {

		
//	System.out.println(plus(3,4));
//	System.out.println(minus(5,4));
//	System.out.println(conVstr(-2));
//	System.out.println(aliquot (2,-4));
//	System.out.println(isPerfnum(6));
	System.out.println(fibo(40));
	}

//	public static int plus(int num1, int num2) {
//	//방법 1.
//	int num3 = num1+num2;
//	return num3;  
//	
//	}
//	private static int minus(int num1,int num2) {
//		// 방법 2.
//		return num1-num2;
//	}
		
//			
//	
//  int num = -5;
//      
//      System.out.println(identi(num));
//
//   }
//   
//   public static String identi(int num) {
//      
//      String pp;
//      
//      if(num >0) {
//         pp = "양수입니다.";
//         return pp;         
//      }else{
//         pp = "음수입니다.";
//         return pp;
//      }
//				

//      }
//   
//      public static String conVstr(int num) {
//      
//    	  //num이 양수면 "양수입니다' 음수면 "음수입니다"0이면"0입니다"를 리턴
//    	  
//    	  if(num>0) {
//    		  return "양수입니다";
//    	  }else if (num<0) {
//    	  return "음수입니다";
//    	  }
     



	//약수구하기
	
//     public static boolean aliquot (int num1,int num2) {
//      
//       return  num1%num2==0;//비교연산의 결과는 언제나 boolean
//       //이니까 굳이 조건문 안써도 된다
//    
//      }
//     
//     
//
//	//완전수 구하기(자신을 제외한 약수들의 합==자신)
//	public static boolean isPerfnum(int num ) {
//		int sum = 0;
//		for(int i=1; i<=num/2;i++) {
//			
//			if(num%i==0) {
//				sum+=i;
//			}
//			
//		}
//		return sum==num;
		
		
		
		
	



	

	//근거리 알고리즘
	
//	private static int closer10(int num1,num2) {
//	//num과 10의거리, num2와 10의 거리 측정 후 비교.
//		
//		//1. 10이랑 각각의 수를 비교해서 num1 -10 할지 10-num1할지 선택.
//		
//		//2. 값을 뺀 뒤에 절대값을 구해서 비교해보기. -> java의 도구 중 Math클래스를 이용.
//		
//		//3. 빼고 제곱해버리기.
//		
//		
//		int dis_num1= Math.abs(10-num1);
//		int dis_num2= Math.abs(10-num2);
//		
//		return dis_num1>dis_num2?num2:num1;
		
		
//	fibo수열
//피보나치 수열의 n번째 항을 계산하여 리턴하는 fibo 메소드 설계.
//n      결과
//1		1
//2		1
//3		2(1번항+2번항)
//4		3(2번항+3번항)	
//5		5(3번항+4번항)	
//6		8	
//7		13	
//8		21

	public static int fibo(int n) {
	  if(n==1||n==2) {
		  return 1;
//	  }else if(n==3) {
//		  return fibo(1)+fibo(2);
//		  
//	  }else if(n==4) {
//		  return fibo(2)+fibo(3);
//	  }else if(n==4) {
//		  return fibo(2)+fibo(3);
	  }else {
		  return fibo(n-2)+fibo(n-1);
		  
		  
	  }

}
}
	
	


      
   
   
	
	
	
	

