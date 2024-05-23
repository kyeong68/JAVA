package extends_;

public class Sparrow extends Birds {
	Sparrow(){ // 접근자 생략하면 디폴트가 되서 패키지내에서 다 접근.
		myClass = "난 참새";
		sound = "짹~~~!!잭~~~!! ";
	}
	
	void shouting() {
		System.out.println(myClass +"라서 짹~~짹~~짹~~ 울어.");
	}
	
	
	
}
