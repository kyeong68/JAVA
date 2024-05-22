package 조건연산자;

public class Ex01 {

	public static void main(String[] args) {
		
		int j,k,l,result;
		j=10;
		k=20;
		l=30;
		result = j<k?k++:--l;
		System.out.println(result+","+k+","+l);//20
		

	}

}
