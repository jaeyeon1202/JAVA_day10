package dto;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		LoginService03 login = new LoginService03();
		Scanner input = new Scanner(System.in);

		int choice;
		boolean check= true;
		String id, pwd;

		while(check) {
			System.out.println("\n\n*** 로그인 프로그램 ***");
			System.out.println("\n1.로그인 2.회원가입 3.탈퇴 4.종료");
			System.out.print("선택>> ");
			choice = input.nextInt();

			switch(choice) {
			case 1: login.login(); break;
			case 2: login.member(); break;
			case 3: login.out(); break;
			case 4: login.pOut(check);break;
				default:System.out.println("다시입력");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
