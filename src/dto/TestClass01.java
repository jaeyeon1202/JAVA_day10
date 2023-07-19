package dto;
/*
 TestClass
 - 데이터를 저장 및 연산
 */
public class TestClass01 {
	private String name; //자동초기화 됨
	private int kor, eng, sum; //자동초기화 됨
	public TestClass01() {
		System.out.println(sum);
		System.out.println("기본 생성자 실행");
	}
	
	public void display() {
		name="홍길동";
		kor=100; eng=100; sum=kor+eng;
		System.out.println(name);
		System.out.println(sum);
	}
	
	public String getName() {
		return name;
	}
}
