package interface_;

public class Wrrier extends character implements Defensible,Attack{ 

	public static void attack() {
		System.out.println("전사공격");
System.out.println(damage);
	}
	@Override //오버라이딩 재정의
	public void defen() {
		// TODO Auto-generated method stub
		
	}

}
