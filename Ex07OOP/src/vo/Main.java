package vo;

public class Main {

	public static void main(String[] args) {
		UserVO user1 = new UserVO("송승호", "riricos153@네이버", "진희");
		UserVO user2 = new UserVO("송승호", "riricos153@네이버", "진희");
		UserTestVO user3 = new UserTestVO("오진희", "네이버", "123456");
		// user1.name = "오종원";
	//	System.out.println(user1.name);
		System.out.println(user1.getName());
		System.out.println(user1.getEmail());
		System.out.println(user1.getPassword());
		
		System.out.println(user1.equals(user2));
		System.out.println(user1);
		System.out.println(user3);

		

	}


	
	

}
