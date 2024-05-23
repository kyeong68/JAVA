package extends_;

public class Birds extends Animal{ // 동물 상속
	
	Birds(){ // 접근자 생략하면 디폴트가 되서 패키지내에서 다 접근.
		myClass = "새";
	}
	
	void fly() {
		System.out.println(" 난다.");
	}
}
