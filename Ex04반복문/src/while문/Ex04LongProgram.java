package while문;

import java.util.Scanner;

public class Ex04LongProgram {

	public static void main(String[] args) {
		
		//1. 사용자의 입력받기
		
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		
		boolean run = true;
		while(run) {
			System.out.println("ID : ");
			String id = sc.next();
			System.out.println("PW : ");
			String pw = sc.next();
			
			//로그인 성공의 경우
			if(id.equals("user")&& pw.equals("pass")) {
				System.out.println("로그인성공");
				break;
				
			}else { 
				System.out.println("로그인 실패");
				cnt++;
				
				if(cnt==3) {
					System.out.println("본인인증을 해주세요.");
					break;
				}
				while(true) {//계속 로그인 진행할것인지 묻는 구문.
					System.out.println("계속하시겠습니까?(Y/N)");
					String yesNo = sc.next();
					
					if(yesNo.equals("N")||yesNo.equals("n")) {//사용자가 N을 사용할 경우
					 run = false;	
						break;
					}else if(yesNo.equals("Y")|| yesNo.equals("y")) { //사용자가 Y를 선택할경우
						break;
					}else { //그 외의 잘못된 선택을 할 경우.
							System.out.println("잘못된 입력입니다.");
							
					}
				}
				
				
			}
			
			
			
			
			
			
			
			
		}

	}

}
