package _2차원배열;

public class Ex03반대방향 {

	public static void main(String[] args) {
	
		
	   // 입력부
    int[][] array = new int[5][5];

    int cnt = 1;

    // 1 ~ 25 정수를 입력하는 이중 for문
    for (int j = 0; j < array.length; j++) { // j : 행, i : 열
       for (int i = 0; i < array[j].length; i++) {
          array[j][i] = cnt++;
       }
    }
    
    // 출력부
    for(int j = 0; j < array.length; j++) {
       for(int i = 0; i < array[j].length; i++) {//정방향
          System.out.print(array[j][4-i] + "\t");//반대방향
       }
       System.out.println();
    }	

	
	// 0행출력
	System.out.print(array[0][4]+"\t");
	System.out.print(array[0][3]+"\t");
	System.out.print(array[0][2]+"\t");
	System.out.print(array[0][1]+"\t");
	System.out.print(array[0][0]+"\t");
	System.out.println();
	
	//1행출력
	System.out.print(array[1][4]+"\t");
	System.out.print(array[1][3]+"\t");
	System.out.print(array[1][2]+"\t");
	System.out.print(array[1][1]+"\t");
	System.out.print(array[1][0]+"\t");
	System.out.println();
	
	
	
	
	
	}
}



