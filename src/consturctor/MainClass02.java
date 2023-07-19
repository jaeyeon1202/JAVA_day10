package consturctor;
class TestClass02{
	private String officeName;

	public TestClass02(String office) {
		System.out.println("생성자 실행");
		officeName=office;
	}
	
	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
}
public class MainClass02 {

	public static void main(String[] args) {
		String msg = "나의 회사";
		TestClass02 t = new TestClass02(msg);
		//t.setOfficeName(msg);
		System.out.println("회사이름: "+t.getOfficeName());

	}

}
