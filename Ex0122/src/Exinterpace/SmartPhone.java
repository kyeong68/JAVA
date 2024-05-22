package Exinterpace;

public class SmartPhone implements Smartphone_interface,Camera_interface{

	//인터페이스는 다중구현이 가능합니다
	
	
	@Override
	public void call() {
		
		System.out.println("스마트폰 전화 걸기");
		
	}

	@Override
	public void receive() {
	System.out.println("스마트폰 전화 받기");
		
	}

	@Override
	public void internet() {
		System.out.println("스마트폰 인터넷 하기");
		
	}

	@Override
	public void pick() {
		System.out.println("스마트폰 사진찍기");
		
	}

}
