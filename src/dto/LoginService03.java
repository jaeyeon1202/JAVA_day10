package dto;

import java.util.Scanner;

import problems.TimeSeervice;

public class LoginService03 extends TimeSeervice{

	private LoginDTO03 member;
	private String id,pwd;
	private int idCheck=0;
	
	Scanner input = new Scanner(System.in);

	public LoginService03() {
		System.out.println("기본 생성자 실행");
		member=new LoginDTO03();
	}

	public void login() {
		System.out.print("로그인 아이디 입력: ");
		id=input.next();
		System.out.print("로그인 비밀번호 입력: ");
		pwd=input.next();
		idCheck++;

		if(member.getId()==null) {
			System.out.println("회원가입 먼저 하십시오.");
			return;
		}
		
		if(id.equals(member.getId()) && pwd.equals(member.getPwd())) 
			System.out.println("인증통과");
		else if(member.getId().equals(id)) 
			System.out.println("비번 틀림");
		else if(member.getPwd().equals(pwd)) 
			System.out.println("존재하지 않는 id");
		
		startTime();
	}
	
	public void member() {
		if(idCheck==0) {
			System.out.print("등록할 아이디 입력: ");
			id=input.next();
			member.setId(id);
			System.out.print("등록할 비밀번호 입력: ");
			pwd=input.next();
			member.setPwd(pwd);
		}else {
			System.out.println("사용자 존재함..탈퇴진행");
		}
	}
	
	public void out() {
		System.out.print("탈퇴할 아이디 입력: ");
		id=input.next();

		if(id.equals(member.getId())) {
			System.out.println("회원 탈퇴 되었습니다.");
			member.setId(null);
			member.setPwd(null);
		}else {
			System.out.println("등록값 없음. 회원가입 먼저 하세요");
		}
	}
	
	public void pOut(boolean check) {
		System.out.println("프로그램을 종료합니다.");
		endTime();
		System.out.println("총 이용시간 =>");
		totalTime();
		check=false;
	}
	

	

}//class
