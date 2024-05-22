import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class Ex05_select {

	public static void main(String[] args) {
		
		Connection conn =null;	//전역변수 지정해준다 실행문을 닫을때
		PreparedStatement psmt= null; // 전역변수 지정해준다 실행문을 닫을때
		
		//동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
						
			//DB연결
		
			String user = "service";
			String pw ="12345";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			
	 conn	= DriverManager.getConnection(url,user,pw);
			
	if(conn!=null) {
		System.out.println("연결 성공");
	}else {
		System.out.println("연결 실패");
	}
		
	//sql통로	
	
	String sql ="select * from member";
	 psmt = conn.prepareStatement(sql);
	
	//sql통과 할 수 있는 코드
	//insert, delete, update -psmt.executeUpdate()
	//select - psmt.executeQuery() 메소드 사용!
	// 왜??-> 결과값을 가지고 올수 있는 통로가 필요!
	 //통로는 1개의 역할만 가능
	 //Connection - 연결기능
	 //PreparStatment - sql 이동 기능
	 //ResultSet 통로 - select 결과 값을 담아서 가지고 오는 기능
	 // 커서객체 (가르키다)
	
	 		//닫기
		//통로를 모두 닫을겁니다.
		//psmt - sql통과 할 수 있는 통로
		//conn - db- java연결 통로
	 
	 ResultSet rs = psmt.executeQuery();
	// rs.next() : select 결과값에 데이터 유무를 보는 함수 
	 //  반환타입 boolean: 한줄의 데이터가 있으면 true, 없으면 false
	 // true일시 다음줄의 데이터 유무를 확인
	 
	 while(rs.next()) {//데이터가 false일때 까지
		 String select_id = rs.getString("id");
		 String select_pw = rs.getString("pw");
		 String select_name = rs.getString("name");
		 String select_age = rs.getString("age");
		 
		 System.out.println("id : "+select_id);
		 System.out.println("pw : "+select_pw);
		 System.out.println("name : "+select_name);
		 System.out.println("age : "+select_age);
		 
		 System.out.println("==========");

		
	 }
		}
			
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	finally {
		// 주의사항 
		//psmt통로는 conn안에 있습니다.
		//통로를 연 역순으로 닫아줍시다
		//통로를 연순서 -conn -psmt
		if(psmt!=null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
		
			}
		}
	}
	}
}


		
		
		
		
		
		
		
		

	


