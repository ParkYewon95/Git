package day07;

public class Dog extends Animals{

	String kind = "강아지 종류";
	String name;
	
	public Dog() {
		super();
	}
	
	public Dog(String kind, String name) {
		super("강아지");
		//super.kind = "강아지";
		
		this.kind = kind;
		this.name = name;
	}

	public String getSuperKind() {
		return super.kind;
	}


	public void print() {
		System.out.printf("[%s, %s, %s]%n",super.kind,kind,this.name);
		
	}
	
}
