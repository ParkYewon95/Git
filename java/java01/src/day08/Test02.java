package day08;

public class Test02 {
public static void main(String[] args) {
	SingleTone s1 = SingleTone.getInstance();
	SingleTone s2 = SingleTone.getInstance();
	

	System.out.println(s1);
	System.out.println(s2);
	}
}

final class SingleTone{
	private static SingleTone s = new SingleTone();
	
	private SingleTone() {
		System.out.println("SingleTone 생성");
	}

	public static SingleTone getInstance()	{
//		if(s == null) s = new SingleTone();
		return s;
	}

}
