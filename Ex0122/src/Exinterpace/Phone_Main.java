package Exinterpace;

public class Phone_Main {

	public static void main(String[] args) {
		
		SmartPhone sp =new SmartPhone();
		sp.call();
		sp.receive();
		sp.internet();
		sp.sendMessage();
		
		// 인터페이스는 추상클래스와 만찬가지로 객체 생성 할수 없습니다.
		
		//업캐스팅, 다운캐스팅 
		Smartphone_interface spi = new SmartPhone();//업케스팅
		
		
		
	
	
	}

}
