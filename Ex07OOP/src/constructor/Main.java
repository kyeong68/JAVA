package constructor;

public class Main {
	static String brand;

	public static void main(String[] args) {
		// 1.기본생성자를 이요해서 객체 생성시 초기작업과 초기값이 알맞게 입력되었는지 확인하기.
		Restaurant restA = new Restaurant();
		System.out.println(restA.address);
		System.out.println(restA.money);
	
		// 2. 매개변수로 초기값을 받아노는 생성자를  가지는 객체만들기.
		Restaurant restB = 	new Restaurant("목포시 청호중", 5000);
		System.out.println(restB.address + restB.money );

		// 3. 생성자를 이용해서 매개변수를 강제할수 있다.
       // Restaurant reatC = new Restaurant(351);
		
		
		
		
		
		
	}

}
