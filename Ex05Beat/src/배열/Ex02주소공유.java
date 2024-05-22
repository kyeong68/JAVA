package 배열;

public class Ex02주소공유 {

	public static void main(String[] args) {
		
		// 배열 -> 레퍼런스 변수 -> 주소 값 
		// 주소를 공유 가능 -> 배열을 공유 가능
		int[] intArray = new int[5];
		int[] myArray = intArray;
		
		System.out.println("intArray 주소 : "+ intArray);
		System.out.println("myArray 주소 : "+ myArray);
		
		intArray[1] = 1;
		myArray[2] = 2;
		
		for(int i=0; i < intArray.length; i++) {
		System.out.println(intArray[i]);
		}
		}
		
	
	
}	
	
