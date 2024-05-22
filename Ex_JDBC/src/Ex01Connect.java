import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01Connect {

	public static void main(String[]args) {
		
		
	//1. 데이터 베이스 연결
		// 동적로딩 - 내가어떠한 데이터베이스를 사용할지 작성
		//Class.forName(어떠한 데이터베이스를 사용할지 문자열)
		
		try {//try - catch문은 예외처리
			//try - 시도하라고 합니다!
			// 만약에 에러가 나면 catch문 이동 -> catch문 안에 있는 문장이 실행!
			
			
			
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 에러종류 2가지
		//런타임에러 / 컴파일에러
		//런타임에러 -> 오타
		//컴퍼일에러 -> 실행시 에러
		
		
		//DB연결 -> DriveManger.getConnection()메소드를 실행
		//(url ,dbuser, dbpw
		
		//DB 계정 id, pw (받으면 user, pw 만바꿔주면됨)
		String user ="service";
		String pw ="12345";
		
		//url 외우지 마세요
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//url 설명
		//jdbc:oracle:thin -> oracle에서 제공한 주소
		//127.0.0.1 -> localhost IP주소 작성 
		//1521 -> 오라클사의 포트번호
		//xe : 현재 사용하고 있는 db 버전 이름
		
		
			
		Connection conn=DriverManager.getConnection(url, user, pw);
		
		if(conn !=null) {
			
			System.out.println("연결성공");
		}else {
			System.out.println("연결실패");
		}
		
		
			
		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();// 어디서 에러간난지 알려주는 코드
		}
		
		
		
	}
}
