package oop;

import java.util.Scanner;

public class HumanMain {

	public static void main(String[] args) {
		// 송승호 객체 만들기.
		Human human1 = new Human();
		Human human2 = new Human();
		Human human3 = new Human(30, 190,15, 230);
		// human1에 데이터 넣어주기.
		
		human1.name = "송승호";
		human1.age= 60;
		human1.footSize = 255;
		human1.kg = 68;
		human1.knowledge = 50;
		human1.helth = 100;
		human1.length = 177;
		
		human2.name = "오진희";
		human2.kg = 40;
		int nowWei = human2.eat2(5);
		System.out.println(human3.kg);
		human3.eat2(nowWei);
		
		
		
		human1.eat();
		human1.eat();
		human1.eat();
		
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("입력할 맴버 :");
//			String mb =sc.next();
//			if(mb == "송승호") { break;}
//			human1.pushMember(sc.next());
//		}
		System.out.print("입력할 맴버 :");
		human1.pushMember(sc.next());
	
		human1.callMember();
		
		
		

	}

}
