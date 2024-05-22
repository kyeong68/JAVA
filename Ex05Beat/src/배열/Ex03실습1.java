package 배열;

import java.util.Scanner;

public class Ex03실습1 {

	public static void main(String[] args) {
		
		// 문자열(String) 데이터를 담을 수 있는 arrStr 선언
		String[] arrStr; //주소 값
		
		//arrStr 에 문자열 데이터 10개를 담을 수 있는 배열 생성 (new)
		arrStr  = new String[10];
		
		// 0번 ~ 4번 인덱스 차례대로 JAVA, HTML, DB, PYTHON, CSS ,삽입
		arrStr[0] = "JAVA";
		arrStr[1] = "HTML";
		arrStr[2] = "DB";
		arrStr[3] = "PYTHON";
		arrStr[4] = "CSS";
		// for문 사용해서ㅓ arrStr에 들어있는 데이터 출력하기
	   
  for(int i =0; i<arrStr.length; i++ ) {
	  System.out.print(arrStr[i] + " ");
  }
  }
		
		
		
		
		
	}


