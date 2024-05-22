package arraylist;

import java.util.ArrayList;

public class Ex00Basic {

	public static void main(String[] args) {
		//1. ArrayList 만들기
		//int[] 변수명 = new int[배열의크기];
		
		//ArrayList<데이터타입>변수명 = new ArrayList<>();
		
		//ex01) 우리팀원을 담아둘 수 있는 ArrayList 만들기.
		//new 뒤에 생략이 가능하다.
		ArrayList<String> names = new ArrayList<>();
		
		//1. 팀원이름 추가하기
		names.add("김경민");
		names.add("유승영");
		names.add(1,"송승호");
		
		//2. 팀원 출력하기
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		//3. 팀원 삭제하기
		names.remove(1);
		System.out.println(names.get(0));
		System.out.println(names.get(1));
//		System.out.println(names.get(2));
		names.add("송승영");
		names.add("송승영");
		names.add("송승영");
		names.remove("송승영");
		
		System.out.println("============");
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
//		System.out.println(names.get(4));
		System.out.println("==========2번 인덱스 출력");
		//팀원변경하기.
		names.set(2,"김경민");
		System.out.println(names.get(2));
		
	System.out.println(names.size());
	
 		
//=========================================
		ArrayList<Integer> nums = new ArrayList<>();
		// Integer, Double, Float, Byte, Short, Long, Character,Boolean  
		ArrayList<Double> nums2 = new ArrayList<>();
		ArrayList<Float> nums3 = new ArrayList<>();
		ArrayList<Byte> nums4 = new ArrayList<>();
		ArrayList<Short> nums5 = new ArrayList<>();
		ArrayList<Character> nums6 = new ArrayList<>();
		ArrayList<Boolean> nums7 = new ArrayList<>();
	//ArrayList <> 안에는 Wrapper Class가 들어간다.
		
		
		
		
		
		
		
	}
}
