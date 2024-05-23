package 추상화;

public class PenguinGenerator {

	public static void main(String[] args) {
		// 펭수 만들기.
		Penguin pengsu = new Penguin();
		pengsu.name = "펭수";
		pengsu.age = 10;
		pengsu.hi();
		
		Penguin pororo = new Penguin();
		pororo.name = "뽀로로";
		pororo.age = 24;
		pororo.hi();
		
		System.out.println(pororo.countOFtail);
		
		
		

	}

}
