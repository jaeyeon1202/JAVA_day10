package problems;

import java.util.Scanner;

public class BoardService {
	
	private BoardDTO board;
	
	public BoardService() {
		System.out.println("기본생성자");
		board = new BoardDTO();
	}
	
	public void display() {
		Scanner input = new Scanner(System.in);
		String inputName, inputMemo;
		int choice;
		boolean check = true, check2=true;
		
		
		while(check) {
			System.out.println("\n*** 게시글 프로그램 ***");
			System.out.println("\n\n1.등록 2.조회 3.수정 4.삭제 5.종료");
			System.out.print("선택>>> ");
			choice = input.nextInt();
			
			switch(choice) {
			case 1://등록
				System.out.print("작성자 이름 입력: ");
				inputName=input.next();
				board.setName(inputName);
				System.out.print("게시글 내용 입력: ");
				inputMemo=input.next();
				board.setMemo(inputMemo);
				System.out.println("게시글이 등록되었습니다.");
				break;
			case 2://조회
				if(board.getName()==null) {
					System.out.println("게시글 등록 먼저 하십시오.");
					break;
				}
				while(check2) {
					System.out.print("조회할 게시글의 작성자 입력: ");
					inputName=input.next();
					if(inputName.equals(board.getName())) {
						System.out.println("\n조회한 게시글: "+board.getMemo());
						check2=false;
						break;
					}else {
						System.out.println("작성자의 이름이 틀렸습니다. 다시 입력하세요.");
						
					}
				}	

				break;
			case 3://수정
				if(board.getName()==null) {
					System.out.println("게시글 등록 먼저 하십시오.");
					break;
				}
				System.out.print("수정할 게시글의 작성자 입력: ");
				inputName=input.next();
				if(inputName.equals(board.getName())) {
					System.out.print("수정할 게시글 입력: ");
					inputMemo=input.next();
					board.setMemo(inputMemo);
					System.out.println("게시글이 수정되었습니다.");
				}
				break;
			case 4://삭제
				if(board.getName()==null) {
					System.out.println("게시글 등록 먼저 하십시오.");
					break;
				}
				System.out.print("삭제할 게시글의 작성자 입력: ");
				inputName=input.next();
				board.setMemo(null);
				System.out.println("게시글이 삭제되었습니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				check=false;
				break;
				default:
					System.out.println("다시입력");
			}
		}
	}
}
