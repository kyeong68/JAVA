package ex_member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Ex01_member {// 여기 꼭외우면됩니다 그럼 할수 있습니다!!

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("회원관리 프로그램");
		System.out.println("1.전체회원조회 2.회원가입 3.회원정보 삭제 4.비밀번호수정 5.종료");
		
		int choice =sc.nextInt();
		if(choice ==5) {
			System.out.println("프로그램종료");
		break;
		}else if(choice ==1) {
			//전체회원조회 --select 문과 관련(EX05나06을 참고하기) 
			//동적로딩
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
		//DB연결
		String user = "service";
		String pw ="12345";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
				
		 Connection conn= DriverManager.getConnection(url,user,pw);
		 if(conn!=null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");	
		 
			}
		 
		//sql통과 통로
		 String sql ="select * from member";
		PreparedStatement psmt = conn.prepareStatement(sql);	
		 
		//채유기 --?가 없으면 생략
		
		//sql통과 하세요
		ResultSet  rs = psmt.executeQuery();
		
		//select 한줄의 데이터 확인 rs.next()
		while(rs.next()){//rs에 담겨서 온다 true일때만 돈다 
		String id =	rs.getString(1);
		String table_pw =	rs.getString(2);
		String name =	rs.getString(3);
		int age =	rs.getInt(4);
		
		System.out.println("id :"+id);
		System.out.println("pw :"+table_pw);
		System.out.println("namw :"+name);
		System.out.println("age :"+age);
		
		
		
		}
		}
		
		
		
		catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
			
			
			
		}else if(choice ==2) {
		
		}else if(choice ==3) {
			
		}else if(choice ==4) {
		
		}else  {
			System.out.println("잘못 눌렀습니다!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
			}
}
}

