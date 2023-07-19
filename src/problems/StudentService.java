package problems;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentService {
	
	Scanner input = new Scanner(System.in);
	
	public void display() {
		
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
				System.out.print("정보를 등록할 학생 수 입력: ");
				count=input.nextInt();
				break;
				
			case "insert":
				if(count==0)
					System.out.println("학생 수를 먼저 입력해주세요.");
				for(int i=0; i<count; i++) {
					StudentDTO stu = new StudentDTO();
					System.out.print("이름 입력: ");
					stu.setName(input.next());
					System.out.print("주소 입력: ");
					stu.setAddr(input.next());
					System.out.print("id입력: ");
					stu.setId(input.next());
					System.out.print("pw입력: ");
					stu.setPw(input.next());
					System.out.print("국어점수 입력: ");
					stu.setKor(input.nextInt());
					System.out.print("영어점수 입력: ");
					stu.setEng(input.nextInt());
					System.out.print("수학점수 입력: ");
					stu.setMat(input.nextInt());
					info.add(stu);	
				}
				count=0;
				break;
			case "print": 
				if(info==null) {
					System.out.println("입력된 학생 정보가 없습니다.\n정보를 먼저 입력해주세요.");
					break;
				}
				for(int i=0; i<info.size();i++) {
					System.out.println("★"+info.get(i).getName()+"학생(ID)의 정보 ★");
					System.out.println("이름: "+info.get(i).getName());
					System.out.println("주소: "+info.get(i).getAddr());
					System.out.println("ID: "+info.get(i).getId());
					System.out.println("PW: "+info.get(i).getPw());
					System.out.println("국어점수: "+info.get(i).getKor());
					System.out.println("영어점수: "+info.get(i).getEng());
					System.out.println("수학점수: "+info.get(i).getMat());
					int sum = info.get(i).getKor()+info.get(i).getEng()+info.get(i).getMat();
					double avg = sum/3;
					System.out.println("총점: "+sum);
					System.out.println("평균: "+avg);
				}
				break;
				
			case "search": 
				if(info==null) {
					System.out.println("입력된 학생 정보가 없습니다.\n정보를 먼저 입력해주세요.");
					break;
				}
				System.out.print("검색할 아이디 입력: ");
				searchId=input.next();
				for(int i=0;i<info.size();i++) {
					if(searchId.equals(info.get(i).getId())) {
						System.out.println("★"+info.get(i).getName()+"학생(ID)의 정보 ★");
						System.out.println("이름: "+info.get(i).getName());
						System.out.println("주소: "+info.get(i).getAddr());//*
						System.out.println("ID: "+info.get(i).getId());
						System.out.println("PW: "+info.get(i).getPw());
						System.out.println("국어점수: "+info.get(i).getKor());
						System.out.println("영어점수: "+info.get(i).getEng());
						System.out.println("수학점수: "+info.get(i).getMat());
						int sum = info.get(i).getKor()+info.get(i).getEng()+info.get(i).getMat();
						double avg = sum/3;
						System.out.println("총점: "+sum);
						System.out.println("평균: "+avg);
						flag=true;
					}//if
				}//for
				if (flag == false) System.out.println("그런 학생은 없어.");
				break;
			case "modify": 
				if(info==null) {
					System.out.println("입력된 학생 정보가 없습니다.\n정보를 먼저 입력해주세요.");
					break;
				}
				System.out.print("검색할 아이디 입력: ");
				searchId=input.next();
				for(int i=0;i<info.size();i++) {
					if(searchId.equals(info.get(i).getId())) {
						System.out.print("이름 입력: ");
						info.get(i).setName(input.next());
						System.out.print("주소 입력: ");
						info.get(i).setAddr(input.next());
						System.out.print("id입력: ");
						info.get(i).setId(input.next());
						System.out.print("pw입력: ");
						info.get(i).setPw(input.next());
						System.out.print("국어점수 입력: ");
						info.get(i).setKor(input.nextInt());
						System.out.print("영어점수 입력: ");
						info.get(i).setEng(input.nextInt());
						System.out.print("수학점수 입력: ");
						info.get(i).setMat(input.nextInt());
						flag = true;
					}//if		
				}//for
				if (flag == false) System.out.println("그런 학생은 없어.");
				break;
			case "remove": 
				if(info==null) {
					System.out.println("입력된 학생 정보가 없습니다.\n정보를 먼저 입력해주세요.");
					break;
				}
				System.out.print("검색할 아이디 입력: ");
				searchId=input.next();
				for(int i=0; i<info.size();i++) {
					if(searchId.equals(info.get(i).getId())) {
						info.remove(i);
						System.out.println("정보가 삭제되었습니다.");
					}
				}
				break;
			case "event": 
				Random r = new Random();
				int event = r.nextInt(info.size());
				System.out.println(info.get(event).getName()+"학생은 이벤트에 당첨되었습니다!!");
				System.out.println("이름: "+info.get(event).getName());
				System.out.println("주소: "+info.get(event).getAddr());
				System.out.println("ID: "+info.get(event).getId());
				System.out.println("PW: "+info.get(event).getPw());
				System.out.println("국어점수: "+info.get(event).getKor());
				System.out.println("영어점수: "+info.get(event).getEng());
				System.out.println("수학점수: "+info.get(event).getMat());
				int sum = info.get(event).getKor()+info.get(event).getEng()+info.get(event).getMat();
				double avg = sum/3;
				System.out.println("총점: "+sum);
				System.out.println("평균: "+avg);
				
				int kor = (info.get(event).getKor() + 10) > 100 ? 100 : info.get(event).getKor()+10;
				int eng = (info.get(event).getEng()+10) > 100 ? 100 : info.get(event).getEng()+10;
				int mat = (info.get(event).getMat()+10) > 100 ? 100 : info.get(event).getMat()+10;
				
				System.out.println("-- 이벤트 반영 정보 --");
				System.out.println("이름: "+info.get(event).getName());
				System.out.println("주소: "+info.get(event).getAddr());
				System.out.println("ID: "+info.get(event).getId());
				System.out.println("PW: "+info.get(event).getPw());
				System.out.println("국어점수: "+kor);
				System.out.println("영어점수: "+eng);
				System.out.println("수학점수: "+mat);
				sum = kor+eng+mat;
				avg = sum/3;
				System.out.println("총점: "+sum);
				System.out.println("평균: "+avg);
				break;
			case "exit":
				System.out.println("프로그램을 종료합니다.");
				check=false;
				break;
			default:
				System.out.println("다시입력");
			}
			
		}//while
		
	}
	//============
	public int count(int count) {
		System.out.print("정보를 등록할 학생 수 입력: ");
		count=input.nextInt();
		return count;
	}
}
