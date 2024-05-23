package view;

import java.util.ArrayList;
import java.util.Scanner;
import DTO.PhoneDTO;
import model.PhoneDAO;

public class Phone_main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      PhoneDAO pdao = new PhoneDAO();  // 데이터 조회하기 위해 데이터 접근 객체가 필요함.
      
      while(true) {
         System.out.println("==========전화번호 관리부===========");
         System.out.println("1.전체 번호 조회 2.번호 추가 3.회원번호 삭제 4. 번호 수정 5. 이름으로 번호찾기 6. 종료");
         
         int choice = sc.nextInt();
         if(choice == 6) {
            System.out.println("프로그램 종료");
               break;
         } else if(choice == 1) { // 전체 번호 조회
            ArrayList<PhoneDTO> allPhone = pdao.allPhoneData(); // pdao.allPhoneData()가 arrList뱉음.
            
            for(PhoneDTO data: allPhone) {
               System.out.print("이름: "+ data.getName()+ " ");
               System.out.print("폰번: "+ data.getPhone_num()+ " ");
               System.out.print("나이: "+ data.getAge()+ " ");
               System.out.println("====================================");               
            }
            
         } else if(choice == 2) { // 번호 추가 페이지
            System.out.print("번호 추가 페이지 입니다. 번호, 이름, 나이를 입력 해주세요.");
            System.out.print("이름을 입력하세요 : ");
               String join_name = sc.next();
               
               System.out.print("핸드폰 번호를 입력하세요 : ");
               String join_phoneNum = sc.next();
               
               System.out.print("age를 입력하세요 :");
               int join_age = sc.nextInt();
               
               PhoneDTO pdto = new PhoneDTO(join_name, join_phoneNum, join_age); // 해당정보를 obj에 담아줌.
               int row = pdao.insertPhone(pdto);  //요 메서드 실행하면 int 뱉어줌.
               
               if(row > 0) {
                  System.out.println("정상적으로 추가 되었습니다.");
               } else {
                  System.out.println("정상 추가되지 않았습니다. ");
               }
               
         } else if(choice == 3){ // 번호 삭제 페이지
            System.out.println("회원정보 삭제 페이지 입니다.");
            System.out.print("삭제할 이름을 입력해 주세요. : ");
            String delete_name = sc.next();
             int row = pdao.deletePhone(delete_name);
             
             if(row > 0) {
                System.out.println("정상적으로 삭제 되었습니다.");
             } else {
                System.out.println("삭제가 안되었습니다.");
             }
             
         } else if(choice == 4) { // 번호 수정 페이지
            System.out.println("번호 수정 페이지 입니다.");
            
             System.out.print("바꿀 이름을 입력하세요 : ");
               String update_name = sc.next();
                
               System.out.print("바꿀 번호를 입력하세요 : ");
               String update_phone = sc.next();
               
               int row = pdao.updatePhone(update_name, update_phone); //요 메서드 실행하면 int 뱉어줌.
               if(row > 0) { System.out.println("정상적으로 번호가 변경 되었습니다."); }
               else {System.out.println("번호 변경이 실패 했습니다.");}
               
         } else if(choice == 5) { // 이름으로 번호찾기 페이지
             System.out.println("이름으로 번호 찾아 드릴게요.");
             System.out.print("찾을 이름을 입력하세요 : ");
               String search_name = sc.next();
               
               PhoneDTO pdto = pdao.searchPhone(search_name); // DAO메소드에서 찾은 데이터를 객체에 담아 뱉어준다.
             
             if(pdto != null) { // 정상적으로 객체에 데이터가 담겨있다면. 아래코드 실행.
                System.out.print("이름 : "+ pdto.getName() + " 폰번호 : " + pdto.getPhone_num()+" 입니다.");
             } else { System.out.println("해당 이름의 정보가 없습니다."); }
            
         } else { // 그외 번호 입력시
            System.out.println("잘몰 누르셨습니다.");
         }

         
      }
      
      
      

   }

}