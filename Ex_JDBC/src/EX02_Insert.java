import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EX02_Insert {

	public static void main(String[] args) {
		
	//연결 - 동적로딩
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		//DB연결
		String user = "service";
		String pw ="12345";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = DriverManager.getConnection(url, user,pw);
	   // 커넥션 :통로이다(연결) 
		if(conn!=null) {
			System.out.println("연결 성공");
		}else {
			System.out.println("연결 실패");
		}
		//insert 구문 작성
		
		//sql문 통과 할 수 있는 통로를 열어봅시다!
		//통로이름 : PreparedStatement
		// 통로를 연수 있도록 실행코드 --> Connection안에 있습니다!
		// 실행코드의 이름 :prepareStatement(매개변수 sql문 작성)
		
		String sql ="insert into member values('test2','1234','test2',20)";
		PreparedStatement psmt = conn.prepareStatement(sql);//sql열어주는통로
		
		//sql문 이동 코드 작성
		//sql문 이동코드 -> 	preparedStatment 안에 있습니다!
		//이동코드 이름 : executUpdate(),executQuery()
		int row = psmt.executeUpdate();//sql실행해라! 리턴타입은 int이다
		
		//executeUpdate-> int를 리턴
		// int를 리턴하는 이유 : 실행 문장 수를 DB가 뱉어줍니다!
		
		if(row>0) {
			
			System.out.println("insert success");
			
		}else {
			System.out.println("insert fail");
		}
		
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
	
		e.printStackTrace();
	
	}
	
	

	}

}
