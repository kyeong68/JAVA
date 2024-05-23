package DTO;

public class PhoneDTO {
   // DTO = VO 둘중 하나써도 상관없다.
      // Data Transfer Object -- 데이터가 하나씩 담길 객체
      // 데이터 자체를 담고있을 객체(db 가지고 온 데이터를 한줄을 담고 있다.)
       // DB내 컬럼의 갯수와 일치(이름은 일치X -> 일치를 추천: 햇갈리까.)
      // 테이블 1당 1개의 객체를 가지고 잇어야한다.
      // 데이터 변환 객체 -- PhoneDTO PHONE테이블에 있는 정보를 담아주겠습니다!.
       // 클래스는 접근제한자 생략하면 dafault 인터페이스는 접근제한자 생략하면 public.
      
      //PHONE 테이블에 있는 컬럼 전부 작성!.
      private String name; // 외부에서 접근불가
      private String phone_num;
      private int age;
      
      // 생성자 - 역할: 객체를 생성할때 최초로 실행하는 코드.
      // 생성자 리턴타입 작성하지 않음.
      public PhoneDTO(String name, String phone_num, int age) {
         this.name = name;
         this.phone_num = phone_num;
         this.age = age;
      }

      
      // getter
      public String getName() {
         return name;
      }

      public String getPhone_num() {
         return phone_num;
      }

      public int getAge() {
         return age;
      }
   
}