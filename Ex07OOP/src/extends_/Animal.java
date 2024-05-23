package extends_;

public class Animal {
	// 생략하면 접근자가 디폴트 이다  요아래 쓴 메서드와 필드가 모두 접근자 디폴트이다.
	String myClass;
	String sound;
	
	// 생성자.
	Animal(){
		myClass = "동물";
		sound = "호다닥";
	}

	void show () {
		System.out.println(myClass);
	}
	
	void move () {
		System.out.println(myClass+ "야 살아 움직인다.");
	}
	
	void breath () {
		System.out.println(myClass+ "야 살아 숨쉰다.");
	}
	
	void shouting () {
		System.out.println(myClass + "야 울어라. 알았지?");
	}
	
	
	
}
