package _2차원배열;
import java.util.Scanner;

public class NNArray {

	public static void main(String[] args) {
		// 사용자 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수입력 : ");
		int n = 5; 
		int[][] array = new int[n][n];
		
		int cnt =1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=cnt++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
//				System.out.println(array[i][j]+"\t");
				
		System.out.printf("%5d",array[i][j]);
			}
		}
	}

}
