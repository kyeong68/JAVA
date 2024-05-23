package extends_;


public class Fish extends Animal {
	Fish(){
		myClass = "난 광어";
	}

	@Override // 참조 주석.
	void breath() {
		System.out.println(myClass+ "야 물에서 숨쉬니?. ");
		
	}
	
	
	
	
}
