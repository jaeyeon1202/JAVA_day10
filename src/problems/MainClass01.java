package problems;

import java.util.Scanner;

public class MainClass01 {

	public static void main(String[] args) {
		/*
		 1. 시작시간설정
		 2. 시작시간 확인(년월일시분초)
		 3. 종료시간설정
		 4. 종료시간 확인(년원일시분초)
		 5. 사용시간 가져오기 - ?시간 ?분 ?초
		 */
		boolean check = true;
		int choice;
		Scanner input = new Scanner(System.in);
		TimeSeervice tt = new TimeSeervice();
		
		while(check) {
			System.out.println("\n\n1.시작시간\n2.종료시간\n3.이용시간\n4.종료");
			System.out.print(">>> ");
			choice = input.nextInt();
			
			switch(choice) {
			case 1:
				tt.startTime(); break;
			case 2:
				tt.endTime(); break;
			case 3:
				tt.totalTime(); break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				check=false;
				break;
				default: System.out.println("다십입력");
			}
		}

	}

}
