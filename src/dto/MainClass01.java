package dto;
/*
 컨트롤러
 - 다른 클래스로 연동하는 역할
 */
public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.display();
		System.out.println(t.getName());
	}
}
