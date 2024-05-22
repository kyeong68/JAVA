import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex04_update {

	
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
		
	String sql ="update member set name ='tast' where id ='tast1' ";
	
	
	 psmt = conn.prepareStatement(sql);
	
	//sql통과 할 수 있는 코드
	
	int row = psmt.executeUpdate();
		
	if(row>0) {
		
		System.out.println("Update success");
	}else
		System.out.println("Update fail");
		}
		
		//닫기
		//통로를 모두 닫을겁니다.
		//psmt - sql통과 할 수 있는 통로
		//conn - db- java연결 통로
		
		
		
		
		
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
		
		try {
		
		if(psmt != null) psmt.close();
		if(conn != null) conn.close();
		
	} catch (SQLException e) {
				e.printStackTrace();
			}
	
	
	
	
	
	
	
	}
	}
		
		
		
		
		
		
		
		
		
		
		

	}


