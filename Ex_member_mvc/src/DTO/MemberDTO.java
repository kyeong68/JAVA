package DTO;

public class MemberDTO {

	
	
		//DTO = VO (얼추 비슷함)
	//Data Transfer Object
	// 테이블 1개당 1개의 객체를 가지고 있어야합니다
	// 데이터 변환객체 VO(데이터 자체를 표현하는 객체)-- MemberDTO member 테이블에 있는 정보들 담아주겠습니다
	
	//member 테이블에 있는컬럼 전부 작성
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// 생성자?-역할 : 객체를 생성할때 최초로 실행하는 코드
	// 생성자 생김새 :  클래스명과 동일 대소문자도 구분 (완전히 똑같이)
	// 		리턴타입 : 아예 작성하지 않습니다
	
	
	
	public MemberDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
