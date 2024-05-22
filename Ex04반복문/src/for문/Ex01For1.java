package for문;

public class Ex01For1 {

	public static void main(String[] args) {
		
	//for (초기화구문; 검사조건; 반복후작업){
		//검사조건이 true일 때 실행문;
		//}
		
		for(int i = 21; i <= 57; i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		for(int i = 96; i>=53; i--) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		for(int i = 21; i <= 57; i++) {
			
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		

	}

}
