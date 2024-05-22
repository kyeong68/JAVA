package ex02;

import java.util.ArrayList;
import java.util.Scanner;

import Ex01.student;

public class Main {
	
	public static void main(String[] args) {
		

		ArrayList<student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		// 학생정보 저장
		
		while(true)
		{
			System.out.print("이름입력 : ");
			String name = sc.next();
			System.out.print("성적입력 : ");
			int score = sc.nextInt();
			
			students.add(new student(name, score));

			if (students.size() == 3) {
				break;
			}
			// 학생정보 출력
			for (student x : students) {
				System.out.println(x.getName() + " : " + x.getName());
			}
		
	}

	}
}
