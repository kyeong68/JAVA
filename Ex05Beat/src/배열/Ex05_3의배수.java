package 배열;

import java.util.Scanner;

public class Ex05_3의배수 {

	public static void main(String[] args) {
		// 숫자를 입력받아 3의 배수인 숫자를 출력하기.
		
		//1.배열만들기
		int[] numbers = new int[10];
	   
		Scanner sc = new Scanner(System.in);
		
		//1.배열에 값을 넣는 for문
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(i+1+"첫번째 정수 입력>>");
			numbers[i]=sc.nextInt();     //numbers의 몇번째
		}
			
	    //2. 배열에 값을 꺼내는 for문	
	    for(int i=0;i<numbers.length;i++) {	
	    	if(numbers[i]%3==0) {
	    	System.out.print(numbers[i]+" ");
	    	}
	  
	    }
	
		
		
		
			
		}
	}


