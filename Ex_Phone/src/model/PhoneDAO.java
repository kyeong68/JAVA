package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.PhoneDTO;

public class PhoneDAO { // 여기는 거의 기능만 구현함.
   // 데이터를 접근해서 가져오자.
   private Connection conn; // 이안에서만 접근 가능.
   private PreparedStatement psmt; // 이안에서만 접근 가능.
   private ResultSet rs; // 이안에서만 접근 가능.
   
       // DAO란?
      // Data Access Object
      // 데이터 접근 객체.
      // 데이터베이스에 접근하여 insert,delete, update, select할 예정
      
      // DAO 객체 특징
       // 테이블 1개당 1개의 DAO객체를 가지고 있다.
      // 모든 기능은 메서드로 작성하게 된다.
      
      // 객체 지향 프로그래밍
      // 객체간 서로 메세지를 주고 받는 프로그래밍. // 파라미터로 넘긴다.
      
      // Connect 메소드 
   
   
       // Connect 메소드
      private void getConn() { // DB연결 메소드,  외부에서 접근 못하게 숨겨버리자. 
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // 어떤 db를 사용할것인지.
            
            String user = "service";
              String pw = "12345";
              String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
              
              conn = DriverManager.getConnection(url, user, pw); // 이메서드를 통해서 연결이됨.
              if(conn != null) {
                 System.out.println("연결 성공");
              }else {
                 System.out.println("연결 실패");
              }
            
         } catch (ClassNotFoundException | SQLException e) {      
            e.printStackTrace();
         }
      }
      
      
      // close하는 메서드
      private void allClose() {
         try {
            if(rs != null){rs.close();}
            if(psmt != null){psmt.close();}
            if(conn != null){conn.close();}
         } catch (SQLException e) { // close()에서 SQLException에러가 발생할수 있어서 요기 catch문에서 에러 받아준다.
               e.printStackTrace();
          }
      }
      
      
      // delete기능 메서드
      public int deletePhone(String delete_name) { 
         // 각메소드 마다 db연결 해주자.
         getConn();
         
         try {
            //sql통과 통로
            String sql = "delete from phone where name = ?";
            psmt = conn.prepareStatement(sql); // 내생각 // conn통로에 sql문 넣주고.
            
            // sql문 psmt통로 넘겨 주기전에 ?채우기 - ?가 없으면 생략.
            psmt.setString(1, delete_name);
            
            int row = psmt.executeUpdate(); // ? 채웠으니 psmt통로로 보내버리자. 그럼 정수를 뱉음.
            return row; // sql문장 정상 실행된 갯수를 뱉는다.
            // 만약 데이터베이스가 비었다면, 실행될수 있는 문장이 없으므로 0리턴한다.
         } catch(SQLException e){
             e.printStackTrace();
             return 0;  // sql문이 실패했다면 실행된 문장이 없으므로 0이나 음수 리턴.            
         } finally {
            // 이메소드에서 할일 끝났으니 문닫자.
            allClose();
         }
      }
      
   
      // update기능 메서드
      public int updatePhone(String update_name, String update_phone) {
         // 각메소드 마다 db연결 해주자.
         getConn();
         
         try {
            //sql통과 통로
            String sql = "update phone set phone = ? where name = ?";
            psmt = conn.prepareStatement(sql); // 내생각 // conn통로에 sql문 넣주고.
            
            // sql문 psmt통로 넘겨 주기전에 ?채우기 - ?가 없으면 생략.
            psmt.setString(1, update_phone);
            psmt.setString(2, update_name);
            
            int row = psmt.executeUpdate(); // ? 채웠으니 psmt통로로 보내버리자. 그럼 정수를 뱉음.
            return row; // sql문장 정상 실행된 갯수를 뱉는다.
            
         } catch(SQLException e) {
            e.printStackTrace();
             return 0;  // sql문이 실패했다면 실행된 문장이 없으므로 0이나 음수 리턴.
         } finally {
            // 이메소드에서 할일 끝났으니 문닫자.
            allClose();
         }
      }
   
   
      // insert기능 메서드
      public int insertPhone (PhoneDTO pdto) {
         // 각메소드 마다 db연결 해주자.
         getConn();
         
         try {
            // 데이터를 추가해줘야 하기때문에 sql문이 필요하다.
            String sql = "insert into phone values(?,?,?)";
            // sql문 작성했으면 conn통로로 넣어주자.
            psmt = conn.prepareStatement(sql);
            
            // sql문 psmt통로 넘겨 주기전에 ?채우기 - ?가 없으면 생략.
            psmt.setString(1, pdto.getName());
            psmt.setString(2, pdto.getPhone_num());
            psmt.setInt(3, pdto.getAge());
            
            int row = psmt.executeUpdate(); // ? 채웠으니 psmt통로로 보내버리자. 그럼 정수를 뱉음.
            return row; // sql문장 정상 실행된 갯수를 뱉는다.
            
         } catch(SQLException e) {
            e.printStackTrace();
             return 0;  // sql문이 실패했다면 실행된 문장이 없으므로 0이나 음수 리턴.
         } finally {
            // 이메소드에서 할일 끝났으니 문닫자.
            allClose();
         }
      }
      
   
      // select기능 메서드
      public ArrayList<PhoneDTO> allPhoneData(){
         // 전체 번호 조회.
         // db의 각데이터 튜플을 arrlist에 넣어서 보내줄꺼다.
         ArrayList<PhoneDTO> phoneList = new ArrayList<PhoneDTO>();
         
         getConn();
         try {
            //sql통과 통로
            
            String sql = "select * from phone";
            psmt = conn.prepareStatement(sql);
            
             //?채우기 - ?가 없으면 생략 
            rs = psmt.executeQuery(); // select 해당 데이터 한줄씩 다가져 와야하므로.
            
            //select 한줄의 데이터 확인 rs.next()
              // 이게 핵심.
            while(rs.next()) {
               String phone_phone = rs.getString(1); // getString("컬럼이름이나 위치번호")
                   String phone_name = rs.getString(2);
                   int phone_age = rs.getInt(3);
                   
                   //이데이터를 만둘어둔 DTO클래스 객체에 담을거야.
               PhoneDTO pdto = new PhoneDTO(phone_name,phone_phone,phone_age);
               phoneList.add(pdto);
            }
            return phoneList;
            
         } catch (SQLException e) {
              e.printStackTrace();
              return null;
          } finally {
            // 이메소드에서 할일 끝났으니 문닫자.
            allClose();
         }
      }
   
   
      // search기능 메서드
      public PhoneDTO searchPhone(String search_name) {
         // 각메소드 마다 db연결 해주자.
         getConn();
         
         try {
             //sql통과 통로
            String sql = "select * from phone where name = ?";
            psmt = conn.prepareStatement(sql); // psmt 문 열었고
            
             // sql문 psmt통로 넘겨 주기전에 ?채우기 - ?가 없으면 생략.
            psmt.setString(1, search_name);
            
            rs = psmt.executeQuery(); // 여긴 sql - select문이 executeQuery()를 써야함.
            
            if(rs.next()) {
               String name = rs.getString("name");
               String phone = rs.getString("phone_number");
               int age = rs.getInt("age");
               
               PhoneDTO pdto = new PhoneDTO(name, phone, age); // obj에 담아서 뱉어줄거야.
               return pdto;
            } else {return null;}
            
         } catch (SQLException e) {
              e.printStackTrace();
              return null;
          } finally {
            // 이메소드에서 할일 끝났으니 문닫자.
            allClose();
         }
      }
      
   
   
}