package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		StudentService s = new StudentService();

		Scanner input = new Scanner(System.in);
		ArrayList<StudentDTO> info =new ArrayList<>();
		boolean check = true;
		String order, searchId;
		int count=0;
		boolean flag = false;

		while(check) {
			System.out.println("\n\n*** 학생정보 프로그램 ***");
			System.out.println("count: 학생수 입력\ninsert: 이름,주소,id,pw,국어,영어,수학 정보입력"
					+ "\nprint: 정보출력\nsearch: 정보검색\nmodify: 정보수정\nremove: 정보삭제\nevent: 이벤트\newit: 종료");
			System.out.print("명령어입력>>> ");
			order=input.next();
			
			switch(order){
			case "count":

		}//while

	}//main
}//class
}