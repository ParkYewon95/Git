package day07;

public class Test04 {

	public static void main(String[] args) {
	
		Animals f = new Fish("쿠피");
	
		f.breath(); //animal 타입으로 선언한 f
		((Fish)f).breath(); // fish로 다운캐스팅한 f
		
	}

}
