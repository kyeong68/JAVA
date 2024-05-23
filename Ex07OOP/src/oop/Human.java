package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human {
	String name;
	int helth;
	int knowledge;
	int kg;
	int length;
	int age;
	int footSize;
	List<String> teamMember2 = new ArrayList<>();
	String[] teamMember = new String[4];
	
	// 생성자	
	public Human() {
		
	}
	public Human(int kg, int length, int age, int footSize) {
	//	super();
		this.kg = kg;
		this.length = length;
		this.age = age;
	}


	public void eat() {
		kg++;
		System.out.println("현재몸무게: "+ kg);
	}
	
	public int eat2(int wei) {
		kg += wei;
		System.out.println("현재몸무게: "+ kg);
		return kg;
	}
	
	public int feeding(int num) {
		kg++;
		System.out.println("현재몸무게: "+ kg);
		return num;
	}
	
	Scanner sc = new Scanner(System.in);
	public void pushMember(String a) {
		boolean ck = true;
		while(ck ) {
			if(a.equals("송승호")) { ck = false; break;}
			teamMember2.add(a);
			System.out.print("입력할 맴버 :");
			a = sc.next();
		}
		System.out.println(teamMember2);
	}
	
	
	public void callMember() {
		System.out.print("인혜팀은 :");
		for(String x: teamMember2) {
			System.out.print(" ,"+ x);
		}
		System.out.println("입니다.");
	}
	
	
	

	

}
