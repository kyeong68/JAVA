package 다중For문;

public class Ex01구구단 {

	public static void main(String[] args) {
		
//		//2단 
//		for(int i =1; i <= 9; i++) {
//		System.out.println(2 + "*" + 1+ "=" + (2*1));	
//		}
//		//3단
//		for(int i =1; i <= 9; i++) {
//			System.out.println(3 + "*" + 1+ "=" + (2*1));	
//	}
//		//4단
//		for(int i =1; i <= 9; i++) {
//			System.out.println(4 + "*" + 1+ "=" + (2*1));		
//	}

	for(int j=2; j <=9; j++) {
		
			
	System.out.println("==" + j +"단==");
	for(int i =1; i <= 9; i++) {
	System.out.println(j + "*" + i+ "=" + (j*i));	
		}

	}				
}
}