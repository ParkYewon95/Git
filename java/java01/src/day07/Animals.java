package day07;

public class Animals {
	
	String kind = "동물의 종류";
	
	public Animals() {
		super();//생략해도 자동 호출
	}
	
	public Animals(String kind) {
		super();
		this.kind = kind;
	}



	public void breath(){
		System.out.println("폐로 숨쉬기...");
	}
	
}
