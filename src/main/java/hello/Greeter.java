package hello;

public class Greeter implements  Greet{
	public String sayHello() {	//구현힌 메소드
		return "안녕";
	}
	public String iam1() {  //추가한 커스텀 메소드
		return "한국 사람";
	}
}
