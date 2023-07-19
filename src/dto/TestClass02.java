package dto;

import java.util.Scanner;

//기본 출력 및 연산 담당

public class TestClass02 {
	private TestDTO02 member;
	
	public TestClass02() {
		System.out.println("기본 생성자 실행");
		member = new TestDTO02();
	}
	
	public void display() {
		System.out.println(member);
		System.out.println("사용자로부터 모든 값 입력 받음");
		String n ="홍길동";
		int kor=100, eng=100, sum=kor+eng;
		
		member.setK(kor);member.setE(eng);
		member.setName(n); member.setSum(sum);
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.모든 내용 출력");
			System.out.println("2.이름만 수정");
			System.out.println(">>>: ");
			int num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("이름: "+member.getName());
				System.out.println("합계: "+member.getSum());
				break;
			case 2:
				System.out.println("수정 이름 입력: ");
				n=input.next();
				System.out.println(member.getName()+"=>"+n+" 변경 됨!");
				member.setName(n);
				break;
			}//switch
		}//while
	}//method
}//class
